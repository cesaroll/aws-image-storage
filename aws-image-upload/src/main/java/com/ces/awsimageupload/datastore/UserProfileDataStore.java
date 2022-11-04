/*
 * @author: Cesar Lopez
 * @copyright 2022 Wayfair LLC - All rights reserved
 */
package com.ces.awsimageupload.datastore;

import java.util.List;

import com.ces.awsimageupload.profile.UserProfile;

public interface UserProfileDataStore {
  List<UserProfile> getUserProfiles();
}
