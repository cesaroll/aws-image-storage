package com.ces.awsimageupload.profile;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class UserProfile {
  private UUID id;
  private String name;
  private String imageLink;
}
