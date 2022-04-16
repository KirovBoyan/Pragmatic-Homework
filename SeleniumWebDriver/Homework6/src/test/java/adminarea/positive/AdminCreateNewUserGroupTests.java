package adminarea.positive;

import adminarea.core.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminarea.AdminCustomerGroups;
import pages.adminarea.AdminLogin;
import utils.Browser;

public class AdminCreateNewUserGroupTests extends BaseTest {
    @Test
    public void CreateNewUserGroup() {
        AdminLogin.navigate();
        AdminLogin.login("admin", "***********");

        AdminCustomerGroups.customerGroups();
        AdminCustomerGroups.createUserGroup("Test", "Delete me!");

        String actualGroupName = Browser.driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[2]/td[2]")).getText();

        Assert.assertEquals(actualGroupName, "Test");
    }
}
