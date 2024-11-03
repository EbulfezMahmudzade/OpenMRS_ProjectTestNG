package StepsDefinitions;

import Pages.FindPatientRecordE;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListPatient extends BaseDriverParameter {
    @Test
    public void ListPatient() {
        Login.Login();
        FindPatientRecordE fpr = new FindPatientRecordE();

        fpr.findPatientRecord.click();
        int patientAmount1 = fpr.patientNameList1.size();
        System.out.println("patientAmount = " + patientAmount1);
        fpr.myClick(fpr.nextLink);
        int patientAmount2 = fpr.patientNameList2.size();
        System.out.println("patientAmount2 = " + patientAmount2);
        String patientSum= String.valueOf(patientAmount1+patientAmount2);
        System.out.println("patientSum = " + patientSum);
        String resultsText = fpr.patientResultsTabel.getText();
        System.out.println("resultsText = " + resultsText);

        Assert.assertTrue(resultsText.contains(patientSum));
    }
}
