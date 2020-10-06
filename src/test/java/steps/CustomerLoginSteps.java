package steps;

import enums.State;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Customer;
import pageobject.AccountCreationPage;
import pageobject.MenuPage;
import pageobject.SignInPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerLoginSteps extends BaseSteps{
    Customer registeredCustomer = new Customer();

    @Given("^I am an existing$")
    public void existing_customer() throws Throwable{
        registeredCustomer.setEmail("aaa99@test.com");
        registeredCustomer.setFirstName("Joe");
        registeredCustomer.setLastName("Doe");
        registeredCustomer.setPassword("Aa111");
        registeredCustomer.setAddress("Test 123, Street");
        registeredCustomer.setCity("Washington");
        registeredCustomer.setState(State.ALABAMA);
        registeredCustomer.setZipCode("11111");
        registeredCustomer.setMobilePhone("123123123");
    }

    @When("^I login as existing customer$")
    public void login_customer() throws Throwable
    {
        MenuPage page = new MenuPage(driver);
        page.navigateToMainPage();
        page.goToSignInPage();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginToAccount(registeredCustomer);
    }



    @After("regression")
    public void cleanup(){
        if (driver!=null)
            driver.quit();
    }
}
