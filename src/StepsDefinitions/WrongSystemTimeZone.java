package StepsDefinitions;

import Pages.WrongSystemTimeZoneE;
import UData.userData;
import Utlity.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WrongSystemTimeZone extends BaseDriverParameter {

    @Test
    public void wrongSystemTimeZone() {
        WrongSystemTimeZoneE elements = new WrongSystemTimeZoneE();

        elements.appointmentScheduling.click();
        elements.manageAppointments.click();
        elements.serachBox.sendKeys(userData.patientId);
        wait.until(ExpectedConditions.elementToBeClickable(elements.patientDetails)).click();
        wait.until(ExpectedConditions.visibilityOf(elements.noteError));
        Assert.assertTrue(elements.noteError.getText().equals(elements.noteErrorText), "Error message not found!!");

    }

}

