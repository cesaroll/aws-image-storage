package com.ces.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.ces.awsimageupload.profile.UserProfile;
import lombok.Getter;

@Getter
@Repository
public class UserProfileDataStore {

  public static final List<UserProfile> USER_PROFILES = new ArrayList<>();

  static {
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "denise", null));
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "jocelyn", null));
  }
}
