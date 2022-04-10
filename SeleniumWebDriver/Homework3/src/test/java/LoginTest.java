/*Можем да се логнем с правилно написани логин и парола в Back-end на shop.pragmatic.bg/admin */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://shop.pragmatic.bg/admin");
    }

    @Test
    public void loginTest() {
        WebElement usernameInput = driver.findElement(By.id("input-username"));
        usernameInput.sendKeys("admin");
        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("parola123!");
        driver.findElement(By.cssSelector(".btn-primary")).click();

        WebElement logout = driver.findElement(By.cssSelector("ul.navbar-nav li span"));

        assertEquals(logout.getText(), "Logout");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}