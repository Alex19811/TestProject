package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultThatGoToEBooksPageTests extends BaseTest {
    private static final String EXPECTED_CONTAINS_EBOOK = "Електронні книги";

    @Test
    public void checkOutThatGoToEBooksPage() {
        getEBookPage().getResultThatGoToEBooksPage();
        Assert.assertTrue(getEBookPage().getResultThatGoToEBooksPageText().contains(EXPECTED_CONTAINS_EBOOK));
    }
}


