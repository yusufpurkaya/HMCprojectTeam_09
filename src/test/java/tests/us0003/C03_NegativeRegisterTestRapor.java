package tests.us0003;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelUserRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

public class C03_NegativeRegisterTestRapor extends TestBaseRapor {


    @Test
    public void test04() throws IOException {
        extentTest=extentReports.createTest("US0003_C03","Invalid value register control");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelUserRegisterPage hotelUserRegisterPage= new HotelUserRegisterPage();
        hotelUserRegisterPage.loginLinki.click();
        hotelUserRegisterPage.createANewAccountBox.click();
        extentTest.info("HMC login linki ve create a new account butonu secildi");

        hotelUserRegisterPage.userNameBox.sendKeys("ASmith");
        extentTest.info("username kutusuna deger girildi");

        hotelUserRegisterPage.passwordBox.sendKeys("Aa123");
        extentTest.info("password kutusu gecersiz veri girisi");

        hotelUserRegisterPage.emailBox.sendKeys("sasa11@gmail.com");
        extentTest.info("email kutusuna gecersiz veri girisi");

        hotelUserRegisterPage.fullnameBox.sendKeys("Adam Smith");
        extentTest.info("fullname kutusuna deger girildi");

        hotelUserRegisterPage.phoneNoBox.sendKeys("14412312");
        extentTest.info("phone number kutusuna eksik deger girildi");

        hotelUserRegisterPage.socialSecurityNumberBox.sendKeys("98765432A");
        extentTest.info("social security number kutusuna deger girildi");

        hotelUserRegisterPage.drivingLicenseBox.sendKeys("B");
        extentTest.info("Driving License kutusuna deger girildi");

        Select select = new Select(hotelUserRegisterPage.selectCountryDropDown);
        select.selectByVisibleText("United Kingdom");
        extentTest.info("country dropdowndan secim yapildi");

        hotelUserRegisterPage.addressBox.sendKeys("23 Moon Way,Norfolk");
        extentTest.info("address kutusuna deger gonderildi");

        hotelUserRegisterPage.workingSectorBox.sendKeys("IT");
        extentTest.info("working sector secimi yapildi");

        hotelUserRegisterPage.birthDateBox.sendKeys("2/21/1979");
        extentTest.info("birth date kutusundan secim yapildi");

        hotelUserRegisterPage.saveLinki.click();
        extentTest.pass("save linki tiklandi");

        hotelUserRegisterPage.invalidValueOKbutonu.click();
        extentTest.pass("gecersiz veri girisi onaylandi");

        // Assert.assertTrue(hotelUserRegisterPage.userDataGirisiBasariliUyarisi.isDisplayed());
        //hotelUserRegisterPage.OK.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelUserRegisterPage.userDataGirisiBasariliUyarisi.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("Basarisiz kayit test edildi");
        //Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver();
        File screenShots=new File("target/screenShots/US0003.C03");
        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,screenShots);
        extentTest.info("Son ekranin fotografi kaydedildi");



        //ReusableMethods.waitFor(5);
        //Driver.closeDriver();

    }
}