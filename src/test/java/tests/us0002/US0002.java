package tests.us0002;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelManagerPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0002 {
HotelManagerPage hotelManagerPage=new HotelManagerPage();
LoginPage loginPage=new LoginPage();

@Test
public void testCase01 (){
	//Kullanıcı https://www.hotelmycamp.com adresine erişebilmeli
Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
}

@Test
public void testCase02 (){
	//Kullanıcı menüde bulunan Log in butonuna tıklayabilmeli
	//Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
	loginPage.ilkSayfaLoginButtonWebElement.click();

}
@Test
public void testCase03 (){
	//Kullanıcı log in sayfasında doğru username girebilmeli
	loginPage.ilkSayfaLoginButtonWebElement.click();
	loginPage.usernameWebElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

}
@Test
public void testCase04 (){
	//Kullanıcı log in sayfasında doğru password girebilmeli
	loginPage.passwordWebElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
	
}
@Test
public void testCase05 (){
	//Kullanıcı login butonuna tıklayabilmeli
	loginPage.accountLoginWebElement.click();
	
}
@Test
public void testCase06 (){
	//Kullanıcı başarılı bir şekilde giriş yapabilmeli
	ReusableMethods.waitFor(3);
	Assert.assertTrue(hotelManagerPage.hotelManagerButonuWebElement.isDisplayed());
	
}

}
