package pageobject;

import model.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helper;

import static org.assertj.core.api.Assertions.assertThat;

public class SignInPage {
    private final String CREATE_ACCOUNT = "Create an account";

    @FindBy(css = "#email_create")
    private WebElement createEmailInput;

    @FindBy(css = "#email")
    private WebElement loginEmailInput;

    @FindBy(css = "#passwd")
    private WebElement passwdInput;

    private By pageSubheadingHeader = By.cssSelector("#create-account_form > h3");

    @FindBy(css = "#SubmitCreate")
    private WebElement createAccountButton;

    @FindBy(css = "#SubmitLogin")
    private WebElement submitLoginButton;

    private final WebDriver driver;

    private Helper helper = new Helper();

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createAccount(String email){
        assertThat(helper.waitForElement(pageSubheadingHeader, driver).getText().equals(CREATE_ACCOUNT));
        createEmailInput.sendKeys(email);
        createAccountButton.click();
    }

    public void loginToAccount(Customer customer){
        assertThat(helper.waitForElement(pageSubheadingHeader, driver).getText().equals(CREATE_ACCOUNT));
        loginEmailInput.sendKeys(customer.getEmail());
        passwdInput.sendKeys(customer.getPassword());
        submitLoginButton.click();
    }
}
