package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;

    /**
     * Method that opens Chrome browser instance and sets Implicit wait for 10 seconds
     */
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\boyan\\\\OneDrive\\\\Работен плот\\\\WebDrivers\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * Method that quits the browser and all created windows
     */
    public static void tearDown() {
        driver.quit();
    }
}