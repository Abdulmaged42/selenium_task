package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    private WebDriver driver;
    private By emailLocator = By.id("email");
    private By passwordLocator = By.id("pass");
    private By loginButtonLocator = By.id("send2");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailLocator).sendKeys(email);

    }

    public void setPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public AccountPage clickOnLoginButton() {
        driver.findElement(loginButtonLocator).click();
        return new AccountPage(driver);
    }

}
