package pages.adminarea;

import org.openqa.selenium.By;
import utils.Browser;

public class AdminCustomerGroups {
    /**
     * Method that leads to the Customer Groups page
     */
    public static void customerGroups() {
        Browser.driver.findElement(By.id("menu-customer")).click();
        Browser.driver.findElement(By.cssSelector("a[href*='/customer_group']")).click();
    }

    /**
     * Method that creates new Customer Group
     *
     * @param groupName The name of the new group
     * @param groupDescription The description of the new group
     */
    public static void createUserGroup(String groupName, String groupDescription) {
        Browser.driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
        Browser.driver.findElement(By.cssSelector("input[placeholder='Customer Group Name']")).sendKeys(groupName);
        Browser.driver.findElement(By.id("input-description1")).sendKeys(groupDescription);
        Browser.driver.findElement(By.xpath("//i[@class='fa fa-save']")).click();
    }
}
