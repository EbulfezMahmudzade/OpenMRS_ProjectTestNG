package StepsDefinitions;

import Pages.LogoutE;
import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends BaseDriverParameter {


    @Test//TC0201 bagla
    public void LogoutTest()
    {
        Login.Login();
        LogoutE lge=new LogoutE();

        lge.myClick(lge.logoutButton);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.openmrs.org/openmrs/login.htm"),"URL not found!");
    }
}
