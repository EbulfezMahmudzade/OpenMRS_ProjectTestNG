package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Utlity.BaseDriverParameter.driver;

public class MergingPatientE extends ParentE{
    public MergingPatientE()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='apps']/a[7]")
    public WebElement dataManagement;

    @FindBy(xpath = "//div[@id='body-wrapper']//a")
    public WebElement mergePatientElectronicRecords;

    @FindBy(id = "patient-search")
    public WebElement searchByName;

    @FindBy(xpath = "//tbody[@role='alert']//td[starts-with(text(),'100')]")
    public List<WebElement> IDs;

    @FindBy(xpath = "//input[@id='patient1-text']")
    public WebElement patientIdBox1;

    @FindBy(xpath = "//input[@id='patient2-text']")
    public WebElement patientIdBox2;

    @FindBy(id = "confirm-button")
    public WebElement yesContinueBtn;

    @FindBy(id = "first-patient")
    public WebElement firstPatient;

    @FindBy(xpath = "//div[@class='messages-container']/h1")
    public WebElement mergePatientControlMessage;

    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public List<WebElement> IDsControl;
}
