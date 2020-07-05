package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    /**
     * To get driver from BasePage.class
     *
     * @param driver
     */
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }


    private final By buttonWallet = By.xpath("//div[contains(text(),'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToTheCard = By.xpath("//button[@class='sc-bwzfXH ezBCKw']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By paymentDetails = By.xpath("//span[@data-qa-node='details']");


    /**
     * Choose a card from the wallet
     *
     * @return MobilePhoneReplenishmentPage
     */

    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     * Enter phone number excluding country code
     *
     * @param number phone number
     * @return MobilePhoneReplenishmentPage
     */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardFrom(String card) {
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCvv(String cvv) {
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    public MobilePhoneReplenishmentPage submitToTheCard() {
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }

    /**
     * @param text
     * @return MobilePhoneReplenishmentPage
     */
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCard(String text) {
        WebElement details = driver.findElement(paymentDetails);
        waitElementIsVisible(details);
        Assertions.assertEquals(text, details.getText());
        return this;
    }
}
