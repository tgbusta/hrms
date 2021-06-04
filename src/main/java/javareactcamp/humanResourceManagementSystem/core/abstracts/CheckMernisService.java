package javareactcamp.humanResourceManagementSystem.core.abstracts;

import javareactcamp.humanResourceManagementSystem.entities.concretes.Candidate;

public interface CheckMernisService {

    boolean checkIfRealPerson(Candidate candidate);

}