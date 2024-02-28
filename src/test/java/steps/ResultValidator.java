package steps;

public class ResultValidator {
    public static boolean isResultValid(String resultText, String expectedText) {
        return resultText.contains(expectedText);
    }
}
