package Week4.StringAndRegex.Pack4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX =   "^[ACP]\\d{4}[G-M]$";

    public ClassName() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
