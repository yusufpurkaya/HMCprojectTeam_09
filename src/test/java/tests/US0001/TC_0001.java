package tests.US0001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class TC_0001 extends TestBaseRapor {
    //1- httpp://www.hotelmycamp.com url e gidilir
    //2- Scroll down tusu ile welcome yazisi  gorulene kadar asagi inilir
    //3-Welcome to Our Hotel yazisinin gorulebilir oldugu test edilir
    @Test
    public void test01() {
        extentTest=extentReports.createTest("Anasayfa Case 1","Anasayfada Welcome to Our Hotel yazisi test edildi  ");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage=new AnasayfaPage();
        ReusableMethods.waitFor(5);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info(" Anasayfada asagi inildi ");
        String actualResult=anasayfaPage.welcomeYazisiSonuc.getText();
        // System.out.println(actualResult.toString());
        String expectedResult="Welcome To Our Hotel";
        SoftAssert softAssert=new SoftAssert();
        ReusableMethods.waitForVisibility(anasayfaPage.welcomeYazisiSonuc,5);
        softAssert.assertTrue(anasayfaPage.welcomeYazisiSonuc.isDisplayed());
        extentTest.pass("welcome yazisi goruldu ");
        softAssert.assertAll();
    }

}
