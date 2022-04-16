/*Проверете стойностите на drop-down елемента показан на снимката(намира се на Sales -> Orders, след като се логнете
 с admin):
Изпозлвайте класът Select от Selenium API-то. Не забравяйте да направите assertion. */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;

import static org.testng.Assert.*;

public class DropDownTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://shop.pragmatic.bg/admin");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testDropdown() {
        WebElement usernameInput = driver.findElement(By.id("input-username"));
        usernameInput.sendKeys("admin");
        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("**********");
        WebElement loginButton = driver.findElement(By.cssSelector(".btn-primary"));
        loginButton.click();

        WebElement salesMenu = driver.findElement(By.id("menu-sale"));
        salesMenu.click();
        WebElement orders = driver.findElement(By.cssSelector("#collapse4 li a"));
        orders.click();

        WebElement dropDown = driver.findElement(By.id("input-order-status"));
        Select orderStatus = new Select(dropDown);

        List<String> exp_options = Arrays.asList(new String[]{"", "Missing Orders", "Canceled", "Canceled Reversal",
                "Chargeback", "Complete", "Denied", "Expired", "Failed", "Pending", "Processed", "Processing", "Refunded",
                "Reversed", "Shipped", "Voided"});
        List<String> act_options = new ArrayList<String>();

        List<WebElement> allOptions = orderStatus.getOptions();

        for(WebElement option : allOptions) {
            act_options.add(option.getText());
        }

        assertEquals(act_options, exp_options);
    }
}
