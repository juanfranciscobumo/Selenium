package steps;

public class TestResultPrinter {
    public static void printResult(boolean isPassed) {
        if (isPassed) {
            System.out.println("TEST PASSED");
            // Podría incluir arte ASCII o algún otro formato especial
        } else {
            System.out.println("TEST FAILED");
            // Podría incluir arte ASCII o algún otro formato especial
        }
    }
}
