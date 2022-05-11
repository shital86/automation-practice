package com.automationpractice.testsuite;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
    }
     @Test(groups = {"smoke", "regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {
        homePage.setSignIn();
         signInPage.authentication("Authentication");

    }
    @Test(groups = {"smoke", "regression"},dataProvider = "credentials",dataProviderClass = TestData.class)
  public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                          String errorMessage){
        userShouldNavigateToSignInPageSuccessFully();
        signInPage.inputCredentials(username, password);
        signInPage.signIn();
        signInPage.verifyErrorMessage(errorMessage);
    }
    @Test (groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        userShouldNavigateToSignInPageSuccessFully();
        signInPage.enterEmailAddress("cd@yahoo.com");
        signInPage.enterPassWord("Happy1234");
        signInPage.setSignInBtn();
        signInPage.verifySignOutLinkIsVisible();
    }

    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully(){
        verifyThatUserShouldLogInSuccessFullyWithValidCredentials();
        signInPage.clickOnSignOutLink();
        signInPage.verifySignInLinkVisible();
    }



}
