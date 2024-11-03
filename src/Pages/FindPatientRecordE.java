package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Utlity.BaseDriverParameter.driver;

public class FindPatientRecordE extends ParentE{
    public FindPatientRecordE()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='apps']/a[1]")
    public WebElement  findPatientRecord;

    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement searchBox;

        @FindBy(xpath = "//*[@id=\"patient-search-results-table\"]/tbody/tr/td")
    public List<WebElement> patientNameList1;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> patientNameList2;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement nextLink;

    @FindBy(xpath = "//tbody[@role='alert']")
    public WebElement patientDetails;

    @FindBy(xpath = "//ul[@id='breadcrumbs']")
    public WebElement pageTitle;

    @FindBy(xpath = "//tr[@class='odd']/td")
    public WebElement nonPatient;

    @FindBy(xpath = "//ul[@class='float-left']//li[8]")
    public WebElement deleteLink;

    @FindBy(xpath = "//input[@id='delete-reason']")
    public WebElement deleteInputBox;

    @FindBy(xpath = "//div[starts-with(@id,'delete')]/div//button[1]")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//h2")
    public WebElement findPatienPageText;

    @FindBy(xpath = "//div[@class='dataTables_info']")
    public WebElement patientResultsTabel;

}
