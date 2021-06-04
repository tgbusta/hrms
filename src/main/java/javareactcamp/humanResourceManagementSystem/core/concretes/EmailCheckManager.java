package javareactcamp.humanResourceManagementSystem.core.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import javareactcamp.humanResourceManagementSystem.core.abstracts.EmailCheckService;

@Service
public class EmailCheckManager implements EmailCheckService {
    private static final String email_regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

    @Override
    public boolean emailCheck(String email) {
        Pattern pattern = Pattern.compile(email_regex,Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email).find();
    }
}