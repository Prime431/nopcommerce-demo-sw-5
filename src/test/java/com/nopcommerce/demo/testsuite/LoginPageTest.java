package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        registerPage = new RegisterPage();
    }



    public void loginMethod(String email, String password) {
        homePage.clickOnLogInLink();
//    Enter EmailId
        loginPage.enterEmailAddressOnLoginEmailField(email);
//    Enter Password
        loginPage.enterPasswordInPasswordField(password);
//    Click on Login Button
        loginPage.clickOnLoginButton();

    }

    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {

//        Click on login link
        homePage.clickOnLogInLink();
//        verify that "Welcome, Please Sign In!" message display
        Assert.assertEquals(loginPage.getWelcomePleaseSignInActualText(), "Welcome, Please Sign In!");

    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInvalidCredentials() {

//        Click on login link
        homePage.clickOnLogInLink();
//        Enter EmailId
        loginPage.enterEmailAddressOnLoginEmailField("prie@gmail.com");
//        Enter Password
        loginPage.enterPassword("jdnfjankj");
//        Click on Login Button
        loginPage.clickOnLoginButton();
//        Verify that the Error message
        Assert.assertEquals(loginPage.getLoginButtonErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
//    Click on login link
        homePage.clickOnLogInLink();
//    Enter EmailId
        loginPage.enterEmailAddressOnLoginEmailField("vishal@gmail.com");
//    Enter Password
        loginPage.enterPasswordInPasswordField("Password123");
//    Click on Login Button
        loginPage.clickOnLoginButton();
//    Verify that Login link is display
        Assert.assertEquals(loginPage.getLogoutText(), "Log in");
//Assert.assertEquals(loginPage.getLogoutLink());
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully() {

//    Click on login link
        loginMethod("vish@gmail.com", "Password123");
//    Enter EmailId
//    Enter Password
//    Click on Login Button
//    Click on LogOut Link
        registerPage.clickOnLogOutButton();
//    Verify that LogIn Link Display
        Assert.assertEquals(loginPage.getLoginText(), "Log out");
    }

}


