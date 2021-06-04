package javareactcamp.humanResourceManagementSystem.business.abstracts;

import java.util.List;

import javareactcamp.humanResourceManagementSystem.core.utilities.result.DataResult;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;
import javareactcamp.humanResourceManagementSystem.entities.concretes.Candidate;

public interface CandidateService {

	Result register(Candidate candidate, String passwordConfirm);
    DataResult<List<Candidate>> getAll();
	
}
