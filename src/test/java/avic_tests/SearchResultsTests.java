package avic_tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "Samsung Galaxy";
    private static final String EXPECTED_CONTAINS = "Samsung Galaxy";


    @Test(priority = 4)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        for (WebElement webElement : getSearchResultsPage().getSearchResultList()) {
            Assert.assertTrue(webElement.getText().contains(EXPECTED_CONTAINS));
        }
    }
}
