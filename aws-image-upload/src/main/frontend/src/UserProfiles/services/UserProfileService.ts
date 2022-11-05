import axios from "axios";
import { UserProfileInterface } from "../types/UserProfileInterface";

interface GetUserProfileResponse {
  data: UserProfileInterface;
}

export const fetchUserProfiles = () => {
  axios
    .get<GetUserProfileResponse>("http://localhost:8080/api/v1/user-profile", {
      headers: {
        Accept: "application/json",
      },
    })
    .then((res) => {
      console.log(JSON.stringify(res.data, null, 4));
    });
};
