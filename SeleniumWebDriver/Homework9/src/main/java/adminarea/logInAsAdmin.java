package adminarea;

import org.openqa.selenium.By;
import utils.Browser;

public class logInAsAdmin {
    /**
     * Method that logs in as admin
     *
     * @param username the admin username
     * @param password the admin password
     */
    public static void logIn(String username, String password) {
        Browser.driver.findElement(By.id("input-username")).sendKeys(username);
        Browser.driver.findElement(By.id("input-password")).sendKeys(password);
        Browser.driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
