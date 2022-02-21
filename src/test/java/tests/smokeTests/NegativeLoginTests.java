package tests.smokeTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import utilities.TestBaseRapor;

public class NegativeLoginTests extends TestBaseRapor {
    @Test
    public void positiveLogintest(){
LoginPage loginPage=new LoginPage();
loginPage.login();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(loginPage.listofusers.isDisplayed());
        softAssert.assertAll();

    }
    @Test
    public void negativeLoginTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.negativelogin();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(loginPage.listofusers.isDisplayed());
        softAssert.assertAll();
    }
}
