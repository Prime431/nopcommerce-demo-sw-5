package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    //Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computers;


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement deskTops;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement notebooks;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;
    public String desktopsText() {
        String actualText = getTextFromElement(desktopsText);
        return actualText;
    }


    public void clickOnComputers() {
        clickOnElement(computers);

    }

    public String getComputersText() {
        String actualText = getTextFromElement(computersText);
        return actualText;
    }

    public void clickOnDesktops() {
        clickOnElement(deskTops);
    }

    public void clickOnNotebooks() {
        clickOnElement(notebooks);
    }

    public void clickOnSoftware() {
        clickOnElement(software);
    }
}
