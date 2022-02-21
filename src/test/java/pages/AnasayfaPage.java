package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AnasayfaPage {

public AnasayfaPage(){

    PageFactory.initElements(Driver.getDriver(), this);

}
    @FindBy(xpath = "//h2[text()='Welcome To Our Hotel']")
    public WebElement welcomeYazisiSonuc;
    @FindBy(linkText = "Home")
    public WebElement mainHomeButonu;
    @FindBy(linkText = "Rooms")
    public WebElement mainRoomsButonu;
    @FindBy(linkText = "Restaurant")
    public WebElement mainRestaurantButonu;
    @FindBy(linkText = "About")
    public WebElement mainAboutButonu;
    @FindBy(linkText = "Blog")
    public WebElement mainBlogButonu;
    @FindBy(linkText = "Contact")
    public WebElement mainContactButonu;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement mainLoginButonu;
    @FindBy(xpath = "//h2[text()='Log in']")
    public WebElement loginSayfasiBasariliGiris;
    @FindBy(xpath = "//input[@id='checkin_date']")
    public WebElement mainCheckinDateButonu;
    @FindBy(xpath = "//div[@class='datepicker-days']")
    public WebElement checkinDateSonuc;
    @FindBy(xpath = "//input[@id='checkout_date']")
    public WebElement mainCheckoutDateButonu;
    @FindBy(xpath = "//div[@class='datepicker-months']")
    public WebElement checkoutDateSonuc;
    @FindBy(xpath = "//select[@id='IDRoomType'] ")
    public WebElement anasayfaOdaTuruSecim;
    @FindBy(xpath = "(//p[@class='pt-1'])[1]")
    public WebElement birinciOdaButonu;
    @FindBy(xpath = "(//p[@class='pt-1'])[2]")
    public WebElement ikinciOdaButonu;
    @FindBy (xpath="(//p[@class='pt-1'])[3]")
    public WebElement ucuncuOdaButonu;
    @FindBy (xpath = "(//p[@class='pt-1'])[4]")
    public WebElement dorduncuOdaButonu;
    @FindBy (xpath = "(//p[@class='pt-1'])[5]")
    public WebElement besinciOdaButonu;
    @FindBy (xpath = "(//p[@class='pt-1'])[6]")
    public WebElement altinciOdaButonu;
    @FindBy (xpath = "(//div[@class='col-md-7 heading-section text-center ftco-animate fadeInUp ftco-animated'])[2]")
    public  WebElement recentBlogYazisi;
    @FindBy (xpath = "//a[.='Even the all-powerful Pointing has no control about the blind texts 6']")
    public  WebElement  recentblogButonu1;
    @FindBy (xpath = "//a[.='Even the all-powerful Pointing has no control about the blind texts 5']")
    public WebElement recentblogButonu2;
    @FindBy (xpath = "//a[.='Even the all-powerful Pointing has no control about the blind texts 4']")
    public WebElement recentblogButonu3;
    @FindBy (xpath = "//a[.='Even the all-powerful Pointing has no control about the blind texts 3']")
    public WebElement recentblogButonu4;
    @FindBy (id = "IDRoomType")
    public WebElement singleElementi;
    @FindBy(id = "AdultCount")
    public WebElement yetiskinSayisiButonu;


}