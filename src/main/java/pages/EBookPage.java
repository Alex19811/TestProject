package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBookPage extends BasePage {

    public EBookPage(WebDriver driver) {
        super(driver);
    }

    WebElement title;

    public WebElement getTitle() {
        return title;
    }
    public WebElement getResultThatGoToEBooksPage() {
        driver.findElement(By.xpath("//span[@class='sidebar-item']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Ноутбуки та планшети')]")).click();
        driver.findElement(By.xpath("//div[@class='brand-box__title']//a[contains(text(),'Електронні книги')]")).click();
        return  title = driver.findElement(By.xpath("//div[@class='page-title page-title-category']"));
    }
    public String getResultThatGoToEBooksPageText(){
        return getResultThatGoToEBooksPage().getText();
    }
}
