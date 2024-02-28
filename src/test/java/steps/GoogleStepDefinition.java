package steps;

public class GoogleStepDefinition {

    public static void main(String[] ar) {
        ChromeDriverConfigurator chrome = new ChromeDriverConfigurator();
        DriverManager driver = new DriverManager(chrome);
        GoogleSearchPage page = new GoogleSearchPage(driver.initDriver());
        page.openUrl();
        page.searchFor("Fútbol");
        String firstResultTitle = page.getFirstResultTitle();
        TestResultPrinter.printResult(ResultValidator.isResultValid(firstResultTitle, "Fútbol"));
        driver.quitDriver();
    }
}
