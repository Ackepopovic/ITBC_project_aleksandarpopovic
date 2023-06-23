package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

public class LoginPage extends BasePage {

    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement loginButton;
    private WebElement errorMsg;
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getUserNameField() {
        userNameField = getDriver().findElement(By.id("userName"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement getLoginButton() {
        loginButton = getDriver().findElement(By.id("login"));
        return loginButton;
    }

    public WebElement getErrorMsg() {
        errorMsg = getDriver().findElement(By.id("name"));
        return errorMsg;
    }
    public LoginPage enterUsername(String username){
        getUserNameField().sendKeys(username);
        return this;
    }
    public LoginPage enterPassword(String password){
        getPasswordField().sendKeys(password);
        return this;
    }
    public LoginPage clickLoginButton(){
        getLoginButton().click();
        return this;
    }
    public LoginPage showErrorMsg(){
        getErrorMsg().getText().contains("Invalid username or password!");
        return this;
    }
    public LoginPage openUrl(){
        getDriver().get("https://demoqa.com/login");
        return this;
    }
}
