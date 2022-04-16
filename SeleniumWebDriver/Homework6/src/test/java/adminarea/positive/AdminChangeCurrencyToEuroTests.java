package adminarea.positive;

import adminarea.core.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminarea.AdminLogin;
import pages.adminarea.AdminViewOrderTests;
import utils.Browser;

public class AdminChangeCurrencyToEuroTests extends BaseTest {
    @Test
    public void changeCurrencyToEuro() {
        AdminLogin.navigate();
        AdminLogin.login("admin", "**********");

        AdminViewOrderTests.viewOrder();

        AdminViewOrderTests.changeCurrencyToEuro();

        String actualText = Browser.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        Assert.assertEquals(actualText, "Success: You have modified orders!\n×");
    }
}