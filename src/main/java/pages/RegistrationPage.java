package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RegistrationPage extends BasePage {


    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement captchaErrorMsg;
    private WebElement registerButton;


    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFirstNameField() {
        firstNameField = getDriver().findElement(By.id("firstname"));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        lastNameField = getDriver().findElement(By.id("lastname"));
        return lastNameField;
    }

    public WebElement getUserNameField() {
        userNameField = getDriver().findElement(By.id("userName"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement captchaErrorMsg() {
        captchaErrorMsg = getDriver().findElement(By.id("name"));
        return captchaErrorMsg;
    }

    public WebElement getRegisterButton() {
        registerButton = getDriver().findElement(By.id("register"));
        return registerButton;
    }
    public RegistrationPage enterFirstName(String name){
        getFirstNameField().sendKeys(name);
        return this;
    }
    public RegistrationPage enterLastName(String lastname){
        getLastNameField().sendKeys(lastname);
        return this;
    }
    public RegistrationPage enterUsername(String username){
        getUserNameField().sendKeys(username);
        return this;
    }
    public RegistrationPage enterPassword(String password) {
        getPasswordField().sendKeys(password);
        return this;
    }
    public RegistrationPage clickRegisterButton(){
        getRegisterButton().click();
        return this;
    }
    public RegistrationPage openUrl(){
        getDriver().get("https://demoqa.com/register");
        return this;
    }
}

