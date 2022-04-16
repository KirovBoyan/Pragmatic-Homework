package adminarea.negative;

import adminarea.core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminLogin;

public class AdminLoginTests extends BaseTest {

    @Test
    public void unsuccessfulLogin(){
        AdminLogin.navigate();
        AdminLogin.login("dasfasdfasdf", "fagsshsa");

        AdminLogin.verifyValidationMessage("No match for Username and/or Password.\n×", "Bug detected!");
    }
}
