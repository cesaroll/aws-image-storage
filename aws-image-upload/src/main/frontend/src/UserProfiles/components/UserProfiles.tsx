import React from "react";
import { UserProfileInterface } from "../types/UserProfileInterface";
import UserProfile from "./UserProfile";

interface UserProfilesParms {
  userProfiles: UserProfileInterface[];
}

const UserProfiles = ({ userProfiles }: UserProfilesParms): JSX.Element => {
  return (
    <>
      <h1>Length: {userProfiles?.length}</h1>
      {userProfiles.map((userProfile, index) => {
        return (
          <div key={index}>
            <UserProfile userProfile={userProfile}></UserProfile>
          </div>
        );
      })}
    </>
  );
};

export default UserProfiles;
