package StepsDefinitions;

import Pages.LoginE;
import UData.InvalidData;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class CheckingLoginErrors01 extends BaseDriverParameter {

    @Test
    public void LoginErrorsControlTest01()
    {
        driver.get("https://openmrs.org/tr/");
        LoginE le=new LoginE();

        le.myClick(le.demoButton);
        wait.until(ExpectedConditions.visibilityOf(le.EnterTheOpenMRS2Demo)).click();
        le.mySendKeys(le.userNameBox,InvalidData.userName);
        le.mySendKeys(le.passwordBox,InvalidData.password);
        le.myClick(le.logInButton);
        wait.until(ExpectedConditions.visibilityOf(le.locationSessionText));
        Tools.MessageValidation(le.locationSessionText,"You must choose a location!");

    }
    }

