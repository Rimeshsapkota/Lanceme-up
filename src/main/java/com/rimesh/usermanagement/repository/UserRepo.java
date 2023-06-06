/**

 This interface represents the repository for User entities in the user management system.
 It provides CRUD operations for managing User objects in the database.
 */
package com.rimesh.usermanagement.repository;
import com.rimesh.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User , Integer> {
}
