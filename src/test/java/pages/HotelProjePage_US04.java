package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelProjePage_US04 {

    public HotelProjePage_US04(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Hotelmycamp'])")
    public WebElement homePageText;

    @FindBy(linkText = "Log in")
    public WebElement hotelLoginButton;

    @FindBy(id="UserName")      ////input[@id='UserName']
    public WebElement hotelUsername;

    @FindBy(id="Password")
    public WebElement hotelPassword;

    @FindBy(id="btnSubmit")
    public WebElement hotelManagerLogin;

    @FindBy(xpath = "//span[text()='System Management']")
    public WebElement systemManagementLink;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLink;

    @FindBy(linkText = "Hotel List")
    public WebElement hotelListLink;

    @FindBy(xpath = "//span[text()='List Of Hotels']")
    public WebElement listOfHotelsText;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButton;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeTextBox;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement addressTextBox;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idgroupDropBox;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")    //Hotel was inserted successfully
    public WebElement successfullyText;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement getSuccessfullyOkButton;

    // Eklendigini kontrol icin List Of Hotels alninda bulunan Code kismindan arama
    @FindBy(xpath = "//input[@name='Code']")
    public WebElement listOfHotelsCodeSearch;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement getListOfHotelsSearchButton;



}
