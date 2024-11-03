package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    @BeforeClass
    public void Start() {

        driver = new ChromeDriver();
        actions = new Actions(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Login.Login();
    }

    @AfterClass
    public void Finish() {
        Tools.Wait(3);
        driver.quit();
    }

}
