package adminarea;

import org.openqa.selenium.By;
import utils.Browser;

public class reviewsSection {
    /**
     * Method that navigates to the review section of the Admin panel
     */
    public static void goToReviewsSection() {
        Browser.driver.findElement(By.xpath("//a[@href='#collapse1']")).click();
        Browser.driver.findElement(By.xpath("//a[normalize-space()='Reviews']")).click();
    }
}
