package steps;

import enums.DriverType;
import enums.State;


import io.cucumber.java.After;
import io.cucumber.java.en.*;
import model.Customer;
import pageobject.AccountCreationPage;
import pageobject.MenuPage;
import pageobject.SignInPage;
import util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

public class StepsDefinition extends BaseSteps{

    private Customer newCustomer = new Customer();


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

    @Given("^I am an existing customer$")
    public void existing_customer() throws Throwable{
        newCustomer.setEmail("aaa99@test.com");
        newCustomer.setFirstName("Joe");
        newCustomer.setLastName("Doe");
        newCustomer.setPassword("Aa111");
        newCustomer.setAddress("Test 123, Street");
        newCustomer.setCity("Washington");
        newCustomer.setState(State.ALABAMA);
        newCustomer.setZipCode("11111");
        newCustomer.setMobilePhone("123123123");
    }

    @When("^I login as existing customer$")
    public void login_customer() throws Throwable
    {
        MenuPage page = new MenuPage(driver);
        page.navigateToMainPage();
        page.goToSignInPage();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginToAccount(newCustomer);
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void search_for_product_by_name(String productName) throws Throwable
    {
        MenuPage page = new MenuPage(driver);
        page.searchForProduct(productName);
    }

    @Then("^I see product \"([^\"]*)\" on listning page$")
    public void verify_product_visible(String productName) throws Throwable
    {
        MenuPage page = new MenuPage(driver);
        page.verifyProductFound(productName);
    }

    @After
    public void afterScenario()
    {
        driver.quit();
    }
}
