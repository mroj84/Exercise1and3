package steps;

import enums.DriverType;
import enums.State;


import io.cucumber.java.After;
import io.cucumber.java.en.*;
import model.Customer;
import org.openqa.selenium.WebDriver;
import pageobject.AccountCreationPage;
import pageobject.MenuPage;
import pageobject.SignInPage;
import util.StringUtil;
import wdm.GridDriverManager;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerRegisterSteps extends BaseSteps{

    private Customer newCustomer;


    @Given("^I open firefoxbrowser$")
    public void open_new_Firefox_browser() throws Throwable
    {
        driver = manager.getDriver(DriverType.FIREFOX);
    }

    @Given("^I open chromebrowser$")
    public void open_new_Chrome_browser() throws Throwable
    {
        driver = manager.getDriver(DriverType.CHROME);
    }

    @Given("^I am a new customer$")
    public void new_customer() throws Throwable
    {
        newCustomer = new Customer();
        newCustomer.setFirstName("Joe");
        newCustomer.setLastName("Doe");
        newCustomer.setEmail(StringUtil.generateString()+"@test.pl");
        newCustomer.setPassword("Aa111");
        newCustomer.setAddress("Cornet street, 123");
        newCustomer.setCity("Washington");
        newCustomer.setState(State.ALABAMA);
        newCustomer.setZipCode("12345");
        newCustomer.setMobilePhone("123432123");
    }

    @When("^I navigate to registration form$")
    public void navigate_to_registration_form() throws Throwable
    {
        MenuPage page = new MenuPage(driver);
        page.navigateToMainPage();
        page.goToSignInPage();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.createAccount(newCustomer.getEmail());
    }

    @And("^I fullfill registration form$")
    public void fullfill_registration_form() throws Throwable
    {
        AccountCreationPage page = new AccountCreationPage(driver);
        page.fullFillRegisterCustomerForm(newCustomer);
    }

    @And("^I click register button$")
    public void click_registration_button() throws Throwable
    {
        AccountCreationPage page = new AccountCreationPage(driver);
        page.registerCustomer();
    }

    @Then("^I am logged in$")
    public void checkLogin() throws Throwable
    {
        MenuPage page = new MenuPage(driver);
        assertThat(page.isCustomerLogged());
    }

    @After("regression")
    public void cleanup(){
        if (driver!=null)
            driver.quit();
    }
}
