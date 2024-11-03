package Pages;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WrongSystemTimeZoneE extends ParentE {
    public WrongSystemTimeZoneE() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@id='apps']/a[5]")
    public WebElement appointmentScheduling;

    @FindBy(xpath = "(//a[contains(@id,'appointmentschedulingui')])[3]")
    public WebElement  manageAppointments;

    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement serachBox;

    @FindBy(xpath = "//tr[@class='odd']")
    public WebElement patientDetails;

    public static final String noteErrorText = "Your computer is not set to the right time zone. Please change" +
            " to Coordinated Universal Time and then close and restart your browser to assure proper scheduling functionality.";
    @FindBy(xpath = "//div[@class='note error']//p")
    public WebElement noteError;
}
