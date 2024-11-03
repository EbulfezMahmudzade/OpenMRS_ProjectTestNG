package StepsDefinitions;

import Pages.PatientRegisterE;
import UData.RandomData;
import Utlity.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatientRegister extends BaseDriverParameter {

    @Test
    public static void PatientRegister() {
        Login.Login();
        PatientRegisterE pr = new PatientRegisterE();

        pr.myClick(pr.PatientRegisterBtn);
        pr.mySendKeys(pr.patientName, RandomData.patientNameRnd);
        pr.mySendKeys(pr.patientFamliyName, RandomData.patientFamilyNameRnd);
        pr.myClick(pr.nextButton);
        actions.doubleClick(pr.patientGender).build().perform();
        pr.myClick(pr.nextButton);
        pr.mySendKeys(pr.patientEstimatedYears, RandomData.yearsRnd);
        pr.mySendKeys(pr.patientEstimatedMonths, RandomData.monthsRnd);
        pr.myClick(pr.nextButton);
        pr.mySendKeys(pr.address, RandomData.randomData);
        pr.mySendKeys(pr.city, RandomData.randomData);
        pr.mySendKeys(pr.country, RandomData.randomData);
        pr.mySendKeys(pr.postalCode, RandomData.randomData);
        pr.myClick(pr.nextButton);
        pr.myClick(pr.nextButton);
        pr.myClick(pr.nextButton);
        pr.myClick(pr.confirmButton);
        wait.until(ExpectedConditions.visibilityOf(pr.patientNameCheck));
        Assert.assertTrue(pr.patientIdCheck.isDisplayed(), "Patient ID not found!");
        Assert.assertTrue(pr.patientNameCheck.getText().equals(RandomData.patientNameRnd), "Text Not Found!");
    }
}
