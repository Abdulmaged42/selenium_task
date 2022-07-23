package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By accountLocator =By.xpath("//a[@href ='#header-account']");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnAccount(){
     driver.findElement(accountLocator).click();
    }
    public RegisterPage clickOnRegister(){
        clickLink("Register");
       return new RegisterPage(driver);
    }
    public LoginPage clickOnLogin(){
        clickLink("Log In");
        return new LoginPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
