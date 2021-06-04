package javareactcamp.humanResourceManagementSystem.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javareactcamp.humanResourceManagementSystem.core.abstracts.SendEmailService;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.SuccessResult;

@Component(value = "fakeEmailManager")
public class FakeEmailManager implements SendEmailService {

    @Autowired
    public FakeEmailManager() {
    }

    @Override
    public Result sendSimpleMessage(String to, String subject, String mailBodyMessage) {

        String mailTo = to;
        String mailSubject = subject;
        String mailText = mailBodyMessage;

        System.out.println(String.format("Kime : %s \nKonu başlığı %s. \nMail Gövdesi: %s",to,subject,mailBodyMessage));
        return new SuccessResult();
    }
}