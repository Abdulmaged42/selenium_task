package register;

import base.baseTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.RegisterPage;

import java.util.Random;

import static org.testng.Assert.assertTrue;

public class registerTest extends baseTest {
    public String fName = "abdulmaged";
    public String lName = "abdullah";
    public String password = "abd123456";
    public static String email;


    @Test
    public void registration() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email = fName + randomInt + "@gmail.com";
        homePage.clickOnAccount();
        RegisterPage registerPage = homePage.clickOnRegister();
        registerPage.setFirstName(fName);
        registerPage.setLastName(lName);
        registerPage.setEmail(email);
        registerPage.setPassword(password);
        registerPage.confirmPassword(password);
        AccountPage accountPage = registerPage.clickOnRegisterButton();
        assertTrue(accountPage.getSuccessMessage()
                        .contains("Thank you for registering with Madison Island."),
                "message is incorrect");
        System.out.println("email : " + email);

    }
}
