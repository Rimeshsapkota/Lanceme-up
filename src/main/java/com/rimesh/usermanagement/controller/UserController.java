/**
 * This class represents the controller for managing user operations.
 * It handles HTTP requests related to user management.
 */

package com.rimesh.usermanagement.controller;

import com.rimesh.usermanagement.model.User;
import com.rimesh.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * Adds a new user to the system.
     *
     * @param user The user object to be added.
     * @return The created user object.
     */
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public User addBook(@RequestBody User user) {
        return userService.saveUser(user);
    }

    /**
     * Retrieves all users from the system.
     *
     * @return A list of all users.
     */
    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    /**
     * Updates an existing user in the system.
     *
     * @param user   The updated user object.
     * @param userId The ID of the user to be updated.
     * @return The updated user object.
     */
    @PutMapping("update/{id}")
    public User editUser(@RequestBody User user, @PathVariable("id") Integer userId) {
        return userService.updateUser(user, userId);
    }

    /**
     * Deletes a user from the system.
     *
     * @param userId The ID of the user to be deleted.
     */
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Integer userId) {
        userService.deleteUser(userId);
    }
}
