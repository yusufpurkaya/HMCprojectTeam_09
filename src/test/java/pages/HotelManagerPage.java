package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class HotelManagerPage {
    public HotelManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Faker faker = new Faker();

    //Hotel Manager Butonu
    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagerButonuWebElement;

    //Room reservations butonu
    @FindBy(xpath = "(//i[@class='icon-calendar'])[4]")
    public WebElement roomReservationsWebElement;

    //ADD ROOM RESERVATIONS butonu
    @FindBy(xpath = "//span[text()='Add Room Reservation ']")
    public WebElement addRoomReservationsWebElement;

    //selectUser dropdown
    @FindBy(xpath = "(//select[@class='form-control input-lg required'])[1]")
    public WebElement selectUserDropdownWebElement;

    //selecthotelroom dropdown
    @FindBy(xpath = "(//select[@class='form-control input-lg required'])[2]")
    public WebElement selecthotelroomDropdownWebElement;

    //price webelement
    @FindBy(id = "Price")
    public WebElement priceWebElement;

    //dateStart webelement
    @FindBy(id = "DateStart")
    public WebElement dateStartWebElement;

    //dateEnd webelement
    @FindBy(id = "DateEnd")
    public WebElement dateEndWebElement;

    //AdultAmount webelement
    @FindBy(id="AdultAmount")
    public WebElement adultAmountWebElement;

    //ChildrenAmount webelement
    @FindBy(id="ChildrenAmount")
    public WebElement childrenAmountWebElement;

    //ContactNameSurname webelement
    @FindBy (id="ContactNameSurname")
    public WebElement contactNameSurnameWebElement;

    //ContactPhone webelement
    @FindBy (id="ContactPhone")
    public WebElement contactPhoneWebElement;

    //ContactEmail webelement
    @FindBy (id = "ContactEmail")
    public WebElement contactEmailWebElement;

    //Notes webelement
    @FindBy (id = "Notes")
    public WebElement notesWebElement;

    //Approved webelement
    @FindBy (id="Approved")
    public WebElement approvedWebElement;

    //IsPaid webelement
    @FindBy (id = "IsPaid")
    public WebElement isPaidWebElement;

    //Save button webelement
    @FindBy(id = "btnSubmit")
    public WebElement saveButtonWebElement;


    //alert text webelement
    @FindBy (className = "bootbox-body")
    public WebElement alertTextWebElement;

    //alert button webelement
    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement alertButtonWebElement;

    //LIST OF RESERVATIONS yazısı
    @FindBy (xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfReservationsWebElement;
    //LISTOFUSER webelement
    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public  WebElement listOfUsersWebElement;
    public void addRoomReservations() {
        hotelManagerButonuWebElement.click();
        roomReservationsWebElement.click();
        addRoomReservationsWebElement.click();
    }

    //selectUser dropdown elementinden eleman seçer
    public void selectUserDropdownElementSecimi() {
        Faker faker = new Faker();
        Select select = new Select(selectUserDropdownWebElement);
        List<WebElement> idUserDropdownList = select.getOptions();
        int rnd = faker.random().nextInt(1, idUserDropdownList.size() - 1);
        select.selectByIndex(rnd);
    }

    //selecthotelroom dropdown elementinden eleman seçer
    public void selecthotelroomDropdownElementSecimi() {

        Select select = new Select(selecthotelroomDropdownWebElement);
        List<WebElement> idUserDropdownList = select.getOptions();
        int rnd = faker.random().nextInt(1, idUserDropdownList.size() - 1);
        select.selectByIndex(rnd);
    }

    public void dateStart() {
        LocalDate localDate = LocalDate.now();
        LocalDate eklenmisLocalDate = localDate.plusDays(10);
        DateTimeFormatter duzenliDateStart = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String localDateStr = eklenmisLocalDate.format(duzenliDateStart);
        dateStartWebElement.click();
        dateStartWebElement.sendKeys(localDateStr);
    }

    public void dateEnd() {
        LocalDate localDate = LocalDate.now();
        LocalDate eklenmisLocalDate = localDate.plusDays(15);
        DateTimeFormatter duzenliDateStart = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String localDateStr = eklenmisLocalDate.format(duzenliDateStart);
        dateStartWebElement.click();
        dateEndWebElement.sendKeys(localDateStr);
    }
    public void createHotelRoomReservation(){
        addRoomReservations();
        Actions actions=new Actions(Driver.getDriver());
        selectUserDropdownElementSecimi();
        selecthotelroomDropdownElementSecimi();
        priceWebElement.sendKeys("300");
        dateStart();
        ReusableMethods.waitFor(1);
        dateEnd();
        ReusableMethods.waitFor(2);
        actions.click(adultAmountWebElement).sendKeys("2").sendKeys(Keys.TAB).
                sendKeys("2").sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).
                sendKeys(faker.letterify("lkdflk").toLowerCase()).sendKeys(Keys.TAB).
                click(approvedWebElement).sendKeys(Keys.TAB).
                click(isPaidWebElement).sendKeys(Keys.TAB).
                click(saveButtonWebElement).perform();
        ReusableMethods.waitFor(5);

    }


}