package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private RegistrationPage registrationPage;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;

    private LoginPage loginPage;
    private Actions actions;
    private LinksPage linksPage;
    private SliderPage sliderPage;



    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jovan\\Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        registrationPage = new RegistrationPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver,wait);
        radioButtonPage = new RadioButtonPage(driver,wait);
        webTablesPage = new WebTablesPage(driver,wait);
        buttonsPage = new ButtonsPage(driver,wait);

        loginPage = new LoginPage(driver,wait);
        actions = new Actions(driver);
        linksPage = new LinksPage(driver,wait);
        sliderPage = new SliderPage(driver,wait);

    }
    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public RegistrationPage getRegistrationPage() {
        return registrationPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }



    public LoginPage getLoginPage() {
        return loginPage;
    }

    public LinksPage getLinksPage() {
        return linksPage;
    }

    public SliderPage getSliderPage() {
        return sliderPage;
    }

    public Actions getActions() {
        return actions;
    }
        @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
