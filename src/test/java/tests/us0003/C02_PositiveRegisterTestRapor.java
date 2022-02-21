package tests.us0003;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class C02_PositiveRegisterTestRapor extends TestBaseRapor {
    @Test
    public void test03() throws IOException {

        extentTest=extentReports.createTest("US0003_C02","Valid value register control");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelUserRegisterPage hotelUserRegisterPage= new HotelUserRegisterPage();
        hotelUserRegisterPage.loginLinki.click();
        hotelUserRegisterPage.createANewAccountBox.click();
        extentTest.info("HMC login linki ve create a new account linki tiklandi");

        hotelUserRegisterPage.userNameBox.sendKeys("Smitthh");
        extentTest.info("Register sayfasinda username kutusuna deger girildi.");

        hotelUserRegisterPage.passwordBox.sendKeys("Aj12345.");
        extentTest.info("Register sayfasinda password kutusuna deger girildi.");

        hotelUserRegisterPage.emailBox.sendKeys("sasa300@gmail.com");
        extentTest.info("Register sayfasinda email kutusuna deger girildi.");

        hotelUserRegisterPage.fullnameBox.sendKeys("Adam Smith");
        extentTest.info("Register sayfasinda fullname kutusuna deger girildi.");

        hotelUserRegisterPage.phoneNoBox.sendKeys("1446211034");
        extentTest.info("Register sayfasinda phone number kutusuna deger girildi.");

        hotelUserRegisterPage.socialSecurityNumberBox.sendKeys("098654367");
        extentTest.info("Register sayfasinda social security number kutusuna deger girildi.");

        hotelUserRegisterPage.drivingLicenseBox.sendKeys("B");
        extentTest.info("Register sayfasinda driving license kutusuna deger girildi.");

        Select select=new Select(hotelUserRegisterPage.selectCountryDropDown);
        select.selectByVisibleText("United States");
        extentTest.info("Register sayfasinda country dropdowndan secim yapildi");

        Select select2=new Select(hotelUserRegisterPage.selectStateDropDown);
        select2.selectByVisibleText("Alaska");
        extentTest.info("Register sayfasinda state dropdowndan secim yapildi");

        hotelUserRegisterPage.addressBox.sendKeys("29 Moon Way");
        extentTest.info("Register sayfasinda address kutusuna deger girildi.");

        hotelUserRegisterPage.workingSectorBox.sendKeys("IT");
        extentTest.info("Register sayfasinda working sector kutusuna deger girildi.");

        hotelUserRegisterPage.birthDateBox.sendKeys("2/21/1979");
        extentTest.info("Register sayfasinda birth date degeri girildi.");

        hotelUserRegisterPage.saveLinki.click();
        extentTest.info("Save linki tiklanarak yeni sayfaya gecis yapildi");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelUserRegisterPage.userDataGirisiBasariliUyarisi.isDisplayed());
        softAssert.assertAll();
        hotelUserRegisterPage.OK.click();
        extentTest.pass("Kullanici kaydi basariyla tamamlandi");

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver();
        File screenShots=new File("target/screenShots/US0003.C02.png");
        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,screenShots);
        extentTest.info("Son ekranin fotografi kaydedildi");

        //ReusableMethods.waitFor(5);
        //Driver.closeDriver();





    }
}