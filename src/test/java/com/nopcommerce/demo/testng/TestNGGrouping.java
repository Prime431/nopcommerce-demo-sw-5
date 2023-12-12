package com.nopcommerce.demo.testng;

import org.testng.annotations.Test;

public class TestNGGrouping {

    @Test
            (groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        System.out.println("Running Test - verifyUserShouldNavigateToComputerPageSuccessfully");
    }
    public void userShouldNavigateToLoginPageSuccessFully()
    {System.out.println("Running Test - userShouldNavigateToLoginPageSuccessFully");}

}
