/*Накарайте driver-a да отвори този линк: http://pragmatic.bg/automation/lecture13/Config.html използвайки класът
Actions от Selenium API-to кликнете върху checkbox-овете срещу "Air Bags” и “Parking Sensor” и направете проверка,
че точно те са селектирани. (Ясно е, че може и без Actions класа да стане това, просто с цел трениране на Actions) */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;


public class CheckBoxTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCheckBox() {
        WebElement airbags = this.driver.findElement(By.name("airbags"));
        WebElement parkingSensor = this.driver.findElement(By.name("parksensor"));

        Actions builder = new Actions(this.driver);

        builder
                .click(airbags)
                .click(parkingSensor)
                .perform();

        assertTrue(airbags.isSelected());
        assertTrue(parkingSensor.isSelected());
    }
}