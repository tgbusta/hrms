package javareactcamp.humanResourceManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javareactcamp.humanResourceManagementSystem.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	boolean existsCandidateByNationalityId(String nationalityId);

	boolean existsCandidateByEmail(String email);
}
