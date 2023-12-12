package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class ComputerTestPage extends BaseTest {
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

    @Test(groups = {"sanity", "smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
//    Click on Computer tab
        computerPage.clickOnComputers();
//    Verify "Computer" text
        Assert.assertEquals(computerPage.getComputersText(), "Computers");
    }

    @Test(groups = { "smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
//    Click on Computer tab
        computerPage.clickOnComputers();
//    Click on Desktops link
        computerPage.clickOnDesktops();
//    Verify "Desktops" text
        Assert.assertEquals(computerPage.desktopsText(), "Desktops");
    }

    @Test(groups = { "regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully() { //String processor, String ram, String hdd, String os, String software
//    Click on Computer tab
        computerPage.clickOnComputers();
//    Click on Desktops link
        desktopsPage.clickOnDesktopLink();
//    Click on product name "Build your own computer"
        desktopsPage.clickOnBuildOnYourOwnComputer();
//    Select processor "processor"
        buildYourOwnComputerPage.selectProcessor("1");// value 1 for 2.2 and 2 for 2.5
//    Select RAM "ram"
        buildYourOwnComputerPage.selectRam("3");//value 3 for 2gb, 4 for 4gb, 5 for 6gb
//    Select HDD "hdd"
        buildYourOwnComputerPage.selectHdd320();
//    Select OS "os"
        buildYourOwnComputerPage.selectOsVistaHome();
//    Select Software "software"
        buildYourOwnComputerPage.selectSoftwareMicrosoftOffice();
//    Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCartButton();
//    Verify message "The product has been added to your shopping cart"
        Assert.assertEquals(buildYourOwnComputerPage.productHasAddedToShoppingCartText(), "shopping cart");
    }
}