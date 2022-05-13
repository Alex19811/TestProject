package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SamsungGalaxyPage extends BasePage{


    private static final String SEARCH_INPUT = "//input[@id='input_search']";
    private static final String SEARCH_KEYWORD_SAMSUNG = "Samsung Galaxy S22";
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";
    private static final String SEARCH_PRODUCTS_IN_STOCK = "//button[@class='button-reset search-btn']";
    private static final String SEARCH_RESULT_PRODUCTS_LIST_IN_STOCK = "//span[@class='prod-cart__article']";

    public SamsungGalaxyPage (WebDriver driver) {
        super(driver);
    }

    public void SearchSamsungGalaxyPageOnlyProductsInStock() {
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(SEARCH_KEYWORD_SAMSUNG);
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(SEARCH_PRODUCTS_IN_STOCK));
    }

    public List<WebElement> getSearchResultListOnlyProductsInStock() {
    return driver.findElements(By.xpath(SEARCH_RESULT_PRODUCTS_LIST_IN_STOCK));
    }

    public int getSearchResultSize() {
        return getSearchResultListOnlyProductsInStock().size();
    }
}
