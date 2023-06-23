package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends BasePage{

    private WebElement webTablesButton;
    private WebElement addButton;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailField;
    private WebElement ageField;
    private WebElement salaryField;
    private WebElement departmentField;
    private WebElement submitButton;
    private WebElement confirmMsg;

    public WebTablesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getWebTablesButton() {
        webTablesButton = getDriver().findElement(By.id("item-3"));
        return webTablesButton;
    }

    public WebElement getAddButton() {
        addButton = getDriver().findElement(By.id("addNewRecordButton"));
        return addButton;
    }

    public WebElement getFirstNameField() {
        firstNameField = getDriver().findElement(By.id("firstName"));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        lastNameField = getDriver().findElement(By.id("lastName"));
        return lastNameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getAgeField() {
        ageField = getDriver().findElement(By.id("age"));
        return ageField;
    }

    public WebElement getSalaryField() {
        salaryField = getDriver().findElement(By.id("salary"));
        return salaryField;
    }

    public WebElement getDepartmentField() {
        departmentField = getDriver().findElement(By.id("department"));
        return departmentField;
    }

    public WebElement getSubmitButton() {
        submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }

    public WebElement getConfirmMsg() {
        confirmMsg = getDriver().findElement(By.xpath("//*[contains(text(), 'Marko')]"));
        return confirmMsg;
    }

    public WebTablesPage clickWebTablesButton(){
        getWebTablesButton().click();
        return this;
    }
    public WebTablesPage clickAddButton(){
        getAddButton().click();
        return this;
    }
    public WebTablesPage enterFirstName(String name){
        getFirstNameField().sendKeys(name);
        return this;
    }
    public WebTablesPage enterLastName(String lastName) {
        getLastNameField().sendKeys(lastName);
        return this;
    }
    public WebTablesPage enterEmail(String email) {
        getEmailField().sendKeys(email);
        return this;
    }
    public WebTablesPage enterAge(String age){
        getAgeField().sendKeys(age);
        return this;
    }
    public WebTablesPage enterSalary(String broj) {
        getSalaryField().sendKeys(broj);
        return this;
    }
    public WebTablesPage enterDepartment(String text) {
        getDepartmentField().sendKeys(text);
        return this;
    }
    public WebTablesPage clickSubmitButton(){
        getSubmitButton().click();
        return this;
    }
    public WebTablesPage openUrl(){
        getDriver().get("https://demoqa.com/webtables");
        return this;
    }
}
