package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helper;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuPage {
    @FindBy(css = ".header_user_info > .login")
    private WebElement signInButton;

    @FindBy(css = "#search_query_top")
    private WebElement searchInput;

    @FindBy(css = "button.btn.btn-default.button-search")
    private WebElement searchButton;


    private By logoutButtonSelector = By.cssSelector(".header_user_info > .logout");

    public MenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final WebDriver driver;

    private Helper helper = new Helper();

    public void navigateToMainPage() {
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    public void goToSignInPage() {
        signInButton.click();
    }

    public boolean isCustomerLogged() {
        return driver.findElements(logoutButtonSelector).size() > 0;
    }

    public void searchForProduct(String product) {
        navigateToMainPage();
        searchInput.sendKeys(product);
        searchButton.click();
    }

    public void verifyProductFound(String product) {
        assertThat(driver.findElements(By.cssSelector("a[title='" + product + "']")));
    }
}
