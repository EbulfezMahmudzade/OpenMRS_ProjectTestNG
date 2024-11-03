package StepsDefinitions;

import Pages.FindPatientRecordE;
import UData.RandomData;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePatient extends BaseDriverParameter {
    @Test
    public void DeletePatient() {
        Login.Login();
        FindPatientRecordE fpr=new FindPatientRecordE();

        fpr.myClick(fpr.findPatientRecord);
        int randomNum= Tools.randomGenerator(fpr.patientNameList1.size());

        String patientName=fpr.patientNameList1.get(randomNum).getText();
        fpr.mySendKeys(fpr.searchBox,patientName);
        Tools.listContainsString(fpr.patientNameList1,patientName);

        fpr.patientNameList1.get(randomNum).click();
        Assert.assertTrue(patientName.contains(fpr.pageTitle.getText()));

        fpr.myClick(fpr.deleteLink);
        fpr.mySendKeys(fpr.deleteInputBox, RandomData.randomData);

        fpr.myClick(fpr.deleteConfirm);
        Assert.assertTrue(fpr.findPatienPageText.getText().equals(fpr.pageTitle.getText()));
    }
}
