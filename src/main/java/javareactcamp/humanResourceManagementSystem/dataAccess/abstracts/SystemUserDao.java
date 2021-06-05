package javareactcamp.humanResourceManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javareactcamp.humanResourceManagementSystem.entities.concretes.SystemUser;

@Repository
public interface SystemUserDao extends JpaRepository<SystemUser, Integer> {
	boolean existsSystemUserByNationalityId(String nationalityId);
	boolean existsSystemUserByEmail(String email);
}