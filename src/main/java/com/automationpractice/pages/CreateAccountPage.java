package com.automationpractice.pages;

import com.automationpractice.customlisteners.CustomListeners;
import com.automationpractice.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='radio']")
    WebElement selectTitle;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passWord;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameInAddress;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameInAddress;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement firstLineOfAddress;
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postCode;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAddress;
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement registerBtn;
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myaccountText;

    public void enterPersonalInformation(String name, String lstName, String title, String passwrd) {
        clickOnElement(selectTitle);      // select title
        CustomListeners.test.log(Status.PASS, "Select title: " + title);
    }

    public void enterFirstname(String firstname) {
        sendTextToElement(firstName, firstname);
        CustomListeners.test.log(Status.PASS, "Enter First name: " + firstname);
    }

    public void enterLastname(String lastname) {
        sendTextToElement(lastName, lastname);
        CustomListeners.test.log(Status.PASS, "Enter Last name: " + lastname);
    }

    public void enterPassword(String password) {
        sendTextToElement(passWord, password);
        CustomListeners.test.log(Status.PASS, "Enter Password: " + password);
    }

    public void enterFirstnameInAddressField(String firstnameadd) {
        sendTextToElement(firstNameInAddress, firstnameadd);
        CustomListeners.test.log(Status.PASS, "Enter First name for address field: " + firstnameadd);
    }

    public void enterLastNameInAddressField(String lastnameadd) {
        sendTextToElement(lastNameInAddress, lastnameadd);
        CustomListeners.test.log(Status.PASS, "Enter Last name for address field: " + lastnameadd);
    }

    public void enterfirstLineOfAddress(String firstlineofaddress) {
        sendTextToElement(firstLineOfAddress, firstlineofaddress);
        CustomListeners.test.log(Status.PASS, "Enter first line of address: " + firstlineofaddress);
    }

    public void enterCity(String cityname) {
        sendTextToElement(city, cityname);
        CustomListeners.test.log(Status.PASS, "Enter city: " + cityname);
    }

    public void enterState(String statename) {
        sendTextToElement(state, statename);
        CustomListeners.test.log(Status.PASS, "Select state from dropdown: " + statename);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postCode, postcode);
        CustomListeners.test.log(Status.PASS, "Enter Postal code: " + postcode);

    }

    public void enterCountryName(String countryname) {
        sendTextToElement(country, countryname);
        CustomListeners.test.log(Status.PASS, "Enter Country Name: " + countryname);
    }

    public void entermobileNumber(String mobilenumber) {
        sendTextToElement(mobileNumber, mobilenumber);
        CustomListeners.test.log(Status.PASS, "Enter mobile number: " + mobilenumber);
    }

    public void enterAssignAddress(String assignaddress) {
        sendTextToElement(assignAddress, assignaddress);
        CustomListeners.test.log(Status.PASS, "Enter Assign address: " + assignaddress);

    }

    public void clickOnRegisterBtn() {
        clickOnElement(registerBtn);
        CustomListeners.test.log(Status.PASS, "Click on register button ");
    }

    public void verifyMyAccountText(String text) {
        verifyThatTextIsDisplayed(myaccountText, text);
        CustomListeners.test.log(Status.PASS, "Verify 'My Account' text is displayed " + text);
    }

}



