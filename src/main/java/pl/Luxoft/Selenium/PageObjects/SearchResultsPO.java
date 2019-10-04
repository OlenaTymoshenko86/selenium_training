package pl.Luxoft.Selenium.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPO extends BasePO{

    final By SEARCH_TABLE_RESULTS_HEADER = By.cssSelector(" div .search-listings-group H1");

    public SearchResultsPO(WebDriver driver) {
        super(driver);
    }

    public String getResultsHeader(){
            return findElementWithWait(SEARCH_TABLE_RESULTS_HEADER).getText().toLowerCase();
        }
}
