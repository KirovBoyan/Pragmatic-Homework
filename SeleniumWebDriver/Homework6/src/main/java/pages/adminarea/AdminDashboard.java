package pages.adminarea;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class AdminDashboard {

    /**
     * Asserts if the heading in the Dashboard page equals the provided as parameter text
     *
     * @param expectDashboardHeadingText the expected dashboard heading text
     * @param messageOnTestFailure       the message that will appear in case of failure
     */
    public static void verifyDashboardHeadingText(String expectDashboardHeadingText, String messageOnTestFailure) {
        String actualDashboardHeadingText = Browser.driver.findElement(By.cssSelector("div#content h1")).getText();
        Assert.assertEquals(actualDashboardHeadingText, expectDashboardHeadingText, messageOnTestFailure);
    }
}