package adminarea;

import utils.Browser;

public class goToAdminPanel {
    /**
     * Method that navigates to the admin panel
     */
    public static void goToAdminPage() {
        Browser.driver.get("http://shop.pragmatic.bg/admin");
    }
}
