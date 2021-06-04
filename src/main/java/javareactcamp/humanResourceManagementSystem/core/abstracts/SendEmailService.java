package javareactcamp.humanResourceManagementSystem.core.abstracts;

import javareactcamp.humanResourceManagementSystem.core.utilities.result.Result;

public interface SendEmailService {
    Result sendSimpleMessage(String to, String subject, String text);
}
