import React from "react";
import { UserProfileInterface } from "../types/UserProfileInterface";

interface UserProfileParms {
  userProfile: UserProfileInterface;
}

const UserProfile = ({ userProfile }: UserProfileParms) => {
  return (
    <>
      <h2>{userProfile.name}</h2>
      <p>{userProfile.id}</p>
    </>
  );
};

export default UserProfile;
