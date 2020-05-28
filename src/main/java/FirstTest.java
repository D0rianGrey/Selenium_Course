import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTest {
    @Test
    public void testSearchGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("ChromeDriver");
        inputField.submit();
        driver.quit();


    }

}