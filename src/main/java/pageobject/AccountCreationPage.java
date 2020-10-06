package pageobject;

import enums.Gender;
import model.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helper;

public class AccountCreationPage {
    @FindBy(css = "#id_gender1")
    private WebElement maleGenderInput;

    @FindBy(css = "#id_gender2")
    private WebElement femaleGenderInput;

    @FindBy(css = "#customer_firstname")
    private WebElement customerFirstNameInput;

    @FindBy(css = "#customer_lastname")
    private WebElement customerLastNameInput;

    @FindBy(css = "#passwd")
    private WebElement customerPasswordInput;

    @FindBy(css = "#days")
    private WebElement birthDateDaysSelect;

    @FindBy(css = "#months")
    private WebElement birthDateMonthsSelect;

    @FindBy(css = "#years")
    private WebElement birthDateYearsSelect;

    @FindBy(css = "#newsletter")
    private WebElement newsletterInput;

    @FindBy(css = "#optin")
    private WebElement specialOffersInput;

    @FindBy(css = "#company")
    private WebElement companyInput;

    @FindBy(css = "#address1")
    private WebElement address1Input;

    @FindBy(css = "#address2")
    private WebElement address2Input;

    @FindBy(css = "#city")
    private WebElement cityInput;

    @FindBy(css = "#id_state")
    private WebElement stateSelect;

    @FindBy(css = "#postcode")
    private WebElement zipCodeInput;

    @FindBy(css = "#id_country")
    private WebElement countrySelect;

    @FindBy(css = "#other")
    private WebElement additionalInfoInput;

    @FindBy(css = "#phone")
    private WebElement phoneInput;

    @FindBy(css = "#phone_mobile")
    private WebElement mobilePhoneInput;

    @FindBy(css = "#alias")
    private WebElement aliasInput;

    @FindBy(css = "#submitAccount")
    private WebElement registerButton;

    private Helper helper = new Helper();

    private WebDriver driver;

    public AccountCreationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fullFillRegisterCustomerForm(Customer customer){
        helper.waitForElement(By.id("id_gender1"),driver);
        if (customer.getGender() != null){
            if(customer.getGender().equals(Gender.MALE))
                maleGenderInput.click();

            femaleGenderInput.click();
        }
        if (customer.getFirstName() != null){
            customerFirstNameInput.sendKeys(customer.getFirstName());
        }

        if (customer.getLastName() != null){
            customerLastNameInput.sendKeys(customer.getLastName());
        }

        if (customer.getPassword() != null){
            customerPasswordInput.sendKeys(customer.getPassword());
        }

        if (customer.getBirthDate() != null){
            helper.selectByValue(birthDateDaysSelect, customer.getBirthDate().getDayOfYear() + "",driver);
            helper.selectByValue(birthDateMonthsSelect, customer.getBirthDate().getMonth().getValue() + "",driver);
            helper.selectByValue(birthDateYearsSelect, customer.getBirthDate().getYear() + "",driver);
        }

        if (customer.isSignUpToNewsletter()){
            newsletterInput.click();
        }

        if (customer.isSpecialOffersAllowed()){
            specialOffersInput.click();
        }

        if (customer.getCompany() != null){
            companyInput.sendKeys(customer.getCompany());
        }

        if (customer.getAddress() != null){
            address1Input.sendKeys(customer.getAddress());
        }

        if (customer.getAddressLineTwo() != null){
            address2Input.sendKeys(customer.getAddressLineTwo());
        }

        if (customer.getCity() != null){
            cityInput.sendKeys(customer.getCity());
        }

        if (customer.getState() != null){
            helper.selectByValue(stateSelect, customer.getState().getValue()+"", driver);
        }

        if (customer.getZipCode() != null){
            zipCodeInput.sendKeys(customer.getZipCode());
        }

//        if (customer.getCountry() != null){
//            helper.selectByText(stateSelect, customer.getCountry());
//        }

        if (customer.getAdditionalInfo() != null){
            additionalInfoInput.sendKeys(customer.getAdditionalInfo());
        }

        if (customer.getHomePhone() != null){
            phoneInput.sendKeys(customer.getHomePhone());
        }

        if (customer.getMobilePhone() != null){
            mobilePhoneInput.sendKeys(customer.getMobilePhone());
        }

        if (customer.getAddressAlias() != null)
            aliasInput.sendKeys(customer.getAddressAlias());
    }

    public void registerCustomer(){
        registerButton.click();
    }
}
