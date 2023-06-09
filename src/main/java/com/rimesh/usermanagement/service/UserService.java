package com.rimesh.usermanagement.service;
import com.rimesh.usermanagement.model.User;
import java.util.List;


public interface UserService {
    User saveUser(User user);
    User getUser(Integer userId);

    List<User> getAllUser();
    User updateUser(User user, Integer userId);

    void deleteUser(Integer userId);



}
