import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateGiftVoucher {
    private WebDriver driver;

    //BeforeMethod that will launch new browser and navigate it to specific website
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://shop.pragmatic.bg/admin");
    }

    //AfterMethod that will close the current browser window
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void createGiftVoucher() {
        //Login as admin user
        driver.findElement(By.id("input-username")).sendKeys("admin13");
        driver.findElement(By.id("input-password")).sendKeys("parola123!");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        //Navigate to the gift Vouchers submenu
        driver.findElement(By.id("menu-sale")).click();
        driver.findElement(By.cssSelector("a[href='#collapse4-3']")).click();
        driver.findElement(By.cssSelector("a[href*='voucher&user_token']")).click();

        //Checks if the desired voucher already exists and deletes it
        int rowNum = driver.findElements(By.xpath("//tbody/tr")).size();
        searchForGiftVoucher:
        {
            for (int i = 1; i <= rowNum; i++) {
                for (int j = 1; j <= 2; j++) {
                    if (driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText().contains("Test")) {
                        driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]")).click();
                        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
                        driver.switchTo().alert().accept();
                        break searchForGiftVoucher;
                    }
                }
            }
        }

        //creates new gift voucher
        driver.findElement(By.cssSelector("a[href*='add&user_token']")).click();

        //Adds the required information and clicks on the save button
        driver.findElement(By.id("input-code")).sendKeys("Test");
        driver.findElement(By.id("input-from-name")).sendKeys("James Bond");
        driver.findElement(By.id("input-from-email")).sendKeys("james.bond@007.org");
        driver.findElement(By.id("input-to-name")).sendKeys("Sveti Petar");
        driver.findElement(By.id("input-to-email")).sendKeys("sveti.petar@heaven.com");
        driver.findElement(By.id("input-amount")).sendKeys("1000000");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Asserts if the new gift voucher has been created
        boolean giftVoucherExist = false;
        for (int i = 1; i <= rowNum; i++) {
            for (int j = 1; j <= 2; j++) {
                if (driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText().contains("Test")) {
                    giftVoucherExist = true;
                }
            }
        }
        Assert.assertTrue(giftVoucherExist, "Your new gift voucher has been created!");
    }
}