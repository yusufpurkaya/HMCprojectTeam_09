package tests.US0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_0002 extends TestBaseRapor {

    @Test
    public void navbarTesti() {

            extentTest = extentReports.createTest("Anasayfa Case 2", "Anasayfada navbar butonlari   test edildi  ");
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
            AnasayfaPage anasayfaPage = new AnasayfaPage();
            anasayfaPage.mainHomeButonu.click();
            extentTest.info("anasayfadaki home butonuna basildi");
            String actuelResultHome = Driver.getDriver().getTitle();
            String expectedResultHome = "Home";
            Assert.assertTrue(actuelResultHome.contains(expectedResultHome));
            extentTest.pass("home butonu anasayfayi acti");
            anasayfaPage.mainRoomsButonu.click();
            extentTest.info("anasayfada rooms butonuna basildi ");
            String actuelResultRooms = Driver.getDriver().getTitle();
            String expectedResultRooms = "Rooms";
            Assert.assertTrue(actuelResultRooms.contains(expectedResultRooms));
            extentTest.pass("rooms butonu rooms sayfasina goturdu ");
            anasayfaPage.mainRestaurantButonu.click();
            extentTest.info("anasayfada restaurant butonuna gidildi");
            String actuelResultRestaurant = Driver.getDriver().getTitle();
            String expectedResultRestaurant = "Restaurant";
            Assert.assertTrue(actuelResultRestaurant.contains(expectedResultRestaurant));
            extentTest.pass("restaurant butonu ilgili sayfaya goturdu ");
            anasayfaPage.mainAboutButonu.click();
            extentTest.info("anasayfada about butonuna basildi");
            String actuelResultAbout = Driver.getDriver().getTitle();
            String expectedResultAbout = "About";
            Assert.assertTrue(actuelResultAbout.contains(expectedResultAbout));
            extentTest.pass("about butonu ilgili sayfaya goturdu");
            anasayfaPage.mainBlogButonu.click();
            extentTest.info("anasayfada blog butonuna basildi");
            String actuelResultBlog = Driver.getDriver().getTitle();
            String expectedResultBlog = "Blog";
            Assert.assertTrue(actuelResultBlog.contains(expectedResultBlog));
            extentTest.pass("blog butonu ilgili sayfaya goturdu");
            anasayfaPage.mainContactButonu.click();
            extentTest.info("anasayfada contact butonuna basildi");
            String actuelResultContact = Driver.getDriver().getTitle();
            String expectedResultContact = "Contact";
            Assert.assertTrue(actuelResultContact.contains(expectedResultContact));
            extentTest.pass("contact butonu ilgili sayfaya goturdu");
            anasayfaPage.mainLoginButonu.click();
            extentTest.info("anasayfada login butonuna basildi");
            //String actuelResultLogin=Driver.getDriver().getTitle();
            String expectedResultLogin = "Log in";
            Assert.assertTrue(anasayfaPage.loginSayfasiBasariliGiris.isDisplayed());
            extentTest.pass("login butonu ilgili sayfaya goturdu");
        }


    }

