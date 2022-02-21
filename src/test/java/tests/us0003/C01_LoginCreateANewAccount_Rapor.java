package tests.us0003;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelUserRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

public class C01_LoginCreateANewAccount_Rapor extends TestBaseRapor {

    @Test
    public void Baslangic() throws IOException {
        extentTest=extentReports.createTest("US0003_C01","login ve register page kontrol");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelUserRegisterPage hmcRegisterPage=new HotelUserRegisterPage();
        hmcRegisterPage.loginLinki.click();
        extentTest.info("HMC login linki tiklandi");

        hmcRegisterPage.createANewAccountBox.click();
        extentTest.info("create a new account linki tiklandi ve yeni sayfaya gecildi");

        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("Register"));
        System.out.println("actualUrl = " + actualUrl);
        extentTest.pass("Sayfanin 'Register' oldugu test edildi");

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver();
        File screenShots=new File("target/screenShots/US0003.01.png");
        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,screenShots);
        extentTest.info("Son ekranin fotografi kaydedildi");

        //ReusableMethods.waitFor(5);
        //Driver.closeDriver();

    }



}
