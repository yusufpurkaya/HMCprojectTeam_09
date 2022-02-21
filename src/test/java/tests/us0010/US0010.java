package tests.us0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US0010 extends TestBaseRapor {

    @Test(groups = {"us10,team09"})
    public void test01(){
        extentTest=extentReports.createTest("US10TC01","siteye erisim ve login erisim");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.pass("hotelmycamp sitesine erisildi");
        LoginPage loginPage=new LoginPage();
        loginPage.ilkloginLink.click();
        extentTest.pass("login linkine ersildi");
        Assert.assertTrue(loginPage.loginEkrani.isDisplayed());

    }

    @Test(groups = {"us10,team09"})
    public void test02(){
        extentTest=extentReports.createTest("US10TC02","siteye , login ve create a new account butonuna erisim");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.pass("hotelmycamp sitesine erisildi");
        LoginPage loginPage=new LoginPage();
        loginPage.ilkloginLink.click();
        Assert.assertTrue(loginPage.createANewAccountButton.isEnabled());
        extentTest.pass("create a new account butonuna erisimi test edildi");
        loginPage.createANewAccountButton.click();
        extentTest.pass("create a new account butonuna tiklandi");
    }
    @Test(groups = {"us10,team09"})
    public void test03(){
        extentTest=extentReports.createTest("US10TC03","yeni kullanici hesabi alma");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.pass("hotelmycamp sitesine erisildi");
        LoginPage loginPage=new LoginPage();

        loginPage.yeniHesapOlustur();
        extentTest.pass("yeni hesap olusturuldu");
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertTrue(loginPage.registrationBasararilikayitYazisi.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("yeni hesap olusturuldugu test edildi");
        loginPage.registrationOnayOkbuttonu.click();
        extentTest.pass("yeni hesap olusumu sonrasi acilan sekme de ok tiklandi");
    }
    @Test(groups = {"us10,team09"})
    public void testCase04() throws InterruptedException {
        extentTest=extentReports.createTest("US10TC01","siteye erisim ve login erisim");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.pass("hotelmycamp sitesine erisildi");
        LoginPage loginPage=new LoginPage();

        loginPage.yeniHesapOlustur();
        extentTest.pass("yeni hesap olusturuldu");
        ReusableMethods.waitForVisibility(loginPage.registrationOnayOkbuttonu,5);
        loginPage.registrationOnayOkbuttonu.click();
        extentTest.pass("yeni hesap olusumu sonrasi acilan sekme de ok tiklandi");

        Thread.sleep(2000);
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(loginPage.registrationSonrasiLogin.isDisplayed());
        extentTest.pass("kayit sonrasi log in butonu gorunurlugu test edildi");
    }
    @Test(groups = {"us10,team09"})
    public void testCase05() throws InterruptedException {
        extentTest=extentReports.createTest("US10TC05","siteye erisim ve login erisim");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.pass("hotelmycamp sitesine erisildi");
        LoginPage loginPage=new LoginPage();

        loginPage.yeniHesapOlustur();
        extentTest.pass("yeni hesap olusturuldu");
        Thread.sleep(2000);
        loginPage.registrationOnayOkbuttonu.click();
        extentTest.pass("yeni hesap olusumu sonrasi acilan sekme de ok tiklandi");
        Thread.sleep(2000);
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        loginPage.registrationSonrasiLogin.click();
        extentTest.pass("kayit sonrasi log in butonu gorunurlugu test edildi");
        loginPage.alinanhesaplaLogin();
        extentTest.pass("alinan hesapla siteye giris yapildi");
        Thread.sleep(2000);
        loginPage.reservationRoom();
        extentTest.pass("alina hesapla oda reseve edildi");
        ReusableMethods.waitForVisibility(loginPage.reservationGorunum,5);
//Assert.assertTrue(loginPage.ilkoda.getText().contains(loginPage.reservationGorunum.getText()));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(loginPage.reservationGorunum.isDisplayed());
        softAssert.assertAll();
       // Assert.assertTrue(loginPage.reservationGorunum.isDisplayed());
        extentTest.pass("oda reserve edildigi test edildi");
    }
}
