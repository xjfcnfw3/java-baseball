package baseball.user.validation;

public class UserValidation {

    private static final int NUMBER_LENGTH = 3;
    private static final String NUMBER_REGEXP = "^[0-9]+$";

    public static void validate(String userInput) {
        validateOnlyNumber(userInput);
    }

    public static void validateOnlyNumber(String userInput) {
        if (!userInput.matches(NUMBER_REGEXP)) {
            throw new IllegalArgumentException(ExceptionMessage.ONLY_NUMBER);
        }
    }
}