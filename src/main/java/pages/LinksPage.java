package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.image.ImageWatched;


public class LinksPage extends BasePage{

    private WebElement homeLink;
    private WebElement createdLink;
    private WebElement noContentLink;
    private WebElement movedLink;
    private WebElement badRequestLink;
    private WebElement forbiddenLink;
    private WebElement notFoundLink;
    private WebElement successMsg;
    public LinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHomeLink() {
        homeLink = getDriver().findElement(By.id("simpleLink"));
        return homeLink;
    }

    public WebElement getCreatedLink() {
        createdLink = getDriver().findElement(By.id("created"));
        return createdLink;
    }

    public WebElement getNoContentLink() {
        noContentLink = getDriver().findElement(By.id("no-content"));
        return noContentLink;
    }

    public WebElement getMovedLink() {
        movedLink = getDriver().findElement(By.id("moved"));
        return movedLink;
    }

    public WebElement getBadRequestLink() {
        badRequestLink = getDriver().findElement(By.id("bad-request"));
        return badRequestLink;
    }

    public WebElement getForbiddenLink() {
        forbiddenLink = getDriver().findElement(By.id("forbidden"));
        return forbiddenLink;
    }

    public WebElement getNotFoundLink() {
        notFoundLink = getDriver().findElement(By.id("invalid-url"));
        return notFoundLink;
    }

    public WebElement getSuccessMsg() {
        successMsg = getDriver().findElement(By.id("linkResponse"));
        return successMsg;
    }

    public LinksPage clickHomeLink(){
        getHomeLink().click();
        return this;
    }
    public LinksPage clickCreatedLink(){
        getCreatedLink().click();
        return this;
    }
    public LinksPage clickNoContentLink(){
        getNoContentLink().click();
        return this;
    }
    public LinksPage clickMovedLink(){
        getMovedLink().click();
        return this;
    }
    public LinksPage clickBadRequestLink(){
        getBadRequestLink().click();
        return this;
    }
    public LinksPage clickForbiddenLink(){
        getForbiddenLink().click();
        return this;
    }
    public LinksPage clickNotFoundLink(){
        getNotFoundLink().click();
        return this;
    }
    public LinksPage openUrl(){
        getDriver().get("https://demoqa.com/links");
        return this;
    }
}
