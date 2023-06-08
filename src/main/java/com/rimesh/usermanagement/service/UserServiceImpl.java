/**
 * The UserServiceImpl class is an implementation of the UserService interface.
 * It provides methods for performing CRUD (Create, Read, Update, Delete) operations on User objects.
 */
package com.rimesh.usermanagement.service;

import com.rimesh.usermanagement.model.User;
import com.rimesh.usermanagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public  UserRepo userRepo;

    /**
     * Saves a user object in the repository.
     *
     * @param user The user object to be saved.
     * @return The saved user object.
     */
    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public User getUser(Integer userId) {
        User user = userRepo.findByUserId(userId);
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }


    /**
     * Retrieves a list of all user objects from the repository.
     *
     * @return A list of all user objects.
     */

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    /**
     * Updates an existing user object in the repository.
     *
     * @param user   The updated user object.
     * @param userId The ID of the user to be updated.
     * @return The updated user object.
     * If no user with the given ID is found, returns null.
     */
    @Override
    public User updateUser(User user, Integer userId) {
        User existingUser = userRepo.findById(userId).orElse(null);
        if (existingUser != null) {
            user.setUserId(userId);
            return userRepo.save(user);
        } else {
            return null;
        }
    }

    /**
     * Deletes a user object from the repository.
     *
     * @param userId The ID of the user to be deleted.
     */
    @Override
    public void deleteUser(Integer userId) {
        userRepo.deleteById(userId);
    }
}

