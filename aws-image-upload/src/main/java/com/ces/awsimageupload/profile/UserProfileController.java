package com.ces.awsimageupload.profile;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/user-profile")
@AllArgsConstructor
public class UserProfileController {

  private final UserProfileService userProfileService;

  @GetMapping
  public List<UserProfile> getUserProfiles() {
    return userProfileService.getUserProfiles();
  }
}
