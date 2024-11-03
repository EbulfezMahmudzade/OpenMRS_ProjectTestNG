package StepsDefinitions;

import Pages.MyAccountE;
import Utlity.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyAccount extends BaseDriverParameter {
    @Test
    public void MyAccount() {
        Login.Login();
        MyAccountE elements = new MyAccountE();


        actions.moveToElement(elements.profilIcon).build().perform();
        wait.until(ExpectedConditions.visibilityOf(elements.myAccountLink));
        elements.myAccountLink.click();


        Assert.assertTrue(elements.myLanguages.isDisplayed(),"My Languages Not Displayed!");
        elements.myLanguages.click();
        driver.navigate().back();

        Assert.assertTrue(elements.changePassword.isDisplayed(),"Change Password Not Displayed!");
        elements.changePassword.click();
        driver.navigate().back();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.openmrs.org/openmrs/adminui/myaccount/myAccount.page"));

    }

}

