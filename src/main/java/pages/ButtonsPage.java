package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage {

    private WebElement doubleClickMeButton;
    private WebElement rightClickMeButton;
    private WebElement clickMeButton;
    private WebElement succesMsgForClickMe;
    private WebElement succesMsgForDoubleMe;
    private WebElement succesMsgForRightkMe;

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getDoubleClickMeButton() {
        doubleClickMeButton = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickMeButton;
    }

    public WebElement getRightClickMeButton() {
        rightClickMeButton = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMeButton;
    }

    public WebElement getClickMeButton() {
        clickMeButton = getDriver().findElement(By.xpath("//button[text()='Click Me']"));
        return clickMeButton;
    }

    public WebElement getSuccesMsgForClickMe() {
        succesMsgForClickMe = getDriver().findElement(By.id("dynamicClickMessage"));
        return succesMsgForClickMe;
    }

    public WebElement getSuccesMsgForDoubleMe() {
        succesMsgForDoubleMe = getDriver().findElement(By.id("doubleClickMessage"));
        return succesMsgForDoubleMe;
    }

    public WebElement getSuccesMsgForRightkMe() {
        succesMsgForRightkMe = getDriver().findElement(By.id("rightClickMessage"));
        return succesMsgForRightkMe;
    }

    public ButtonsPage clickClickMeButton(){
        getClickMeButton().click();
        return this;
    }

    public ButtonsPage openUrl(){
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }
}
