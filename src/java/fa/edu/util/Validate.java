package fa.edu.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static final String PHONE_REGEX = "\\d{9,11}";
    private static Pattern patternEmail;
    private static Pattern patternPhone;
    private static Matcher matcher;

    static {
        patternEmail = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        patternPhone = Pattern.compile(PHONE_REGEX, Pattern.CASE_INSENSITIVE);
    }

    public static boolean validateEmail(String email) {
        matcher = patternEmail.matcher(email);
        return matcher.matches();
    }

    public static boolean validatePhone(String phone) {
        matcher = patternPhone.matcher(phone);
        return matcher.matches();
    }
}
