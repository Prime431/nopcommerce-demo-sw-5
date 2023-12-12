package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparelMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement booksMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelryMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCardsMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;


    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logOutLink;


    public void clickOnElectronicsMenu() {
        clickOnElement(electronicsMenu);
    }

    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }

    public void clickOnApparelMenu() {
        clickOnElement(apparelMenu);
    }

    public void clickOnDigitalDownloadsMenu() {
        clickOnElement(digitalDownloadsMenu);
    }

    public void clickOnBooksMenu() {
        clickOnElement(booksMenu);
    }

    public void clickOnJewelryMenu() {
        clickOnElement(jewelryMenu);
    }

    public void clickOnGiftCardsMenu() {
        clickOnElement(giftCardsMenu);
    }

    public void clickOnLogInLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOutLink() {
        clickOnElement(logOutLink);
    }
}