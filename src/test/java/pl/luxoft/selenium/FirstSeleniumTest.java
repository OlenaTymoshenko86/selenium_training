package pl.luxoft.selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.Luxoft.Selenium.PageObjects.EtsyComMainPO;
import pl.Luxoft.Selenium.PageObjects.SearchResultsPO;

public class FirstSeleniumTest extends ParentTestSelenium {

    @Test
    public void openChromeWebdriverTest(){
        String searchQuery = "leather bag";
        EtsyComMainPO etsyCom = new EtsyComMainPO(driver);
        SearchResultsPO etsyResults = new SearchResultsPO(driver);
        etsyCom.goTo()
                .acceptPrivacyPolicy()
                .searchFor(searchQuery)
                .pickFirstItemSuggestionsList();
        String SearchResultsPageHeader = etsyResults.getResultsHeader();
        Assert.assertTrue(SearchResultsPageHeader.contains(searchQuery));
    }

}
