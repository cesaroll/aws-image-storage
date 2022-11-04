package com.ces.awsimageupload.profile;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserProfileService {

  private final UserProfileRepository userProfileRepository;

  List<UserProfile> getUserProfiles() {
    return userProfileRepository.getUserProfiles();
  }

}
