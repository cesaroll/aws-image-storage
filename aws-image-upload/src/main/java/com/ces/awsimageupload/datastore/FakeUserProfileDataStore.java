package com.ces.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.ces.awsimageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore implements UserProfileDataStore {

  public static final List<UserProfile> USER_PROFILES = new ArrayList<>();

  static {
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "denise", ""));
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "jocelyn", ""));
  }

  @Override
  public List<UserProfile> getUserProfiles() {
    return USER_PROFILES;
  }
}
