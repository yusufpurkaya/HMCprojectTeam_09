package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import java.security.cert.X509Certificate;
public class Us0006 {
    public Us0006(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkSayfaLoginButtonWebElement;
    //username textbox
    @FindBy(id = "UserName")
    public  WebElement usernameWebElement;
    //password textbox
    @FindBy(id = "Password")
    public  WebElement passwordWebElement;
    //AccountLogin butonu
    @FindBy(id = "btnSubmit")
    public WebElement accountLoginWebElement;
    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButonu;
    @FindBy(xpath = "(//i[@class='icon-calendar'])[3]")
    public WebElement hotelRoomsButonu;
    @FindBy(className = "caption")
    public WebElement listOfHotelRoomsElementi;
    @FindBy(className = "hidden-480")
    public WebElement addHotelRoomButonu;
    @FindBy(className = "caption")
    public WebElement createHotelRoomElementi;
    @FindBy(xpath = "//select[@name='IDHotel']")
    public WebElement idHotelElementi;
    @FindBy(id = "Code")
    public WebElement otelEklemeCode;
    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[2]")
    public WebElement otelEklemeName;
    @FindBy(id="Location")
    public WebElement locationBox;
    @FindBy(xpath="//textarea[ @dir='ltr']")
    public WebElement textBox;
    @FindBy(id="Price")
    public WebElement priceBox;
    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeElementi;
    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCountElementi;
    @FindBy(id="MaxChildCount")
    public WebElement maxChildElementi;
    @FindBy(id = "uniform-IsAvailable")
    public WebElement approvedButonu;
    @FindBy(id = "btnSubmit")
    public WebElement saveButonu;
    @FindBy(className = "bootbox-body")
    public WebElement successfullyElementi;
    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement kabul;
    @FindBy(id ="lkpHotels")
    public WebElement roomListIdHotelElementi;
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[3]/div/div/div[2]/div/div/div[2]/table/tbody/tr[3]/td[9]/a")///html/body/div[3]/div[2]/div/div[3]/div/div/div[2]/div/div/div[2]/table/tbody/tr[3]/td[9]/a
    public WebElement detailsButonu; ////*[@id="datatable_ajax"]/tbody/tr[3]/td[9]/a
    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editHotelRoomElementi;
    @FindBy(id ="btnDelete")
    public WebElement roomDeleteButonu;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement roomClearElement;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement silindiElementi;
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement tekrarLoginUsernameBox;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement tekrarLoginPasswordBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement tekrarLoginButonu;
    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkSayfaLoginButtonWebElement.click();
        usernameWebElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordWebElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        accountLoginWebElement.click();
    }
}
