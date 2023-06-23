package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckBoxPage extends BasePage {



    private WebElement homeCheckBox;
    private WebElement checkBoxSelected;
    private WebElement selectedMsg;

    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }




    public WebElement getHomeCheckBox() {
        homeCheckBox = getDriver().findElement(By.xpath("//label[contains(.,'Home')]"));
        return homeCheckBox;
    }

    public WebElement getCheckBoxSelected() {
        checkBoxSelected = getDriver().findElement(By.xpath("//label[contains(.,'Home')]//input"));
        return checkBoxSelected;
    }

    public WebElement getSelectedMsg() {
        selectedMsg = getDriver().findElement(By.xpath("//span[@class='text-success']"));
        return selectedMsg;
    }

    public CheckBoxPage clickHomeCheckBox(){
        getHomeCheckBox().click();
        return this;
    }
    public CheckBoxPage checkBoxSelectedIsTrue(){
        Assert.assertTrue(getCheckBoxSelected().isSelected());
        return this;
    }
    public CheckBoxPage verifySelectedMsg(){
        getSelectedMsg().isDisplayed();
        return this;
    }
    public CheckBoxPage openUrl(){
        getDriver().get("https://demoqa.com/checkbox");
        return this;
    }

}
