package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest{

    @Test
    public void VerifyIfLinksWorkPropertly(){
        getLinksPage().openUrl()
                .clickHomeLink();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://demoqa.com"));
    }

    @Test
    public void verifyIfLinksGoingToSendAnApiCall(){
        getLinksPage().openUrl()
                .clickCreatedLink()
                .clickNoContentLink()
                .clickMovedLink()
                .clickBadRequestLink()
                .clickForbiddenLink()
                .clickNotFoundLink();
        Assert.assertTrue(getLinksPage().getSuccessMsg().getText().contains("Link has responded with staus"));
    }
}
