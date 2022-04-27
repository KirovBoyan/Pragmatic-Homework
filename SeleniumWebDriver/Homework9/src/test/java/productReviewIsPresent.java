import adminarea.goToAdminPanel;
import adminarea.logInAsAdmin;
import adminarea.reviewList;
import adminarea.reviewsSection;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import userarea.desktopMac;
import userarea.goToWebsite;
import userarea.reviewSections;
import utils.Browser;

public class productReviewIsPresent extends BaseTest {
    @Test
    public void productReviewExists() {
        //Navigate to the website: "http://shop.pragmatic.bg"
        goToWebsite.navigate();
        //Opens the Desktops drop-down menu and clicks on the Mac submenu
        desktopMac.desktopMacSection();
        //Click on the iMac present on the list
        desktopMac.iMacSection();

        //Navigates to the review subpage of the product
        reviewSections.reviewPage();
        //Writes new review for the product
        reviewSections.writeReview();

        //Navigates to the website: "http://shop.pragmatic.bg/admin/"
        goToAdminPanel.goToAdminPage();
        //Logs in as admin
        logInAsAdmin.logIn("admin13", "parola123!");
        //Navigates to the admin review section
        reviewsSection.goToReviewsSection();
        //Locates your review in the review list
        reviewList.searchInReviewList();
        //Changes the status of the review to Enabled
        reviewList.changeReviewStatus();
        //Saves the changes in the review
        reviewList.saveEditReview();

        //Navigate to the website: "http://shop.pragmatic.bg"
        goToWebsite.navigate();
        //Opens the Desktops drop-down menu and clicks on the Mac submenu
        desktopMac.desktopMacSection();
        //Click on the iMac present on the list
        desktopMac.iMacSection();
        //Navigates to the review subpage of the product
        reviewSections.reviewPage();

        //Asserts that the newest reviewer's name is the same as the one we used to write the review with
        String result = Browser.driver.findElement(By.xpath("//strong[normalize-space()='James Bond']")).getText();
        Assert.assertEquals(result, "James Bond");
    }
}
