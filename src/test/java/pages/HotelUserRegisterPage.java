package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelUserRegisterPage {
    public HotelUserRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //login butonu
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLinki;
    //Create a new account butonu
    @FindBy(xpath = "//span[text()='Create a new account']")
    public WebElement createANewAccountBox;
    //Registration Form Username butonu
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;
    //Registration Form Password butonu
    @FindBy(id= "Password")
    public WebElement passwordBox;
    //Registration Form Email Address butonu
    @FindBy(id="Email")
    public WebElement emailBox;
    //Registration Form Full Name butonu
    @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement fullnameBox;
    //Registration Form Phone No butonu
    @FindBy(xpath = "//input[@id='PhoneNo']")
    public WebElement phoneNoBox;
    //Registration Social Security No butonu
    @FindBy(xpath = "//input[@id='SSN']")
    public WebElement socialSecurityNumberBox;
    //Registration Form Driving License butonu
    @FindBy(xpath = "//input[@id='DrivingLicense']")
    public WebElement drivingLicenseBox;
    //Registration Form Select Country butonu
    @FindBy(xpath = "//select[@title='Select Country']")
    public WebElement selectCountryDropDown;
    //Registration Form Select State butonu
    @FindBy(xpath = "//select[@title='Select State']")
    public WebElement selectStateDropDown;
    //Registration Form  Address butonu
    @FindBy(xpath = "//input[@id='Address']")
    public WebElement addressBox;
    //Registration Form Working Sector butonu
    @FindBy(xpath = "//input[@id='WorkingSector']")
    public WebElement workingSectorBox;
    //Registration Form BirthDate butonu
    @FindBy(xpath = "//input[@id='BirthDate']")
    public WebElement birthDateBox;
    //Registration Form Save butonu
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement saveLinki;
    //Kullanici bilgileri basariyla girildi uyarisi
    @FindBy(xpath = "(//div[text()='User Data was inserted successfully'])[2]")
    public WebElement userDataGirisiBasariliUyarisi;
    //OK butonu
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement OK;
    //gecersiz email ile kayit yazisi
    //@FindBy(xpath = "//div[text()='this email address is already taken']")
    //public WebElement invalidEmail;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement invalidValueOKbutonu;

}
