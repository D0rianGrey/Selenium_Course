package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class BasePage {
    public WebDriver driver;

    /**
     * To get driver from BaseTest.class via 'BasePage' variable
     *
     * @param driver
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * The method navigating to a specific URL
     *
     * @param url
     */
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Wait for visibility element in DOM model
     *
     * @param element
     * @return
     */
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void isAuthWidgetPresent() {
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);
    }
}
