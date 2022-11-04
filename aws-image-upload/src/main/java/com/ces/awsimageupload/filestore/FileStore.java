package com.ces.awsimageupload.filestore;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FileStore {

  private final AmazonS3 s3;

  public void save(
    String path,
    String fileName,
    Optional<Map<String, String>> optionalMetadata,
    InputStream inputStream
  ) {
    var metadata = new ObjectMetadata();
    optionalMetadata.ifPresent(map -> {
      if (!map.isEmpty()) {
        map.forEach(metadata::addUserMetadata);
      }
    });

    try {
      s3.putObject(path, fileName, inputStream, metadata);
    } catch (AmazonServiceException e) {
      throw new IllegalStateException("Failed to store file to s3", e);
    }
  }
}
