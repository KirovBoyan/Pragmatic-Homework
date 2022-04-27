package userarea;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utils.Browser;

public class desktopMac {
    /**
     * Method that navigates to the Desktops menu and click on the Mac submenu
     */
    public static void desktopMacSection() {
        Actions action = new Actions(Browser.driver);
        action.moveToElement(Browser.driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']"))).perform();
        Browser.driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]")).click();
    }

    /**
     * Method that chooses the iMac item from the list
     */
    public static void iMacSection() {
        Browser.driver.findElement(By.xpath("//a[contains(text(),'iMac')]")).click();
    }
}