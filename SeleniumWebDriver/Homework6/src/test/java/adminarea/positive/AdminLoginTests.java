package adminarea.positive;

import adminarea.core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminLogin;
import pages.adminarea.AdminDashboard;

public class AdminLoginTests extends BaseTest {
    @Test
    public void successfulLogin(){
        AdminLogin.navigate();
        AdminLogin.login("admin", "**********");

        AdminDashboard.verifyDashboardHeadingText("Dashboard", "message in case of bug");
    }
}
