package javareactcamp.humanResourceManagementSystem.business.concretes;

import java.util.Objects;

import javareactcamp.humanResourceManagementSystem.core.utilities.result.ErrorResult;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.SuccessResult;
import javareactcamp.humanResourceManagementSystem.entities.concretes.Candidate;

public class CandidateValidator {

    public static Result validatorForCandidate(Candidate candidate){

        if(Objects.isNull(candidate.getFirstName())){
            return new ErrorResult("İsim alanı boş bırakılamaz.");
        }else if(Objects.isNull(candidate.getLastName())){
            return new ErrorResult("Soyisim alanı boş bırakılamaz.");
        }else if(Objects.isNull(candidate.getEmail())) {
            return new ErrorResult("E-mail alanı boş bırakılamaz.");
        }else if(Objects.isNull(candidate.getIdentityNumber())) {
            return new ErrorResult("Kimlik Numarası alanı boş bırakılamaz.");
        }else if(Objects.isNull(candidate.getBirthYear())) {
            return new ErrorResult("Doğum Tarihi alanı boş bırakılamaz.");
        }else if(Objects.isNull(candidate.getPassword())) {
            return new ErrorResult("Şifre alanı boş bırakılamaz.");
        }
        return new SuccessResult();
    }
}