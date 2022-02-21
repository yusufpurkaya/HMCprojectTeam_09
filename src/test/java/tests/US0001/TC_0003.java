package tests.US0001;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_0003 extends TestBaseRapor {


    @Test
    public void checkInOutButonuTesti() throws IOException {
        extentTest=extentReports.createTest("Anasayfa Case 1","Anasayfada check in butonlari yazisi test edildi  ");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage = new AnasayfaPage();
        anasayfaPage.mainCheckinDateButonu.click();
        extentTest.info("anasayfada check in date  butonuna basildi");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(anasayfaPage.checkinDateSonuc.isEnabled());
        extentTest.pass("check in butonunun secim yaptirdigi goruldu");
        anasayfaPage.mainCheckoutDateButonu.click();
        extentTest.info("anasayfada check out date  butonuna basildi");
        Assert.assertTrue(anasayfaPage.checkoutDateSonuc.isEnabled());
        extentTest.pass("check out butonunun secim yaptirdigi goruldu");
        anasayfaPage.anasayfaOdaTuruSecim.click();
        extentTest.info("anasayfada oda secme   butonuna basildi");
        Select select = new Select(anasayfaPage.anasayfaOdaTuruSecim);
        select.selectByVisibleText("Single");
        String actuelSingleButonu=anasayfaPage.singleElementi.getText();
        //  String expectedResult = "Single";
        Assert.assertTrue(anasayfaPage.singleElementi.isEnabled());
        ReusableMethods.getScreenshot("foto");
        extentTest.pass("single oda secildigi goruldu");
        anasayfaPage.yetiskinSayisiButonu.click();
        extentTest.info("anasayfada yetiskin sayisi secme butonuna basildi");
        Select select1=new Select(anasayfaPage.yetiskinSayisiButonu);
        select1.selectByIndex(5);
        Assert.assertTrue(anasayfaPage.yetiskinSayisiButonu.isDisplayed());
        ReusableMethods.getScreenshot("foto1");
        extentTest.pass("5 adult secildigi goruldu");
    }
}
