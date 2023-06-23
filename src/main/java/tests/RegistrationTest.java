package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void verifyYouCanRegister() throws InterruptedException {
                getRegistrationPage().openUrl()
                        .enterFirstName("Marko")
                        .enterLastName("Markovic")
                        .enterUsername("MarkoMarkovic")
                        .enterPassword("Marko1234")
                        .clickRegisterButton();
                Assert.assertTrue(getRegistrationPage().captchaErrorMsg().isDisplayed());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("register"));


    }
}
