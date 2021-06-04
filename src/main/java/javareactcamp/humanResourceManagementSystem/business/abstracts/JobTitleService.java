package javareactcamp.humanResourceManagementSystem.business.abstracts;

import java.util.List;

import javareactcamp.humanResourceManagementSystem.core.utilities.result.DataResult;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;
import javareactcamp.humanResourceManagementSystem.entities.concretes.JobTitle;

public interface JobTitleService {

	DataResult<List<JobTitle>> getAll();

	Result add(JobTitle jobTitle);

}
