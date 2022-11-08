import React from "react";
import DropZone from "../../UploadFiles/components/DropZone";
import { UserProfileInterface } from "../types/UserProfileInterface";

interface UserProfileParms {
  userProfile: UserProfileInterface;
}

const UserProfile = ({ userProfile }: UserProfileParms) => {
  return (
    <>
      <br />
      {userProfile.id && (
        <img
          src={`http://localhost:8080/api/v1/user-profile/${userProfile.id}/image/download`}
          alt=""
        />
      )}
      <br />
      <h2>{userProfile.name}</h2>
      <p>{userProfile.id}</p>
      <DropZone {...userProfile} />
      <br />
    </>
  );
};

export default UserProfile;
