package userarea;

import utils.Browser;

/**
 * Method that navigates to the chosen website
 */
public class goToWebsite {
    public static void navigate() {
        Browser.driver.get("http://shop.pragmatic.bg");
    }
}
