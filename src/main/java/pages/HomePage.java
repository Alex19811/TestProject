package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    private static final String SEARCH_INPUT = "//input[@id='input_search']";
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";
    private static final String SEARCH_PRODUCTS_CATALOG = "//span[@class='sidebar-item']";
    private static final String SEARCH_GAGETS = "//span[contains(text(),'Гаджети')]";
    private static final String SEARCH_QUADROCOPTERS = "//div[@class='brand-box__title']//a[contains(text(),'Квадрокоптери')]";
    private static final String SEARCH_Add_TO_CART = "//a[contains(@data-ecomm-cart,'237694')]";
    private static final String PRICE = "//div[@class ='total-h']//span[@class ='prise']";
    private static final String TOTAL_PRICE = "//div[@class ='item-total']//span[@class ='prise']";



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    public String getPrice() {
        return price;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    String price;
    String totalPrice;

    public void productsСatalog() {
        driver.findElement(By.xpath(SEARCH_PRODUCTS_CATALOG)).click();
        driver.findElement(By.xpath(SEARCH_GAGETS)).click();
        driver.findElement(By.xpath(SEARCH_QUADROCOPTERS)).click();
        driver.findElement(By.xpath(SEARCH_Add_TO_CART)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        price = driver.findElement(By.xpath(PRICE)).getText();
        totalPrice = driver.findElement(By.xpath(TOTAL_PRICE)).getText();
    }
}
