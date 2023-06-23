package pages;

import javafx.scene.control.Slider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderPage extends BasePage{


    private WebElement slider;
    public SliderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSlider() {
        slider = getDriver().findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
        return slider;
    }
    public SliderPage moveSlider(){
        getSlider().click();
        return this;
    }
    public SliderPage openUrl(){
        getDriver().get("https://demoqa.com/slider");
        return this;
    }
}
