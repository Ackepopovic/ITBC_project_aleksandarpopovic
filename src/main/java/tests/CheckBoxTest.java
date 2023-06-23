package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void VerifyCheckBoxIsWorking() {
        getCheckBoxPage().openUrl()
                        .clickHomeCheckBox();
        Assert.assertTrue(getCheckBoxPage().getCheckBoxSelected().isSelected());

    }
}
