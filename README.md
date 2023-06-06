## user-management
## Package: com.rimesh.usermanagement.service

Imports:
## com.rimesh.usermanagement.model.User: Importing the User model class.
## java.util.List: Importing the List interface.
## Interface: UserService

Methods:
## saveUser(User user)
Description: Saves a user in the user management system.
Parameters:
user: An object of the User class representing the user to be saved.
Return Type: User
Returns the saved user object.

## getAllUser()
Description: Retrieves all users from the user management system.
Return Type: List<User>
Returns a list of User objects representing all the users.

## updateUser(User user, Integer userId)
Description: Updates a user in the user management system with the provided user ID.
Parameters:
user: An object of the User class representing the updated user information.
userId: An Integer value representing the ID of the user to be updated.
Return Type: User
Returns the updated user object.

## deleteUser(Integer userId)
Description: Deletes a user from the user management system with the provided user ID.
Parameters:
userId: An Integer value representing the ID of the user to be deleted.
Return Type: void
Does not return any value.
