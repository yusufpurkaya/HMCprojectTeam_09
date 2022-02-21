package tests.us0003;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class C04_FakerClassIleKayitRaporlama extends TestBaseRapor {

    @Test
    public void test05() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
       // Page04 page04 = new Page04();
        //page04.hotelLoginButton.click();

        HotelUserRegisterPage hotelUserRegisterPage = new HotelUserRegisterPage();
        hotelUserRegisterPage.loginLinki.click();

        hotelUserRegisterPage.createANewAccountBox.click();
        extentTest.info("Login ve create a new account linki tiklandi");

        Faker faker=new Faker();
        String fakerpassword=faker.internet().password()+"A.abc1";
        ReusableMethods.waitForVisibility(hotelUserRegisterPage.userNameBox,2);
        hotelUserRegisterPage.userNameBox.sendKeys(faker.name().username());
        extentTest.info("username kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.passwordBox.sendKeys(fakerpassword);
        extentTest.info("password kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.emailBox.sendKeys(faker.internet().emailAddress());
        extentTest.info("email kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.fullnameBox.sendKeys(faker.name().fullName());
        extentTest.info("full name kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.phoneNoBox.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("phone number kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.socialSecurityNumberBox.sendKeys(faker.idNumber().ssnValid());
        extentTest.info("social security number kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.drivingLicenseBox.sendKeys(faker.letterify("B"));
        extentTest.info("driving license kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.selectCountryDropDown.sendKeys(faker.country().name());
        extentTest.info("country kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.selectStateDropDown.sendKeys(faker.country().toString());
        extentTest.info("state kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.addressBox.sendKeys(faker.address().fullAddress());
        extentTest.info("address kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.workingSectorBox.sendKeys(faker.job().title());
        extentTest.info("working sector kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.birthDateBox.sendKeys(faker.date().birthday(18,70).toString());
        extentTest.info("birth date kutusuna faker classdan deger gonderildi");

        hotelUserRegisterPage.saveLinki.click();
        extentTest.pass("save linki tiklandi");

       // SoftAssert softAssert = new SoftAssert();
       // softAssert.assertTrue(hotelUserRegisterPage.userDataGirisiBasariliUyarisi.isDisplayed());
        //softAssert.assertAll();
        Assert.assertTrue(hotelUserRegisterPage.userDataGirisiBasariliUyarisi.isDisplayed());
        hotelUserRegisterPage.OK.click();
        extentTest.pass("Giris basarili yazisi goruntulendi ve OK butonuna basildi");

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver();
        File screenShots=new File("target/screenShots/US0003.C04.png");
        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,screenShots);
        extentTest.info("Son ekranin fotografi kaydedildi");

       // ReusableMethods.waitFor(5);
        //Driver.closeDriver();
    }
}