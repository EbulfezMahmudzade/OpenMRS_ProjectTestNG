package Utlity;

import Pages.LoginE;
import UData.userData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

import static StepsDefinitions.Login.Login;

public class BaseDriverParameter {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;


    @BeforeClass
    @Parameters("BrowserType")
    public void Start(String BrowserType){
        switch (BrowserType.toLowerCase())
        {
            case "firefox":driver= new FirefoxDriver();break;
            case "edge":driver=new EdgeDriver();break;
            default:driver=new ChromeDriver();
        }

        actions=new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Login();
    }
    @AfterClass
    public void Finish()
    {
        Tools.Wait(3);
        driver.quit();
    }
    public static void Login() {

        driver.get("https://openmrs.org/tr/");
        LoginE le=new LoginE();

        le.myClick(le.demoButton);
        le.myClick(le.EnterTheOpenMRS2Demo);
        le.mySendKeys(le.userNameBox, userData.userName);
        le.mySendKeys(le.passwordBox,userData.password);

        int randomNum = Tools.randomGenerator(le.sessionLocation.size());
        System.out.println(randomNum);
        le.sessionLocation.get(randomNum).click();

        le.myClick(le.logInButton);
        wait.until(ExpectedConditions.visibilityOf(le.textControl));
        Assert.assertTrue(le.textControl.getText().contains("Logged in"), "Could not log in.");
    }

}
