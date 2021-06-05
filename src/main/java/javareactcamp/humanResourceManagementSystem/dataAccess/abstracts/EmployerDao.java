package javareactcamp.humanResourceManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javareactcamp.humanResourceManagementSystem.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {
	boolean existsEmployerByEmail(String email);
}