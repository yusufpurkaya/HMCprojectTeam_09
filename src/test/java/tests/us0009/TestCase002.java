package tests.us0009;
import org.testng.annotations.Test;
import pages.HotelManagerPage;
import pages.LoginPage;

public class TestCase002 {
      /*
    2- Log in sayfasındaki "username","password" ve "log in" butonları tıklanabilir olmalıdır.
    */

    @Test
    public void testCase002(){
        LoginPage loginPage=new LoginPage();
        HotelManagerPage hotelManagerPage=new HotelManagerPage();

        loginPage.login();

    }
}
