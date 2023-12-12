package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

// By loginLink = By.linkText("Log in");



    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeActualText;




    public void enterEmailAddressOnLoginEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPasswordInPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }
    public String getWelcomePleaseSignInActualText(){
        String message = getTextFromElement(welcomeActualText);
        return message;
    }
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    public void enterPassword(String pasword) {
        sendTextToElement(password, pasword);
    }
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logIn;
    public void clickOnLoginButton() {
     clickOnElement(logIn);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement loginErrorMessage;
    public String getLoginButtonErrorMessage() {
        String actualText = getTextFromElement(loginErrorMessage);
        return actualText;
    }

    @CacheLookup
    @FindBy(css = ".ico-logout")
    WebElement logout;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLinkk;

    public String getLogoutText() {
        String message = getTextFromElement(loginLinkk);
        return message;
    }

        public String getLoginText() {
            String message = getTextFromElement(logout);
            return message;

}

    }


