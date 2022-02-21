package tests.us0009;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class TestCase004 extends TestBase{
     /*
    4- Reservation bilgileri değiştirilebilmelidir.
    */

    @Test
    public void testCase004 () throws InterruptedException {

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

        WebElement priceElement = driver.findElement(By.xpath("//input[@id='Price']"));
        driver.findElement(By.name("Price")).clear();
        priceElement.sendKeys("50.00");

        WebElement childrenAmountElementi = driver.findElement(By.xpath("//input[@id='ChildrenAmount']"));
        driver.findElement(By.name("ChildrenAmount")).clear();
        childrenAmountElementi.sendKeys("4");

        WebElement ContactNameSurnameElementi = driver.findElement(By.xpath("//input[@id='ContactNameSurname']"));
        driver.findElement(By.name("ContactNameSurname")).clear();
        ContactNameSurnameElementi.sendKeys("Lucifer williams");

        WebElement contactPhoneElementi = driver.findElement(By.xpath("//input[@id='ContactPhone']"));
        driver.findElement(By.name("ContactPhone")).clear();
        contactPhoneElementi.sendKeys("18763244234");

        WebElement contactEmail = driver.findElement(By.xpath("//input[@id='ContactEmail']"));
        driver.findElement(By.name("ContactEmail")).clear();
        contactEmail.sendKeys("Luciferwilliams@gmail.com");
    }
}
