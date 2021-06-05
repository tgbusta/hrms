package javareactcamp.humanResourceManagementSystem.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import javareactcamp.humanResourceManagementSystem.business.abstracts.CandidateService;
import javareactcamp.humanResourceManagementSystem.core.abstracts.CheckMernisService;
import javareactcamp.humanResourceManagementSystem.core.abstracts.EmailCheckService;
import javareactcamp.humanResourceManagementSystem.core.abstracts.SendEmailService;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.DataResult;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.ErrorResult;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;
import javareactcamp.humanResourceManagementSystem.dataAccess.abstracts.CandidateDao;
import javareactcamp.humanResourceManagementSystem.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    private CheckMernisService checkMernisService;
    private EmailCheckService emailCheckService;
    private SendEmailService sendEmailService;

    @Autowired
    public CandidateManager(
            CandidateDao candidateDao,
            @Qualifier("checkFakeMernisAdapter") CheckMernisService checkMernisService,
            EmailCheckService emailCheckService,
            @Qualifier("sendEmailManager") SendEmailService sendEmailService
    ) {
        super();
        this.candidateDao = candidateDao;
        this.checkMernisService = checkMernisService;
        this.emailCheckService = emailCheckService;
        this.sendEmailService = sendEmailService;
    }

	@Override
	public Result register(Candidate candidate, String passwordConfirm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

   

}