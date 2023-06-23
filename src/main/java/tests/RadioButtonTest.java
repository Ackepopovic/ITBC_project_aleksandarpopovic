package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{

    @Test
    public void verifyRadioYesButtonIsWorking(){
        getRadioButtonPage().openUrl()
                .clickRadioButton()
                .clickYesCheckBox()
                .assertSuccesMsg();
        Assert.assertTrue(getRadioButtonPage().getSuccesMsg().getText().contains("Yes"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("radio-button"));
    }
    @Test
    public void verifyRadioImpressiveButtonIsWorking() {
        getRadioButtonPage().openUrl()
                .clickRadioButton()
                .clickImpressiveCheckBox()
                .assertSuccesMsg();
        Assert.assertTrue(getRadioButtonPage().getSuccesMsg().getText().contains("Impressive"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("radio-button"));
    }


}
