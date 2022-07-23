package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.ranges.RangeException;

public class ShoppingCart {
    private WebDriver driver;
    private By grandTotalLocator = By.xpath("//strong[contains(text(),'Grand Total')]/../../td/strong/span");

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public double getTotal() {
        String total = driver.findElement(grandTotalLocator).getText();
        String[] parts = total.split("\\$");
        double number = 0.0;
        try {
            number = Double.parseDouble(parts[1]);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (RangeException e) {
            throw e;
        } finally {
            System.out.println("Thank you for using the program!");
        }
        return number;
    }
}
