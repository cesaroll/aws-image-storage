package com.ces.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.ces.awsimageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore implements UserProfileDataStore {

  public static final List<UserProfile> USER_PROFILES = new ArrayList<>();

  static {
    USER_PROFILES.add(new UserProfile(UUID.fromString("7c9110f7-3d6e-4025-b171-35e48398ae0e"), "denise", null));
    USER_PROFILES.add(new UserProfile(UUID.fromString("6b433dbc-36e8-4ada-8de3-dc9ccd301266"), "jocelyn", null));
  }

  @Override
  public List<UserProfile> getUserProfiles() {
    return USER_PROFILES;
  }

  @Override
  public Optional<UserProfile> getUserProfile(UUID id) {
    return USER_PROFILES.stream()
      .filter(userProfile -> userProfile.getId().equals(id))
      .findFirst();
  }
}
