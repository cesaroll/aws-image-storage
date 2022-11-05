import React, { useEffect, useState } from "react";
import "./App.css";
import { getUserProfiles } from "./UserProfiles/services/UserProfileService";
import { UserProfileInterface } from "./UserProfiles/types/UserProfileInterface";

interface UserProfilesParms {
  userProfiles: UserProfileInterface[];
}

const UserProfiles = ({ userProfiles }: UserProfilesParms): JSX.Element => {
  return <h1>Length: {userProfiles?.length}</h1>;
};

function App() {
  const [userProfiles, setUserProfiles] = useState<UserProfileInterface[]>([]);

  const fetchUserProfiles = async () => {
    const items = await getUserProfiles();
    setUserProfiles(items);
  };

  useEffect(() => {
    fetchUserProfiles();
  }, []);

  return (
    <div className="App">
      <UserProfiles userProfiles={userProfiles}></UserProfiles>
    </div>
  );
}

export default App;
