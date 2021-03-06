package tests.us0005;
import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import java.io.File;
import java.io.IOException;
import java.util.Set;
public class Us0005 extends TestBaseRapor{
    HotelMyCampPage hotelmycamppage;
    Faker faker=new Faker();
    Alert alert;
    @Test
    public void testCase01() throws IOException {
        extentTest = extentReports.createTest("US05TC01", "Siteye basarili bir sekilde giris yapildi");
        HotelMyCampPage hotelmycamppage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.pass("Hotel my camp sitesine erisildi");
        hotelmycamppage.homePageLoginButon.click();
        extentTest.pass("Anasayfa login butonuna tiklandi");
        hotelmycamppage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.pass("Gecerli username girildi");
        hotelmycamppage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        extentTest.pass("Gecerli password girildi");
        hotelmycamppage.loginButtonElement.click();
        extentTest.pass("Siteye giris icin log in butonuna tiklandi");
        hotelmycamppage.hotelManagementButtonElement.click();
        extentTest.pass("Hotel Management butonuna tiklandi");
        hotelmycamppage.hotelListButonu.click();
        extentTest.pass("Hotel List butonuna tiklandi");
        ReusableMethods.waitFor(1);
        Assert.assertTrue(hotelmycamppage.listofHotelsYazi.isDisplayed());
        String expectedYaziListOfHotel = "List of Hotel";
        System.out.println(expectedYaziListOfHotel);
        extentTest.pass("List Of Hotel yazisi goruldu");
        //3- "Details" butonuna t??klayabilmeli ve cikan sayfada "Edit hotel" yazisi kontrol edilmeli.
        hotelmycamppage.detailsButonu.click();
        ReusableMethods.waitFor(1);
        extentTest.pass("Details butonuna tiklandi");
        Assert.assertTrue(hotelmycamppage.editHotelYazi.isDisplayed());
        String expectedYaziEditHotel = "Edit Hotel";
        System.out.println(expectedYaziEditHotel);
        extentTest.pass("Edit Hotel yazisi goruldu");
        String ilksayfaHandleDegeri = Driver.getDriver().getWindowHandle();
        Set<String> handleSet = Driver.getDriver().getWindowHandles();
        String ikincisayfaHandleDegeri = "";
        for (String each : handleSet
        ) {
            if (!each.equals(ilksayfaHandleDegeri))
                ikincisayfaHandleDegeri = each;
        }
        Driver.getDriver().switchTo().window(ikincisayfaHandleDegeri);
        ReusableMethods.waitFor(2);
        extentTest.pass("Yeni sayfaya gecildi");
        // 4- "Code,Name,Adress,Phone,Email,Group" secenekleri g??ncellenebilmeli "Save" butonuna t??klanabilmeli.
        hotelmycamppage.codeKutusuWebElement.clear();
        hotelmycamppage.codeKutusuWebElement.sendKeys(faker.number().digit());
        ReusableMethods.waitFor(1);
        extentTest.pass("Code box yeni veri girildi");
        hotelmycamppage.nameKutusuWebElement.clear();
        hotelmycamppage.nameKutusuWebElement.sendKeys(faker.company().name());
        ReusableMethods.waitFor(1);
        extentTest.pass("Guncel otel ismi girildi");
        hotelmycamppage.addressButonu.clear();
        hotelmycamppage.addressButonu.sendKeys(faker.address().state());
        ReusableMethods.waitFor(1);
        extentTest.pass("Adres bilgisi girildi");
        hotelmycamppage.phoneButtonu.clear();
        hotelmycamppage.phoneButtonu.sendKeys(faker.phoneNumber().phoneNumber());
        ReusableMethods.waitFor(1);
        extentTest.pass("Telefon numarasi girildi");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", hotelmycamppage.emailButonu);
        ReusableMethods.waitFor(1);
        hotelmycamppage.emailButonu.clear();
        hotelmycamppage.emailButonu.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(1);
        extentTest.pass("Email adresi girildi");
        ReusableMethods.waitFor(1);
        Select select = new Select(hotelmycamppage.groupDrobdownElement);
        select.selectByVisibleText("Hotel Type2");
        hotelmycamppage.saveButonu.click();
        extentTest.pass("Hotel Type secildi");
        //  5- "Hotel was updated successfully" yaz??s?? g??r??lebilmeli ve "Ok" Butonu t??klan??labilmeli.
        ReusableMethods.waitFor(1);
        Assert.assertTrue(hotelmycamppage.htlwasupdatedsuccessfulyYazi.isDisplayed());
        String expectedAlertYazi = "Hotel was updated successfully";
        System.out.println(expectedAlertYazi);
        ReusableMethods.waitFor(1);
        extentTest.pass("Hotel was updated successfully yazisi goruldu");
        ReusableMethods.waitFor(1);
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File tumSayfa = new File("target/screenshot/picture.jpg");
        File geciciResim3 = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim3, tumSayfa);
        extentTest.pass("Hotel was updated successfully yazisi screenshot alindi");
        ReusableMethods.waitFor(1);
        hotelmycamppage.hotelguncelBasariliOKbuton.click();
        ReusableMethods.waitFor(1);
        // 6- "Delete" butonuna t??klan??labilmeli "Would you like to continue?" yaz??s??n??n g??r??n??rl?????? test edilmeli.
        hotelmycamppage.guncellemedenSonraDeleteButon.click();
        ReusableMethods.waitForVisibility(hotelmycamppage.wldyliketoContinueYazi, 2);
        Assert.assertTrue(hotelmycamppage.wldyliketoContinueYazi.isDisplayed());
        String expectedAlertYazisiSonSayfa = "Would you like to continue?";
        System.out.println(expectedAlertYazisiSonSayfa);
        extentTest.pass("Delete butonu tiklandi,Would you like to continue yazisi goruldu");
        ReusableMethods.waitFor(1);
        //  7- Hotel successfully deleted yazisi gorunmeli,"Ok" butonu tiklanabilir olmali ve otel bilgisi silinebilmeli.
        ReusableMethods.waitForVisibility(hotelmycamppage.htlsuccessfullyDeletedYazi,2);
        Assert.assertTrue(hotelmycamppage.htlsuccessfullyDeletedYazi.isDisplayed());
        String expectedAlertKapanis="Hotel successfully deleted";
        System.out.println(expectedAlertKapanis);
        hotelmycamppage.enSonOKButonu.click();
        ReusableMethods.waitFor(1);
        extentTest.pass("Hotel successfully deleted yazisi gorundu ve OK butonuna tiklandi.");
    }

}
