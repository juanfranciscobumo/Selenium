package steps;

public interface SearchPage {
    void openUrl();
    void searchFor(String query);
    String getFirstResultTitle();
}
