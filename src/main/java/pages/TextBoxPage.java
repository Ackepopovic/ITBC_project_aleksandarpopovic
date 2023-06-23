package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {

    private WebElement elementsButton;
    private WebElement textBoxButton;
    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitButton;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getElementsButton() {
        elementsButton = getDriver().findElement(By.xpath("//div[@class='card-body']"));
        return elementsButton;
    }

    public WebElement getTextBoxButton() {
        textBoxButton = getDriver().findElement(By.xpath("//li[@class='btn btn-light ']"));
        return textBoxButton;
    }

    public WebElement getFullNameField() {
        fullNameField = getDriver().findElement(By.id("userName"));
        return fullNameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getCurrentAddressField() {
        currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddressField;
    }

    public WebElement getSubmitButton() {
        submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }
    public TextBoxPage clickElementsButton(){
        getElementsButton().click();
        return this;
    }
    public TextBoxPage clickTextBoxButton(){
        getTextBoxButton().click();
        return this;
    }
    public TextBoxPage enterFullName(String name){
        getFullNameField().sendKeys(name);
        return this;
    }
    public TextBoxPage enterEmail(String email){
        getEmailField().sendKeys(email);
        return this;
    }
    public TextBoxPage enterCurentAddress(String text){
        getCurrentAddressField().sendKeys(text);
        return this;
    }
    public TextBoxPage enterPermAddress(String text) {
        getPermanentAddressField().sendKeys(text);
        return this;
    }
    public TextBoxPage clickSubmitButton(){
        getSubmitButton().click();
        return this;
    }
    public TextBoxPage openUrl(){
        getDriver().get("https://demoqa.com");
        return this;
    }

}
