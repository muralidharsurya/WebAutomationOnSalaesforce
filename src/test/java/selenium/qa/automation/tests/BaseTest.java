package selenium.qa.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public ChromeDriver driver = new ChromeDriver(); ;
    @BeforeMethod
    public void setUp() {
       System.setProperty("webdriver.chrome.driver", "E:\\Automation_ws\\salesForce\\SalesForceUIAutomation\\Automation\\src\\main\\resources\\Drivers\\chromedriver.exe");
        // Initialize ChromeDriver
       // driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
//
//      //  driver.get("https://login.salesforce.com/");
//        driver.findElement(By.id("username")).sendKeys("muralidhar.s.026-acvu@force.com");
//        driver.findElement(By.id("password")).sendKeys("$Muralidhar026");
//        driver.findElement(By.id("Login")).click();

    }



}
