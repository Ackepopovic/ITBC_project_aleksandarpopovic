package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void inputInvalidUsernameAndPassword()  {
        getLoginPage().openUrl()
                .enterUsername("Marko")
                .enterPassword("Marko1234")
                .clickLoginButton();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        Assert.assertTrue(getLoginPage().getErrorMsg().isDisplayed());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("login"));
    }
}
