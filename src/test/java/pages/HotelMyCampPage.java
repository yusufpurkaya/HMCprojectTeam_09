package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement homePageLoginButon;
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameKutusu;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButtonElement;
    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButtonElement;
    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]")
    public WebElement hotelListButonu;
    @FindBy(xpath = "//span[text()='List Of Hotels']")
    public WebElement listofHotelsYazi;
    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement detailsButonu;
    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editHotelYazi;
    @FindBy(xpath= "//input[@id='Code']")
    public WebElement codeKutusuWebElement;
    @FindBy(id = "Name")
    public WebElement nameKutusuWebElement;
    @FindBy(xpath = "//input[@name=\"Address\"]")
    public WebElement addressButonu;
    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phoneButtonu;
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailButonu;
    @FindBy(id = "IDGroup")
    public WebElement groupDrobdownElement;
    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButonu;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement htlwasupdatedsuccessfulyYazi;
    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement hotelguncelBasariliOKbuton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement guncellemedenSonraDeleteButon;
    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement enSonOKButonu;
    @FindBy (xpath = "//div[text()='Would you like to continue?']")
    public WebElement wldyliketoContinueYazi;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement htlsuccessfullyDeletedYazi;

}
