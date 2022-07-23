package loginAndAmountAssertion;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.*;
import register.registerTest;


public class loginTest extends baseTest {
    registerTest registerTest = new registerTest();

    @Test
    public void login() {
        homePage.clickOnAccount();
        LoginPage login = homePage.clickOnLogin();
        login.setEmail(registerTest.email);
        login.setPassword(registerTest.password);
        AccountPage accountPage = login.clickOnLoginButton();
        accountPage.hoverOnElement();
        CategoryPage category = accountPage.chooseCategory("Pants & Denim");
        ItemPage item = category.viewDetails();
        item.selectFromDropDown("Black", "color");
        item.selectFromDropDown("31", "size");
        ShoppingCart shoppingCart = item.addToCart();
        Double total = shoppingCart.getTotal();
        System.out.println("total " + total);
        Assert.assertTrue(total<350,"total out of your money");



    }
}
