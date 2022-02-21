package tests.us0008;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelManagerPage;
import pages.LoginPage;
import utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelManagerPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class US0008_test extends TestBaseRapor{
    @Test
    public void test() throws IOException {
        extentTest = extentReports.createTest("US008_Report", "Yonetici Olarak Room reservation eklenebilmeli");
        LoginPage loginPage = new LoginPage();
        HotelManagerPage hotelManagerPage = new HotelManagerPage();
        SoftAssert softAssert = new SoftAssert();
        loginPage.login();
        //1- https://www.hotelmycamp.com/ sitesindeki log in butonu tıklanabilir olmalı
        extentTest.info("TC_0001_https://www.hotelmycamp.com/ sitesindeki log in butonu tıklanabilir olmalı");
        //2- Log in sayfasındaki "username","password" ve "log in" butonları tıklanabilir olmalı
        extentTest.info("TC_0002_Log in sayfasındaki \"username\",\"password\" ve \"log in\" butonları tıklanabilir olmalı");
        String actualAdminText = hotelManagerPage.listOfUsersWebElement.getText();
        String expectedAdminText = ConfigReader.getProperty("expectedAdminText");
        softAssert.assertEquals(actualAdminText, expectedAdminText);
        //3- Açılan sayfadaki "Hotel Management" butonu tıklanabilir olmalı
        softAssert.assertTrue(hotelManagerPage.hotelManagerButonuWebElement.isDisplayed());
        hotelManagerPage.hotelManagerButonuWebElement.click();
        extentTest.pass("TC_0003_Açılan sayfadaki \"Hotel Management\" butonu tıklanabilir olmalı");
        //4- "Hotel Management" menüsünde "Hotel reservations" butonu tıklanabilir olmalı
        hotelManagerPage.roomReservationsWebElement.click();
        String expectedListOfReservationsText = ConfigReader.getProperty("expectedListOfReservationsText");
        String actualListOfReservationsText = hotelManagerPage.listOfReservationsWebElement.getText();
        hotelManagerPage.roomReservationsWebElement.click();
        softAssert.assertEquals(actualListOfReservationsText, expectedListOfReservationsText, "elemente ulaşılamadı");
        extentTest.pass("TC004_\"Hotel Management\" menüsünde \"Hotel reservations\" butonu tıklanabilir olmalı");
        //5-"Hotel reservations" sayfasında "ADD ROOM RESEVATION" butonu tıklanabilir olmalı
        hotelManagerPage.addRoomReservationsWebElement.click();
        softAssert.assertTrue(hotelManagerPage.selectUserDropdownWebElement.isDisplayed(), "elemente ulasilamadi");
        extentTest.pass("TC005_\"Hotel reservations\" sayfasında \"ADD ROOM RESEVATION\" butonu tıklanabilir olmalı");
        //6- "Create Hotelroomreservatıon" listesindeki textboxlar ve "SAVE" butonu tıklanabilir olmalı
        hotelManagerPage.createHotelRoomReservation();
        softAssert.assertTrue(hotelManagerPage.alertTextWebElement.isDisplayed());
        extentTest.pass("TC006_\"Create Hotelroomreservatıon\" listesindeki textboxlar ve \"SAVE\" butonu tıklanabilir olmalı");
        //7- "RoomReservation was inserted successfully" mesajı görülebilmeli ve "OK" butonu tıklanabilir olmalı
        ReusableMethods.getScreenshot("alert_yazisi");
        hotelManagerPage.alertButtonWebElement.click();
        extentTest.pass("TC007_\"RoomReservation was inserted successfully\" mesajı görülebilmeli ve \"OK\" butonu tıklanabilir olmalı");
        Driver.closeDriver();
        softAssert.assertAll();
    }
}
