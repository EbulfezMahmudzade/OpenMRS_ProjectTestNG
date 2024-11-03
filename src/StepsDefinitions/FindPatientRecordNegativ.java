package StepsDefinitions;

import Pages.FindPatientRecordE;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindPatientRecordNegativ extends BaseDriverParameter {
    @Test
    public void FindPatientNegativ() {
        Login.Login();
        FindPatientRecordE fpr = new FindPatientRecordE();
        fpr.findPatientRecord.click();
        int randomNum = Tools.randomGenerator(fpr.patientNameList1.size());
        String patientName = fpr.patientNameList1.get(randomNum).getText();
        fpr.mySendKeys(fpr.searchBox, patientName + "negativ");
        Assert.assertTrue(fpr.nonPatient.isDisplayed());
    }
}
