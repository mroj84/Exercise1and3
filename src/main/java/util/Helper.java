package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

public class Helper {

    public WebElement waitForElement(By locator, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public WebElement waitForNestedElement(WebElement element, By locator, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, locator));
        return driver.findElement(locator);
    }

    public void selectByValue(WebElement element, String value, WebDriver driver){
        Select select = new Select(element);
        waitForNestedElement(element,By.cssSelector("option[value='"+ value +"']"),driver);
        select.selectByValue(value);
    }

    public void selectByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
}
