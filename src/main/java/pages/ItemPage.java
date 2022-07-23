package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ItemPage {
    private WebDriver driver;
    private By colorLocator = By.id("attribute92");
    private By sizeLocator = By.id("attribute180");
    private By addToCartLocator = By.xpath("(//button[@class='button btn-cart' and contains(@title,'Add to Cart')])[1]");

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option, String menu) {
        findDropDownElement(menu).selectByVisibleText(option);
    }

    private Select findDropDownElement(String menu) {
        if (menu == "color") {
            return new Select(driver.findElement(colorLocator));
        } else {
            return new Select(driver.findElement(sizeLocator));
        }

    }

    public ShoppingCart addToCart() {
        driver.findElement(addToCartLocator).click();
        return new ShoppingCart(driver);
    }
}
