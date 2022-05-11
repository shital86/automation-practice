package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement women;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dresses;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement t_shirts;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signin;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logoLocators;

    public void setWomen() {
        clickOnElement(women);

    }

    public String getTextDresses() {
        clickOnElement(dresses);
        return getTextFromElement(dresses);
    }

    public String getTextTshirts() {
        clickOnElement(t_shirts);
        return getTextFromElement(t_shirts);
    }

    public void setSignIn() {
        clickOnElement(signin);

    }

    public String getTextLogo() {
        clickOnElement(logoLocators);
        return getTextFromElement(logoLocators);
    }
}

