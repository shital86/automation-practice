package com.automationpractice.testsuite;

import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage=new CreateAccountPage();
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        homePage.setSignIn();
        signInPage.enterEmailAddress("kavya@yahoo.com");
        Thread.sleep(2000);
        signInPage.createAnAccbtn();
        createAccountPage.enterFirstname("Kimal");
        createAccountPage.enterLastname("Marshho");
        createAccountPage.enterPassword("Happy123");
        createAccountPage.enterFirstnameInAddressField("Kimal");
        createAccountPage.enterLastNameInAddressField("Marshho");
        createAccountPage.enterfirstLineOfAddress("31 Avenue");
        createAccountPage.enterCity("Fijii");
        createAccountPage.enterState("Florida");
        createAccountPage.enterPostcode("12345");
        createAccountPage.enterCountryName("United States");

        createAccountPage.entermobileNumber("98678564567");
        createAccountPage.enterAssignAddress("512 Avenue");
        createAccountPage.clickOnRegisterBtn();
//        String expectedMessage = "MY ACCOUNT";
//        String actual = createAccountPage.verifyMyAccountText();
//        Assert.assertEquals(expectedMessage, actual);
    }
@Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.setSignIn();
        signInPage.enterEmailAddress("kavya@yahoo.com");
        signInPage.enterPassWord("Happy1234");
        signInPage.setSignInBtn();
        String expected="Sign out";
        String actual=signInPage.verifySignOutLinkIsVisible();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.setSignIn();
        signInPage.enterEmailAddress("kavya@yahoo.com");
        signInPage.enterPassWord("Happy123");
        signInPage.setSignInBtn();

    }
}
