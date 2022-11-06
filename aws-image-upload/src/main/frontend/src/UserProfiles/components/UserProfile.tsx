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
      <h2>{userProfile.name}</h2>
      <p>{userProfile.id}</p>
      <DropZone {...userProfile} />
      <br />
    </>
  );
};

export default UserProfile;
