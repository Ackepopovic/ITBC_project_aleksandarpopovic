package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{



    @Test
    public void verifyClickMeButtonIsWorking(){
        getButtonsPage().openUrl();
        getActions().click(getButtonsPage().getClickMeButton()).perform();
        Assert.assertTrue(getButtonsPage().getSuccesMsgForClickMe().isDisplayed());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("buttons"));
    }


    @Test
    public void verifyDoubleClickMeButtonIsWorking(){
        getButtonsPage().openUrl();
        getActions().doubleClick(getButtonsPage().getDoubleClickMeButton()).perform();
        Assert.assertTrue(getButtonsPage().getSuccesMsgForDoubleMe().isDisplayed());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("buttons"));
    }


    @Test
    public void verifyRightClickMeButtonIsWorking() {
        getButtonsPage().openUrl();
        getActions().contextClick(getButtonsPage().getRightClickMeButton()).perform();
        Assert.assertTrue(getButtonsPage().getSuccesMsgForRightkMe().isDisplayed());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("buttons"));

    }
}
