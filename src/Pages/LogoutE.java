package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utlity.BaseDriver.driver;

public class LogoutE extends ParentE {
    public LogoutE()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//li[contains(@class,'logout')]/a")
    public WebElement logoutButton;
}
