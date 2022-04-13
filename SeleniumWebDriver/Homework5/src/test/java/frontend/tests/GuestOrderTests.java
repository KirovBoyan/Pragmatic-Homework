/*За домашна довършете теста, който се опитва да place-не GUEST Order
(този който започнахме да пишем по време на лекцията)  */

package frontend.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class GuestOrderTests {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://shop.pragmatic.bg/index.php?route=product/product&product_id=40");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void successfulPlacementOfGuestOrder() {
        WebElement addToCartButton = driver.findElement(By.id("button-cart"));
        addToCartButton.click();

        WebElement miniShopingCart = driver.findElement(By.cssSelector("#cart button.btn-block"));
        miniShopingCart.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.pull-right div a:nth-of-type(2)")));

        WebElement miniCartCheckoutLink = driver.findElement(By.cssSelector("ul.pull-right div a:nth-of-type(2)"));
        miniCartCheckoutLink.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.radio:nth-of-type(2) input")));
        WebElement guestRadioButton = driver.findElement(By.cssSelector("div.radio:nth-of-type(2) input"));
        guestRadioButton.click();

        WebElement continueButton = driver.findElement(By.id("button-account"));
        continueButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("button-guest")));

        driver.findElement(By.id("input-payment-firstname")).sendKeys("SomeFirstName");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("SomeLastName");

        String randomEmail = RandomStringUtils.randomAlphanumeric(7) + "@blabla.com";
        driver.findElement(By.id("input-payment-email")).sendKeys(randomEmail);
        driver.findElement(By.id("input-payment-telephone")).sendKeys("0897831425");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("Random Address 1");
        driver.findElement(By.id("input-payment-city")).sendKeys("Pernik");
        driver.findElement(By.id("input-payment-postcode")).sendKeys("1235");

        Select countryDropDown = new Select(driver.findElement(By.id("input-payment-country")));
        countryDropDown.selectByValue("33");

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("input-payment-zone"), "Yambol"));

        Select regionDropDown = new Select(driver.findElement(By.id("input-payment-zone")));
        regionDropDown.selectByValue("496");

        driver.findElement(By.id("button-guest")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        driver.findElement(By.id("button-shipping-method")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.id("button-payment-method")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
        driver.findElement(By.id("button-confirm")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary")));
        Assert.assertEquals(driver.findElement(By.cssSelector("#content h1")).getText(), "Your order has been placed!");
    }
}