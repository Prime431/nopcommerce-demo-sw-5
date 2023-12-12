package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {


    //Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and
    //create appropriate methods for it
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourComputerText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;
    // value = 1 for 2.2 and value 2 for 2.5

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    // value for ram 2,4 and 8 is 3,4 and 5 respectively
    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement hdd320;


    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd400;

    @CacheLookup
    @FindBy(id = "product_attribute_4_8")
    WebElement vistaHome;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement vistaPremium;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement softwareMicrosoftOffice;

    @CacheLookup
    @FindBy(id = "product_attribute_5_11")
    WebElement softwareAcrobatReader;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareTotalCommander;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement productAddedToShoppingCart;

    public String productHasAddedToShoppingCartText() {
        String actualText = getTextFromElement(productAddedToShoppingCart);
        return actualText;
    }
        public String getAddToCartText () {
            String actualText = getTextFromElement(addToCartText);
            return actualText;
        }
        public void selectTotalCommander () {
            clickOnElement(softwareTotalCommander);
        }

        public void selectAcrobatReader () {
            clickOnElement(softwareAcrobatReader);
        }
        public void selectSoftwareMicrosoftOffice () {
            clickOnElement(softwareMicrosoftOffice);
        }
        public void clickOnAddToCartButton () {
            clickOnElement(addToCart);
        }

        public void selectOsVistaPremium () {
            clickOnElement(vistaPremium);
        }
        public void selectOsVistaHome () {
            clickOnElement(vistaHome);
        }
        public void selectHdd400 () {
            clickOnElement(hdd400);
        }

        public void selectHdd320 () {
            clickOnElement(hdd320);
        }

        public void selectRam (String value){
            selectByValueFromDropDown(ram, value);
        }

        public void selectProcessor (String value){
            selectByValueFromDropDown(processor, value);
        }

        public String clickOnBuildYourOwnComputer () {
            String actualText = getTextFromElement(buildYourComputerText);
            return actualText;
        }


    }
