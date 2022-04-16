package pages.adminarea;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class AdminLogin {
    /**
     * Method that navigates to the admin area of the project
     */
    public static void navigate() {
        Browser.driver.get("http://shop.pragmatic.bg/admin");
    }

    /**
     * Method that logs you into the admin panel with the provided credentials as parameters
     *
     * @param username the username you would like to login in with
     * @param password the password you would like to login in with
     */
    public static void login(String username, String password) {
        Browser.driver.findElement(By.id("input-username")).sendKeys(username);
        Browser.driver.findElement(By.id("input-password")).sendKeys(password);
        Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
    }

    /**
     * Asserts if the validation message when trying to login with wrong credentials is as expected
     *
     * @param expectedValidationMessage the expected validation message
     * @param messageOnFailure          the message that will appear in case of failure
     */
    public static void verifyValidationMessage(String expectedValidationMessage, String messageOnFailure) {
        String actualValidationMessage = Browser.driver.findElement(By.cssSelector(".alert-danger")).getText();

        Assert.assertTrue(actualValidationMessage.contains(expectedValidationMessage), messageOnFailure);
    }
}
