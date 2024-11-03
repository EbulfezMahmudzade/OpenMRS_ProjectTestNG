package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utlity.BaseDriver.driver;

public class PatientRegisterE extends ParentE {
    public PatientRegisterE()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//div[@id='apps']/a[4]")
    public WebElement PatientRegisterBtn;

    @FindBy(xpath ="//input[@name='givenName']")
    public WebElement patientName;

    @FindBy(xpath ="//input[@name='familyName']")
    public WebElement patientFamliyName;

    @FindBy(xpath ="//select[@name='gender']")
    public WebElement patientGender;

    @FindBy(id ="birthdateYears-field")
    public WebElement patientEstimatedYears;

    @FindBy(id ="birthdateMonths-field")
    public WebElement patientEstimatedMonths;

    @FindBy(id ="address1")
    public WebElement address;

    @FindBy(id ="cityVillage")
    public WebElement city;

    @FindBy(id ="country")
    public WebElement country;

    @FindBy(id ="postalCode")
    public WebElement postalCode;

    @FindBy(id ="next-button")
    public WebElement nextButton;

    @FindBy(id ="submit")
    public WebElement confirmButton;

    @FindBy(xpath ="//span[@class='labeled']/span[@class='PersonName-givenName']")
    public WebElement patientNameCheck;

    @FindBy(xpath ="//div[@class='float-sm-right']/span")
    public WebElement patientIdCheck;

}
