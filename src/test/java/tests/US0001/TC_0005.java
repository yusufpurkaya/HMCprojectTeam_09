package tests.US0001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class TC_0005 extends TestBaseRapor {

    @Test
    public  void  recentBlogTesti(){
        extentTest=extentReports.createTest("Anasayfa Case 1","Anasayfada recent blog sayfalari test edildi  ");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage=new AnasayfaPage();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        Assert.assertTrue(anasayfaPage.recentBlogYazisi.isDisplayed());
        extentTest.pass("recent blog yazisi goruldu ");
        anasayfaPage.recentblogButonu1.click();
        extentTest.info("birinci blog yazisina basildi");
        String actualResultblog1=Driver.getDriver().getTitle();
        String expectedResultrecentblog1="blind texts 6";
        Assert.assertTrue(actualResultblog1.contains(expectedResultrecentblog1));
        extentTest.pass("birinci blog sayfasina erisildi");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("anasayfada asagi inildi");
        anasayfaPage.recentblogButonu2.click();
        extentTest.info("ikinci blog yazisina basildi");
        String actualResultblog2=Driver.getDriver().getTitle();
        String expectedResultrecentblog2="blind texts 5";
        Assert.assertTrue(actualResultblog2.contains(expectedResultrecentblog2));
        extentTest.pass("ikinci blog sayfasina erisildi");
        Driver.getDriver().navigate().back();
        extentTest.info("anasayfaya geri donuldu");
        anasayfaPage.recentblogButonu3.click();
        extentTest.info("ucuncu blog yazisina basildi");
        String actualResultblog3=Driver.getDriver().getTitle();
        String expectedResultrecentblog3="blind texts 4";
        Assert.assertTrue(actualResultblog3.contains(expectedResultrecentblog3));
        extentTest.pass("ucuncu blog sayfasina erisildi");
        Driver.getDriver().navigate().back();
        extentTest.info("anasayfaya geri donuldu");
        anasayfaPage.recentblogButonu4.click();
        extentTest.info("dorduncu blog yazisina basildi");
        String actualResultblog4=Driver.getDriver().getTitle();
        String expectedResultrecentblog4="blind texts 3";
        Assert.assertTrue(actualResultblog4.contains(expectedResultrecentblog4));
        extentTest.pass("dorduncu blog sayfasina erisildi");
    }
}
