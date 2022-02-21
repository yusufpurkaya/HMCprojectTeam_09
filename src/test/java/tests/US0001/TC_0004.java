package tests.US0001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class TC_0004 extends TestBaseRapor {
    @Test
    public void ourRoomsTesti() throws InterruptedException {
        extentTest=extentReports.createTest("Anasayfa Case 1","Anasayfada oda butonlari yazisi test edildi");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage=new AnasayfaPage();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        anasayfaPage.birinciOdaButonu.click();
        extentTest.info("anasayfada birinci oda butonuna basildi");
        String actuelResultOda1=Driver.getDriver().getCurrentUrl();
        String expectedResultOda1="260";
        Assert.assertTrue(actuelResultOda1.contains(expectedResultOda1));
        extentTest.pass("birinci odanin sayfasina erisildigi goruldu");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        anasayfaPage.ikinciOdaButonu.click();
        extentTest.info("anasayfada ikinci oda butonuna basildi");
        String actuelResultOda2=Driver.getDriver().getCurrentUrl();
        String expectedResultOda2="259";
        Assert.assertTrue(actuelResultOda2.contains(expectedResultOda2));
        extentTest.pass("ikinci odanin sayfasina erisildigi goruldu");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        anasayfaPage.ucuncuOdaButonu.click();
        extentTest.info("anasayfada ucuncu oda butonuna basildi");
        String actuelResultOda3=Driver.getDriver().getCurrentUrl();
        String expectedResultOda3="258";
        Assert.assertTrue(actuelResultOda3.contains(expectedResultOda3));
        extentTest.pass("ucuncu odanin sayfasina erisildigi goruldu");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        anasayfaPage.dorduncuOdaButonu.click();
        extentTest.info("anasayfada dorduncu oda butonuna basildi");
        String actuelResultOda4=Driver.getDriver().getCurrentUrl();
        String expectedResultOda4="257";
        Assert.assertTrue(actuelResultOda4.contains(expectedResultOda4));
        extentTest.pass("dorduncu odanin sayfasina erisildigi goruldu");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        anasayfaPage.besinciOdaButonu.click();
        extentTest.info("anasayfada besinci oda butonuna basildi");
        String actuelResultOda5=Driver.getDriver().getCurrentUrl();
        String expectedResultOda5="256";
        Assert.assertTrue(actuelResultOda5.contains(expectedResultOda5));
        extentTest.pass("besinci odanin sayfasina erisildigi goruldu");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        anasayfaPage.altinciOdaButonu.click();
        extentTest.info("anasayfada altinci oda butonuna basildi");
        String actuelResultOda6=Driver.getDriver().getCurrentUrl();
        String expectedResultOda6="255";
        Assert.assertTrue(actuelResultOda6.contains(expectedResultOda6));
        extentTest.pass("altinci odanin sayfasina erisildigi goruldu");
    }



}