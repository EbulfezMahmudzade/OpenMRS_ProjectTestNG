package StepsDefinitions;

import Pages.FindPatientRecordE;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindPatientRecord extends BaseDriverParameter {
    @Test
    public void FindPatient() {
        Login.Login();
        FindPatientRecordE fpr = new FindPatientRecordE();

        fpr.findPatientRecord.click();
        int randomNum = Tools.randomGenerator(fpr.patientNameList1.size());

        String patientName = fpr.patientNameList1.get(randomNum).getText();
        fpr.mySendKeys(fpr.searchBox, patientName);
        Tools.listContainsString(fpr.patientNameList1, patientName);

        fpr.patientNameList1.get(randomNum).click();
        Assert.assertTrue(patientName.contains(fpr.pageTitle.getText()));
    }
}
