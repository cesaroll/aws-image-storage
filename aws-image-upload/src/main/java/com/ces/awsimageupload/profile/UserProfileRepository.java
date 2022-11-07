package com.ces.awsimageupload.profile;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;
import com.ces.awsimageupload.datastore.UserProfileDataStore;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class UserProfileRepository {

  private final UserProfileDataStore userProfileDataStore;

  public List<UserProfile> getUserProfiles() {
    return userProfileDataStore.getUserProfiles();
  }

  public UserProfile getuserProfile(UUID id) {
    return userProfileDataStore
      .getUserProfile(id)
      .orElseThrow(
        () -> new IllegalStateException(String.format("User profile %s not found", id))
    );
  }

}
