package selenium.qa.automation.tests;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;


public class SalesforceLoginTest extends BaseTest {
    Actions ac = new Actions(driver);



    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "Login")
    private WebElement loginButton;


    @FindBy(xpath = "//div[contains(@role,'list')]//a/span[contains(text(),'Home')]")
    private WebElement homeTab;
    @FindBy(xpath = "(//lightning-layout[@class=\"header slds-grid\"])[2]/slot/lightning-layout-item[2]/slot//button [@type='button']")
    private WebElement clickOnNew;

    @FindBy(xpath = "//input[@name='Name']")
    private WebElement opportunityName;

    @FindBy(xpath = "//input[@placeholder='Search Accounts...']")
    private WebElement clinOnAccountName;

    @FindBy(xpath = "//span[text()='New Account']")
    private WebElement clickNewAccount;

    @FindBy(xpath = "(//input[@class=\" input\"])[1]")
    private WebElement sendingNewAccountName;

    @FindBy(xpath="//span[text()='Save']")
    private WebElement clickOnSavaButton;

    @FindBy(xpath = "//input[@name='CloseDate']")
    private WebElement clickOnDateField;

    @FindBy(xpath = "(//td[@role='gridcell']//span[text()='30'])[2]")
    private WebElement clickOnDate;

    @FindBy(xpath = "(//div[@role='none']//button[@aria-expanded='false'])[3]")
    private WebElement  clickOnstage;

    @FindBy(xpath = "//span[text()='Qualify']")
    private WebElement clickOnQualify;

    @FindBy(xpath = "//button[text()='Save']']")
    private WebElement  clickSaveButton;


    @FindBy(xpath = "//div[contains(@role, 'list')]//a/span[contains(text(),'Accounts')]")
    private WebElement accountsTab;

    @FindBy(xpath = "//div[contains(@role, 'list')]//a/span[contains(text(),'Contacts')]")
    private WebElement contactsTab;

    @FindBy(xpath = "//div[contains(@role, 'list')]//a/span[contains(text(),'Sales')]")
    private WebElement salesTab;

    @FindBy(xpath = "//div[contains(@role, 'list')]//a/span[contains(text(),'Outreach')]")
    private WebElement outreachTab;

    @FindBy(xpath = "//div[contains(@role, 'list')]//a/span[contains(text(),'Service')]")
    private WebElement serviceTab;


    @BeforeTest
    public void setup() {
        driver.get("https://login.salesforce.com/");
        PageFactory.initElements(driver, this);
        userName.sendKeys("muralidhar.s.026-acvu@force.com");
        passwordInput.sendKeys("$Muralidhar026");
        loginButton.click();

    }

    @Test(priority = 1)
    public void clickOnHome() throws InterruptedException {

        Actions ac = new Actions(driver);
        ac.moveToElement(homeTab);
        ac.click().perform();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.presenceOfElementLocated((By) clickOnNew));
        Thread.sleep(5000);
        ac.moveToElement(clickOnNew);
        ac.click().build().perform();
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait1.until(ExpectedConditions.presenceOfElementLocated((By)  opportunityName));
        Thread.sleep(4000);
        ac.moveToElement(opportunityName).perform();
        opportunityName.sendKeys("India");
        Thread.sleep(2000);

        ac.moveToElement(clinOnAccountName).perform();
        clinOnAccountName.click();
        Thread.sleep(2000);
        ac.moveToElement(clickNewAccount).perform();
        Thread.sleep(2000);
        clickNewAccount.click();



        ac.moveToElement(sendingNewAccountName).perform();
        Thread.sleep(2000);
        sendingNewAccountName.sendKeys("PrimeMinister1" );

         ac.moveToElement(clickOnSavaButton).perform();
        Thread.sleep(2000);
        clickOnSavaButton.click();

        ac.moveToElement(clickOnDateField).perform();
        Thread.sleep(5000);
        clickOnDateField.click();

        ac.moveToElement(clickOnDate).perform();
        Thread.sleep(3000);
        clickOnDate.click();


        ac.moveToElement( clickOnstage).perform();
        Thread.sleep(3000);
        clickOnstage.click();

        ac.moveToElement(clickOnQualify).perform();
        Thread.sleep(3000);
        clickOnQualify.click();


        Thread.sleep(10000);
        ac.moveToElement(clickOnSavaButton).perform();
        Thread.sleep(5000);
        clickOnSavaButton.click();


    }

   // @Test(priority = 2)
//    public void ClikOnAccount() {
//        ac.moveToElement(clickOnForecast);
//        ac.click().perform();
//        clickOnForecast.click();

}


