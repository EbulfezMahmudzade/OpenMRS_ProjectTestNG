package StepsDefinitions;

import Pages.MergingPatientE;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MergingPatientRecords extends BaseDriverParameter {

    @Test
    public void MergingPatient() {
        MergingPatientE mp = new MergingPatientE();
        mp.myClick(mp.dataManagement);
        mp.myClick(mp.mergePatientElectronicRecords);
        mp.mySendKeys(mp.searchByName, "100");
        List<WebElement> IDss = new ArrayList<>();
        IDss.add(mp.patientIdBox1);
        IDss.add(mp.patientIdBox2);

        for (int i = 0; i < IDss.size(); i++) {
            wait.until(ExpectedConditions.visibilityOf(mp.IDs.get(i)));
            IDss.get(i).sendKeys(mp.IDs.get(i).getText());
            if (i == 1) {
                IDss.get(i).sendKeys(Keys.ENTER);

            }

        }
        mp.myClick(mp.yesContinueBtn);
        mp.myClick(mp.firstPatient);

        Assert.assertTrue(mp.mergePatientControlMessage.getText().contains("Merging cannot be undone!"));

        mp.myClick(mp.yesContinueBtn);

        int randomIDsControl = (int) (Math.random() * mp.IDsControl.size());
        String randomIdsControlStr = mp.IDsControl.get(randomIDsControl).getText();

        wait.until(ExpectedConditions.visibilityOf(mp.IDsControl.get(randomIDsControl)));
        Assert.assertTrue(mp.IDsControl.get(randomIDsControl).getText().contains(randomIdsControlStr));

    }
}