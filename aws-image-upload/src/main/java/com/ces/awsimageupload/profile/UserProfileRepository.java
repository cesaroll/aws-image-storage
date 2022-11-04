package com.ces.awsimageupload.profile;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ces.awsimageupload.datastore.UserProfileDataStore;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class UserProfileRepository {

  private final UserProfileDataStore userProfileDataStore;

  List<UserProfile> getUserProfiles() {
    return userProfileDataStore.getUserProfiles();
  }
}
