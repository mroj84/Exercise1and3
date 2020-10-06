package model;

import enums.Gender;
import enums.State;

import java.time.LocalDate;

public class Customer {
    private String email;
    private Gender gender;
    private String firstName;
    private String LastName;
    private String password = "As123!";
    private LocalDate birthDate;
    private boolean isSignUpToNewsletter;
    private boolean isSpecialOffersAllowed;
    private String company;
    private String address;
    private String addressLineTwo;
    private String city;
    private State state;
    private String zipCode;
    private String country = "United States";
    private String additionalInfo;
    private String homePhone;
    private String mobilePhone;
    private String addressAlias;

    public Gender getGender() {
        return gender;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isSignUpToNewsletter() {
        return isSignUpToNewsletter;
    }

    public void setSignUpToNewsletter(boolean signUpToNewsletter) {
        isSignUpToNewsletter = signUpToNewsletter;
    }

    public boolean isSpecialOffersAllowed() {
        return isSpecialOffersAllowed;
    }

    public void setSpecialOffersAllowed(boolean specialOffersAllowed) {
        isSpecialOffersAllowed = specialOffersAllowed;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddressAlias() {
        return addressAlias;
    }

    public void setAddressAlias(String addressAlias) {
        this.addressAlias = addressAlias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
