package ca.on.gov.common.regex;

import java.util.regex.Pattern;

public interface RegexComp {
    public static final String EMAIL_ADDRESS = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    public static final Pattern EMAIL_ADDRESS_REGEX = Pattern.compile(EMAIL_ADDRESS,
            Pattern.CASE_INSENSITIVE);
    
    public static final Pattern HC_REGEX_1 = Pattern.compile("^[1-9][0-9]{9}$",
            Pattern.CASE_INSENSITIVE);
    
    public static final Pattern HC_REGEX_2 = Pattern.compile("^[A-Z]{1,2}$",
            Pattern.CASE_INSENSITIVE);
    
    public static final Pattern HC_SECURITY_REGEX = Pattern.compile("^[n-zN-Z]{1}[a-zA-Z]{1}\\d{7}$",
            Pattern.CASE_INSENSITIVE);

    public static final Pattern DL_SECURITY_REGEX = Pattern.compile("^\\d{7}$",
            Pattern.CASE_INSENSITIVE);

    public static final String POSTAL_CODE = "[ABCEGHJKLMNPRSTVXY][0-9][ABCEGHJKLMNPRSTVWXYZ][0-9][ABCEGHJKLMNPRSTVWXYZ][0-9]";
    public static final Pattern POSTAL_CODE_REGEX = Pattern.compile(POSTAL_CODE,
            Pattern.CASE_INSENSITIVE);
    
    public boolean email(String input);

    public boolean healthCard1(String input);

    public boolean healthCard2(String input);
}
