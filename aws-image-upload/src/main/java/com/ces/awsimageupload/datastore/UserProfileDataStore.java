package com.ces.awsimageupload.datastore;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ces.awsimageupload.profile.UserProfile;

public interface UserProfileDataStore {
  List<UserProfile> getUserProfiles();
  Optional<UserProfile> getUserProfile(UUID id);
}
