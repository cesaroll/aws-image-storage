import { useCallback } from "react";
import { useDropzone } from "react-dropzone";

const DropZone = () => {
  const onDrop = useCallback((acceptedFiles: File[]) => {
    const file = acceptedFiles[0];
    console.log(file);
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
