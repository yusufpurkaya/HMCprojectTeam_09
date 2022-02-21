package tests.us0009;

import org.testng.annotations.Test;
import pages.HotelManagerPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase001 {
     /*
    1- Yönetici;https://www.hotelmycamp.com/ adresine sorunsuz erişim olmalidir.
    */

    @Test
    public void testCase01 (){

        HotelManagerPage hotelManagerPage=new HotelManagerPage();
        LoginPage loginPage=new LoginPage();


        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    }
}
