import axios from "axios";
import { UserProfileInterface } from "../types/UserProfileInterface";

export const getUserProfiles = async (): Promise<UserProfileInterface[]> => {
  const { data, status } = await axios.get<UserProfileInterface[]>(
    "http://localhost:8080/api/v1/user-profile",
    {
      headers: {
        Accept: "application/json",
      },
    }
  );

  // console.log("response status is: ", status);
  // console.log(JSON.stringify(data, null, 4));

  return data;
};
