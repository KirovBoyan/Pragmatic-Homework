package adminarea.negative;

import adminarea.core.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.adminarea.AdminLogin;
import pages.adminarea.AdminViewOrderTests;
import utils.Browser;
import static org.testng.Assert.*;

public class AdminChangeOrderStatusCompleteTests extends BaseTest {
    @Test
    public void changeOrderStatusComplete() {
        AdminLogin.navigate();
        AdminLogin.login("admin", "*******");

        AdminViewOrderTests.viewOrder();
        AdminViewOrderTests.changeOrderStatus("Pending");
        AdminViewOrderTests.pressHistoryButton();

        String statusComplete = Browser.driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[3]")).getText();
        assertNotSame(statusComplete, "Complete" );
    }
}
