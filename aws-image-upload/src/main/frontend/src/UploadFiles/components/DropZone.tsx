import { useCallback } from "react";
import { useDropzone } from "react-dropzone";
import { uploadUserProfileImage } from "../../UserProfiles/services/UserProfileService";
import { UserProfileInterface } from "../../UserProfiles/types/UserProfileInterface";

const DropZone = ({ id }: UserProfileInterface) => {
  const onDrop = useCallback(async (acceptedFiles: File[]) => {
    const file = acceptedFiles[0];
    console.log(file);

    const formData = new FormData();
    formData.append("file", file);
    await uploadUserProfileImage(id, formData);
  }, []);

  const { getRootProps, getInputProps, isDragActive } = useDropzone({ onDrop });

  return (
    <div {...getRootProps()}>
      <input {...getInputProps()} />
      {isDragActive ? (
        <p>Drop the image here ...</p>
      ) : (
        <p>
          Drag and drop profile image here, or click to select profile image
        </p>
      )}
    </div>
  );
};

export default DropZone;
