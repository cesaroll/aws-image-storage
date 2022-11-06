import React, { useContext } from "react";
import { UserProfilesContext } from "../context/UserProfileContext";
import UserProfile from "./UserProfile";

const UserProfiles = (): JSX.Element => {
  const userProfilesContext = useContext(UserProfilesContext);
  const userProfiles = userProfilesContext?.userProfiles;

  return (
    <>
      {userProfiles?.map((userProfile, index) => {
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
