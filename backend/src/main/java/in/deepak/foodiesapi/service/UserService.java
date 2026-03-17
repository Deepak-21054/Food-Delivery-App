package in.deepak.foodiesapi.service;

import in.deepak.foodiesapi.io.UserRequest;
import in.deepak.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
