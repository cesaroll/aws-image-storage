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
  private UUID id;
  private String name;
  private String imageLink;
}
