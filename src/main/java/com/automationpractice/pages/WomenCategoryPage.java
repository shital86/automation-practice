package com.automationpractice.pages;

import com.automationpractice.customlisteners.CustomListeners;
import com.automationpractice.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='category-name']")
    WebElement womenText;
    @FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Tops')]")
    WebElement tops;
    @FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']//li//ul[@style='display: none;']//li//a[contains(text(),'Blouses')]")
    WebElement dresses;
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDresses;
    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-container']//div[@class='right-block']//h5[@itemprop='name']//a[@class='product-name'][contains(text(),'Printed Dress')]")
    WebElement printedDress;
    @FindBy(xpath = "//h5[@itemprop='name']//a[@class='product-name'][contains(text(),'Printed Chiffon Dress')]")
    WebElement printedChiffonDress;
    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line']//div[@class='product-container']//div[@class='right-block']//h5[@itemprop='name']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]")
    WebElement printedSummerDress;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement women;
    @FindBy(xpath = "//a[@class='product-name']")
    WebElement productsList;


    public void womenMenu() {
        clickOnElement(women);

    }

    public String getWomenText() {
        return getTextFromElement(womenText);

    }

    public void clickOnTops() {

        clickOnElement(tops);
    }

    public void clickOnDresses() {

        clickOnElement(dresses);
    }

    public void clickOnSortBy() {
        clickOnElement(sortByDresses);
    }

    public void clickOnPrintedChiffonDress() {

        clickOnElement(printedChiffonDress);
    }

    public void clickOnSummerDress() {

        clickOnElement(printedSummerDress);
    }
    public void verifyWomenText(String text) {
        verifyThatTextIsDisplayed(womenText, text);
        CustomListeners.test.log(Status.PASS,"Verify Women text is visible " + text);
    }

    public void addProductToCart(String product) {
        clickOnElement(productsList);
        CustomListeners.test.log(Status.PASS,"Click on Add product to cart " + product);
    }

}
