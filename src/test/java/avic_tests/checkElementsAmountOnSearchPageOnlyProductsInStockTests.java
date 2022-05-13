package avic_tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class checkElementsAmountOnSearchPageOnlyProductsInStockTests extends BaseTest {

    @Test
    private void checkThatSearchResultsContainsSearchWord() {
        getSamsungGalaxyPage().SearchSamsungGalaxyPageOnlyProductsInStock();
        assertEquals(getSamsungGalaxyPage().getSearchResultSize(), 12);
    }
}
