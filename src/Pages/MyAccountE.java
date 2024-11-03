package Pages;


import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountE {
    public MyAccountE() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//i[@class='icon-user small']")
    public WebElement profilIcon;

    @FindBy(xpath = "//ul[@id='user-account-menu']//a")
    public WebElement myAccountLink;


    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement serachBox;

    @FindBy(xpath = "//div[@class='task']/i[@class='icon-lock']")
    public WebElement changePassword;

    @FindBy(xpath = "//div[@class='task']/i[@class='icon-cog']")
    public WebElement myLanguages;

}
