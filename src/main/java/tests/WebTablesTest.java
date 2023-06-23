package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest{

    @Test
    public void verifyWebTablesCanAdd(){
        getWebTablesPage().openUrl()
                .clickWebTablesButton()
                .clickAddButton()
                .enterFirstName("Marko")
                .enterLastName("Markovic")
                .enterEmail("markomarkovic@yahoo.com")
                .enterAge("20")
                .enterSalary("1000")
                .enterDepartment("Some Department")
                .clickSubmitButton();
        Assert.assertTrue(getWebTablesPage().getConfirmMsg().isDisplayed());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("webtables"));
    }


}
