package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccountPage {
    private WebDriver driver;
    private By successMessageLocator = By.xpath("//*[@class='success-msg']/ul/li/span");
    private By womanLocator = By.xpath("//*[@class='level0 nav-1 first parent']");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * i can send the message direct to the xpath and verify if it visible or not
     *
     * @param message
     */
    public void VerifySuccessMessage(String message) {
        driver.findElement(By.xpath("//span[contains(text()," + message + ")])"));
    }

    /**
     * here i will get the message and assert if it eql the expected message or not
     */
    public String getSuccessMessage() {
        return driver.findElement(successMessageLocator).getText();
    }

    public void hoverOnElement() {
        WebElement element = driver.findElement(womanLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public CategoryPage chooseCategory(String category) {
        clickLink(category);
        return new CategoryPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
