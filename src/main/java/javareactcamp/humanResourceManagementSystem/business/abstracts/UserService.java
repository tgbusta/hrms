package javareactcamp.humanResourceManagementSystem.business.abstracts;

import java.util.List;

import javareactcamp.humanResourceManagementSystem.core.utilities.result.DataResult;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;
import javareactcamp.humanResourceManagementSystem.entities.abstracts.User;

public interface UserService {

	 DataResult<List<User>> getAll();

	    Result add(User user);

	    boolean existsByEmail(String email);

	    User getByEmail(String email);
	
}
