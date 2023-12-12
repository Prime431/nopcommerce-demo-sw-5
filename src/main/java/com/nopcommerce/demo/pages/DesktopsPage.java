package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopText;

    @CacheLookup
    @FindBy(id = "products-orderBy")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;
    @CacheLookup
    @FindBy(xpath = "//div[@class='picture']//img[@title='Show details for Build your own computer']")
    WebElement buildYourOwnComputer;

    public void clickOnBuildOnYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
    }

    public String getDesktopsText() {
        String actualText = getTextFromElement(desktopText);
        return actualText;
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
    }

}
