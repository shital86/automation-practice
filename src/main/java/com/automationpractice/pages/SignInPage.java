package com.automationpractice.pages;

import com.automationpractice.customlisteners.CustomListeners;
import com.automationpractice.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='login']")
    WebElement signIn;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddress;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passWord;
    @FindBy(id = "SubmitLogin")
    WebElement signInBtn;
    @FindBy(xpath = "//body[@id='authentication']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[@class='row']/div[@class='col-xs-12 col-sm-6']/form[@id='create-account_form']/div[@class='form_content clearfix']/div[@class='submit']/button[@id='SubmitCreate']/span[1]")
    WebElement createAnAccountButton;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createAnAccountEmailField;
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOut;
    @FindBy(xpath = "//li[contains(text(),'An email address required.')]")
    WebElement emailRequiredError;

    @FindBy(xpath = "//li[contains(text(),'Password is required.')]")
    WebElement passwordRequiredError;

    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    WebElement invalidEmail;

    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement authenticationFailed;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;


    public String verifySignOutLinkIsVisible() {
        verifyThatElementIsDisplayed(signOut);
        CustomListeners.test.log(Status.PASS, "Verify Sign Out link is visible ");
        return getTextFromElement(signOut);
    }

    public void clickOnSignOutLink() {
        clickOnElement(signOut);
        CustomListeners.test.log(Status.PASS, "Click on Sign Out button ");
    }


    public void signIn() {
        clickOnElement(signIn);
    }

    public void verifySignInLinkVisible() {
        verifyThatElementIsDisplayed(signInLink);
        CustomListeners.test.log(Status.PASS, "Verify Sign In link is visible ");
    }


    public void enterEmailAddress(String email) {
        sendTextToElement(emailAddress, email);
        CustomListeners.test.log(Status.PASS, "Enter email address: " + email);
    }

    public void enterPassWord(String password) {
        sendTextToElement(passWord, password);
        CustomListeners.test.log(Status.PASS, "Enter password: " + password);
    }

    public void setSignInBtn() {
        clickOnElement(signInBtn);
        CustomListeners.test.log(Status.PASS, "Click on Sign In button ");
    }

    public void createAnAccbtn() {
        clickOnElement(createAnAccountButton);
        CustomListeners.test.log(Status.PASS, "Click on Create Account button ");
    }

    public void authentication(String text) {
        verifyThatTextIsDisplayed(authenticationText, text);
        CustomListeners.test.log(Status.PASS, "Verify 'Authentication' message is displayed " + text);
    }

    public void inputCredentials(String username, String password) {
        sendTextToElement(createAnAccountEmailField, username);
        CustomListeners.test.log(Status.PASS, "Enter username: " + username);

        sendTextToElement(passWord, password);
        CustomListeners.test.log(Status.PASS, "Enter Password: " + password);
    }

    // This method will get error message
    public void verifyErrorMessage(String errorMessage) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//body/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[1]"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(errorMessage)) {
                break;
            }
        }
    }

//    public String createAnAccount() {
//        return getTextFromElement(createAnAccountText);
//    }
//    public void enterCreateAnAccountEmailAddress(String email) {
//        sendTextToElement(createAnAccountEmailField, email);
//    }
//    public void loginToApplication(String username,String password,String signinBtn){
//       enterEmailAddress(username);
//       enterPassWord(password);
//    setSignInBtn();
//    }


}