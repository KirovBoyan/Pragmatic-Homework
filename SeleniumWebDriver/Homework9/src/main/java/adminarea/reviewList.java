package adminarea;

import org.openqa.selenium.By;
import utils.Browser;
import org.openqa.selenium.support.ui.Select;

public class reviewList {
    /**
     * Method that searches for chosen review in the reviews list
     */
    public static void searchInReviewList() {
        int rowNum = Browser.driver.findElements(By.xpath("//tbody/tr")).size();
        int colNum = Browser.driver.findElements(By.xpath("//tbody/tr/td")).size();
        searchInReviewList:
        {
            for (int i = 1; i <= rowNum; i++) {
                for (int j = 1; j <= colNum; j++) {
                    if (Browser.driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText().contains("James Bond") || Browser.driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText().contains("iMac") || Browser.driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText().contains("27/04/2022")) {
                        Browser.driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[7]/a[1]/i[1]")).click();
                        break searchInReviewList;
                    }
                }
            }
        }
    }

    /**
     * Method that changes the review status to Enabled
     */
    public static void changeReviewStatus() {
        Select status = new Select(Browser.driver.findElement(By.id("input-status")));
        status.selectByVisibleText("Enabled");
    }

    /**
     * Method that saves the review
     */
    public static void saveEditReview() {
        Browser.driver.findElement(By.xpath("//i[@class='fa fa-save']")).click();
    }
}
