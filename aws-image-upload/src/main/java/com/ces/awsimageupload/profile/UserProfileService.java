package com.ces.awsimageupload.profile;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserProfileService {

  private final UserProfileRepository userProfileRepository;

  List<UserProfile> getUserProfiles() {
    return userProfileRepository.getUserProfiles();
  }

  public void uploadUserProfileIMage(UUID id, MultipartFile file) {
    throw new UnsupportedOperationException();
    // 1. Check if image is not empty
    // 2. If file is an image
    // 3. The user exist in our DB
    // 4. grab some metadata from file if any
    // 5. Store image in S3
    // 6. Update DB with S3, image and Link
  }

}
