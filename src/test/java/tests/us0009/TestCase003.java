package tests.us0009;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class TestCase003 extends TestBase {
  /*
    3-"List of Reservation" listesinden herhangi bir reservation seçilebilmelidir.
    */

    @Test
    public void testCase003 () throws InterruptedException {

        driver.navigate().to("https://www.hotelmycamp.com/");

        WebElement loginButonu = driver.findElement(By.xpath("(//a[@class='nav-link'])[7]"));
        loginButonu.click();

        WebElement usernameButonu = driver.findElement(By.xpath("//input[@id='UserName']"));
        usernameButonu.sendKeys("manager", Keys.ENTER);

        WebElement passwordButonu = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordButonu.sendKeys("Manager1!", Keys.ENTER);

        WebElement hotelManagementButonu = driver.findElement(By.id("menuHotels"));
        hotelManagementButonu.click();

        WebElement roomReservationButonu = driver.findElement(By.xpath("(//i[@class='icon-calendar'])[4]"));
        roomReservationButonu.click();

        String listOfReservationYazisi = driver.findElement(By.xpath("(//a[@href='#'])[1]")).getText();
        System.out.println(" Hotels > " + listOfReservationYazisi);

        WebElement detailsButonu = driver.findElement(By.xpath("(//a[@class='btn btn-xs default'])[1]"));
        detailsButonu.click();
    }

}
