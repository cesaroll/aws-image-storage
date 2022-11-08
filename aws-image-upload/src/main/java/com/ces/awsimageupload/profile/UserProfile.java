package com.ces.awsimageupload.profile;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
public class UserProfile {
  private final UUID id;
  private final String name;
  private String imageLink;
}
