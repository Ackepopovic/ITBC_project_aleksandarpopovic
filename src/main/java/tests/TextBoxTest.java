package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    public void VerifyTextBoxCanSubmit(){
        getTextBoxPage().openUrl()
                .clickElementsButton()
                .clickTextBoxButton()
                .enterFullName("Aleksandar")
                .enterEmail("itbootcamp@gmail.com")
                .enterCurentAddress("Nis")
                .enterPermAddress("Nis dozivotno :)")
                .clickSubmitButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("text-box"));

    }
}
