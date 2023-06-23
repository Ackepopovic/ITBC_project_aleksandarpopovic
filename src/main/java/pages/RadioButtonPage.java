package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RadioButtonPage extends BasePage{

    private WebElement radioButton;
    private WebElement yesCheckBox;
    private WebElement impressiveCheckBox;
    private WebElement succesMsg;
    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getRadioButton() {
        radioButton = getDriver().findElement(By.id("item-2"));
        return radioButton;
    }

    public WebElement getYesCheckBox() {
        yesCheckBox = getDriver().findElement(By.xpath("//label[@class='custom-control-label']"));
        return yesCheckBox;
    }

    public WebElement getImpressiveCheckBox() {
        impressiveCheckBox = getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return impressiveCheckBox;
    }

    public WebElement getSuccesMsg() {
        succesMsg = getDriver().findElement(By.xpath("//p[@class='mt-3']"));
        return succesMsg;
    }
    public RadioButtonPage clickRadioButton(){
        getRadioButton().click();
        return this;
    }
    public RadioButtonPage clickYesCheckBox(){
        getYesCheckBox().click();
        return this;
    }
    public RadioButtonPage clickImpressiveCheckBox(){
        getImpressiveCheckBox().click();
        return this;
    }
    public RadioButtonPage assertSuccesMsg(){
        return this;
    }
    public RadioButtonPage openUrl(){
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }
}
