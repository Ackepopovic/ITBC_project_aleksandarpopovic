package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void VerifyThatUserCanMoveSlider(){
        getSliderPage().openUrl();
                getActions().dragAndDropBy(getSliderPage().getSlider(), 50, 0).perform();
        Assert.assertTrue(getSliderPage().getSlider().getAttribute("value").equals("58"));

    }
}
