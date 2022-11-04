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
  }

}
