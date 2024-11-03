package StepsDefinitions;

import Pages.LoginE;
import UData.userData;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Login extends BaseDriverParameter {
    @Test
    public static void Login() {

        driver.get("https://openmrs.org/tr/");
        LoginE le=new LoginE();

        le.myClick(le.demoButton);
        le.myClick(le.EnterTheOpenMRS2Demo);
        le.mySendKeys(le.userNameBox, userData.userName);
        le.mySendKeys(le.passwordBox,userData.password);

        int randomNum = Tools.randomGenerator(le.sessionLocation.size());
        System.out.println(randomNum);
        le.sessionLocation.get(randomNum).click();

        le.myClick(le.logInButton);
        wait.until(ExpectedConditions.visibilityOf(le.textControl));
        Assert.assertTrue(le.textControl.getText().contains("Logged in"), "Could not log in.");
    }
}
