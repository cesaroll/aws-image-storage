package com.ces.awsimageupload.bucket;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BucketName {
  PROFILE_IMAGE("ces-image-storage-123");

  private final String bucketName;
}
