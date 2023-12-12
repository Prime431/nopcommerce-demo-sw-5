package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListners.class)
public class RegisterPageTest extends BaseTest {


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

    @Test(groups = {"sanity", "smoke", "regression"})

    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
//        Click on Register Link
        registerPage.clickOnRegisterButton();
//        Verify "Register" text
        Assert.assertEquals(registerPage.getRegisterActualText(), "Register");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
//    Click on Register Link
        homePage.clickOnRegisterLink();
//    Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
//    Verify the error message "First name is required."
        Assert.assertEquals(registerPage.textFirstNameIsRequire(), "First name is required.");
//    Verify the error message "Last name is required."
        Assert.assertEquals(registerPage.textLastNameIsRequire(), "Last name is required.");
//    Verify the error message "Email is required."
        Assert.assertEquals(registerPage.textEmailIsRequire(), "Email is required.");
//    Verify the error message "Password is required."
        Assert.assertEquals(registerPage.textPasswordIsRequire(), "Password is required.");
//    Verify the error message "Password is required."
        Assert.assertEquals(registerPage.textConfirmPasswordIsRequire(), "Password is required.");

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
//        Click on Register Link
        homePage.clickOnRegisterLink();
//        Select gender "Female"
        registerPage.selectGenderFemale();
//        Enter firstname
        registerPage.enterFirstName("Vishal");
//        Enter lastname
        registerPage.enterLastName("Patel");
//        Select day
        registerPage.selectDay("4");
//        Select month
        registerPage.selectMonth("10");
//        Select year
        registerPage.selectYear("2010");
//        Enter email
        registerPage.enterEmail("vishalpatel@gmail.com");
//        Enter password
        registerPage.enterPassword("Password123");
//        Enter Confirm Password
        registerPage.enterConfirmPassword("Password123");
//        Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
//        Verify message "Your registration completed
        Assert.assertEquals(registerPage.actualRegistrationCompletedText(), "Your registration completed");

    }
}