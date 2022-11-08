package com.ces.awsimageupload.profile;

import static org.apache.http.entity.ContentType.IMAGE_JPEG;
import static org.apache.http.entity.ContentType.IMAGE_GIF;
import static org.apache.http.entity.ContentType.IMAGE_PNG;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ces.awsimageupload.bucket.BucketName;
import com.ces.awsimageupload.filestore.FileStore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserProfileService {

  private final UserProfileRepository userProfileRepository;
  private final FileStore fileStore;

  List<UserProfile> getUserProfiles() {
    return userProfileRepository.getUserProfiles();
  }

  public void uploadUserProfileImage(UUID id, MultipartFile file) {
    // 1. Check if image is not empty
    isFileEmpty(file);

    // 2. If file is an image
    isImage(file);

    // 3. The user exist in our DB
    var userProfile = userProfileRepository.getuserProfile(id);

    // 4. grab some metadata from file if any
    Map<String, String> metaData = extractMetadata(file);

    // 5. Store image in S3 and Update DB with S3, image and Link
    var path = getPath(userProfile);
    var fileName = String .format("%s-%s", file.getOriginalFilename(), UUID.randomUUID());

    try {
      fileStore.save(path, fileName, Optional.of(metaData), file.getInputStream());
      userProfile.setImageLink(Optional.of(fileName));
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  public byte[] downloadUserProfileImage(UUID id) {
    var userProfile = userProfileRepository.getuserProfile(id);
    var path = getPath(userProfile);
    return userProfile.getImageLink()
      .map(key -> fileStore.download(path, key))
      .orElse(new byte[0]);
  }

  private String getPath(UserProfile userProfile) {
    return String.format("%s/%s", BucketName.PROFILE_IMAGE.getBucketName(), userProfile.getId());
  }

  private Map<String, String> extractMetadata(MultipartFile file) {
    Map<String, String> metaData = new HashMap<>();
    metaData.put("Content-Type", file.getContentType());
    metaData.put("Content-Lenght", String.valueOf(file.getSize()));
    return metaData;
  }

  private void isImage(MultipartFile file) {
    if (!Arrays.asList(
      IMAGE_GIF.getMimeType(),
      IMAGE_JPEG.getMimeType(),
      IMAGE_PNG.getMimeType()
      ).contains(file.getContentType())) {
      throw new IllegalStateException("File must be an image");
    }
  }

  private void isFileEmpty(MultipartFile file) {
    if (file.isEmpty()) {
      throw new IllegalStateException("Cannot upload empty file: [" + file.getSize() + "]");
    }
  }
}
