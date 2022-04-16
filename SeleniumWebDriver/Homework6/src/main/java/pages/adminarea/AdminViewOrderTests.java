package pages.adminarea;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class AdminViewOrderTests {
    /**
     *Method that clicks on the last created order
     */
    public static void viewOrder() {
        Browser.driver.findElement(By.cssSelector("a.btn-info")).click();
    }

    /**
     *Method that saves the order history by pressing the History button
     */
    public static void pressHistoryButton() {
        Browser.driver.findElement(By.id("button-history")).click();
    }

    /**
     * Method that changes the currency to Euro
     */
    public static void changeCurrencyToEuro() {
        Browser.driver.findElement(By.xpath("//a[@data-original-title='Edit']")).click();

        Select inputCurrency = new Select(Browser.driver.findElement(By.id("input-currency")));
        inputCurrency.selectByVisibleText("Euro");

        Browser.driver.findElement(By.id("button-customer")).click();
        Browser.driver.findElement(By.id("button-cart")).click();
        Browser.driver.findElement(By.id("button-payment-address")).click();
        Browser.driver.findElement(By.id("button-shipping-address")).click();
        Browser.driver.findElement(By.id("button-save")).click();
    }

    /**
     *Method that selects the order status from the parameter
     *
     * @param newOrderStatus expected new status of the order
     */
    public static void changeOrderStatus(String newOrderStatus) {
        Select orderStatus = new Select(Browser.driver.findElement(By.id("input-order-status")));
        orderStatus.selectByVisibleText(newOrderStatus);
    }

    /**
     * Method that prints the shipping list
     */
    public void printShippingList() {
        Browser.driver.findElement(By.xpath("//a[@data-original-title='Print Shipping List']")).click();
    }

    /**
     * Method that prints the invoice of the order
     */
    public static void printInvoice() {
        Browser.driver.findElement(By.xpath("//a[@data-original-title='Print Invoice']")).click();
    }
}

