package javareactcamp.humanResourceManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javareactcamp.humanResourceManagementSystem.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
