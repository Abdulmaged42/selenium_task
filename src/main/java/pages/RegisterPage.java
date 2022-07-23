package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage {
    private WebDriver driver;
    private By firstNameLocator = By.id("firstname");
    private By lastNameLocator = By.id("lastname");
    private By emailLocator = By.id("email_address");
    private By passwordLocator = By.id("password");
    private By confirmPasswordLocator = By.id("confirmation");
    private By registerButtonLocator = By.xpath("//button[@title='Register' and @type='submit']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameLocator).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameLocator).sendKeys(lastName);
    }

    public void setEmail(String email) {

        driver.findElement(emailLocator).sendKeys(email);

    }

    public void setPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void confirmPassword(String password) {
        driver.findElement(confirmPasswordLocator).sendKeys(password);
    }

    public AccountPage clickOnRegisterButton() {
        driver.findElement(registerButtonLocator).click();
        return new AccountPage(driver);
    }
}
