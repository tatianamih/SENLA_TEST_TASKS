package senla.mikhalchenko.task6.console;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");
    private Validator() {
    }

    private static Matcher matcher;

    public static boolean isNumber(String answer) {
        matcher = NUMBER_PATTERN.matcher(answer);
        return matcher.matches();
    }
}
