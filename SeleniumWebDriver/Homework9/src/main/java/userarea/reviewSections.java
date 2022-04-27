package userarea;

import org.openqa.selenium.By;
import utils.Browser;

public class reviewSections {
    /**
     * Method that navigates to the review subpage
     */
    public static void reviewPage() {
        Browser.driver.findElement(By.cssSelector("a[href='#tab-review']")).click();
    }

    /**
     * Method that writes a review and submits it
     */
    public static void writeReview() {
        Browser.driver.findElement(By.id("input-name")).sendKeys("James Bond");
        Browser.driver.findElement(By.id("input-review")).sendKeys("Go, go, Gadget Macintosh!");
        Browser.driver.findElement(By.xpath("//input[@value='5']")).click();
        Browser.driver.findElement(By.id("button-review")).click();
    }
}
