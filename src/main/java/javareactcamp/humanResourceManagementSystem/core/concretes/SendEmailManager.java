package javareactcamp.humanResourceManagementSystem.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javareactcamp.humanResourceManagementSystem.core.abstracts.SendEmailService;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;
import javareactcamp.humanResourceManagementSystem.core.utilities.result.SuccessResult;

@Primary
@Component(value = "sendEmailManager")
public class SendEmailManager implements SendEmailService {
    private JavaMailSender emailSender;

    @Autowired
    public SendEmailManager(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public Result sendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
        return new SuccessResult("Email Gönderimi Başarılı...");
    }
}