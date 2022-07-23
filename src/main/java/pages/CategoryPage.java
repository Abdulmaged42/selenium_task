package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    private WebDriver driver;
    private By detailsLocator=By.xpath("(//a[@class='button' and contains(text(),'View Details')])[1]");
    public CategoryPage(WebDriver driver){
        this.driver=driver;
    }
    public ItemPage viewDetails(){
        driver.findElement(detailsLocator).click();
        return new ItemPage(driver);
    }
}
