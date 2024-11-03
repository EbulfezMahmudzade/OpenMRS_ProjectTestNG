package StepsDefinitions;

import Pages.LoginE;
import UData.InvalidData;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class CheckingLoginErrors02 extends BaseDriverParameter {
    @Test
    public void LoginErrorsControlTest01()
    {
        driver.get("https://openmrs.org/tr/");
        LoginE le=new LoginE();

        le.myClick(le.demoButton);
        wait.until(ExpectedConditions.visibilityOf(le.EnterTheOpenMRS2Demo)).click();
        le.mySendKeys(le.userNameBox,InvalidData.userName);
        le.mySendKeys(le.passwordBox,InvalidData.password);

        int randomNum = Tools.randomGenerator(le.sessionLocation.size());
        System.out.println(randomNum);
        le.sessionLocation.get(randomNum).click();
        le.myClick(le.logInButton);
        wait.until(ExpectedConditions.visibilityOf(le.invalidNamePassText));
        Tools.MessageValidation(le.invalidNamePassText,"Invalid username/password. Please try again.");
    }

    }

