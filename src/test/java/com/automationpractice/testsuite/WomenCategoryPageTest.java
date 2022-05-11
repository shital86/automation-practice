package com.automationpractice.testsuite;

import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.pages.WomenCategoryPage;
import com.automationpractice.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    WomenCategoryPage womenCategoryPage;
    CreateAccountPage createAccountPage;
    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        signInPage=new SignInPage();
        womenCategoryPage =new WomenCategoryPage();
        createAccountPage=new CreateAccountPage();

    }
    @Test
    public void verifyUserShouldNavigateToTheWomenCategoryPageSuccessfully(){
    womenCategoryPage.womenMenu();
    String expected="WOMEN";
    String actual=womenCategoryPage.getWomenText();
        Assert.assertEquals(expected,actual);
}
@Test
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product,String qty,String size,String colour){
       womenCategoryPage.womenMenu();
}


}
