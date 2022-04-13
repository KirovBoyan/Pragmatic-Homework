package adminarea.test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class CustomerCreationTests {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://shop.pragmatic.bg/admin");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void adminAreaCustomerCreation() {
        WebElement username = driver.findElement(By.id("input-username"));
        username.sendKeys("milenadmin");
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("parola123!");
        WebElement loginButton = driver.findElement(By.cssSelector(".btn-primary"));
        loginButton.click();

        WebElement customersMainMenu = driver.findElement(By.cssSelector("#menu-customer > a"));
        customersMainMenu.click();
        WebElement customersSubMenu = driver.findElement(By.xpath("//ul[@id='collapse33']/li[1]/a"));
        customersSubMenu.click();

        WebElement newCustomerPlusButton = driver.findElement(By.cssSelector("dev.pull-right > a.btn-primary"));
        newCustomerPlusButton.click();

        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        inputFirstName.sendKeys("FirstName");

        WebElement inputLastName = driver.findElement(By.id("input-lastname"));
        inputLastName.sendKeys("LastName");

        String randomEmail = RandomStringUtils.randomAlphanumeric(7)+"@blabla.com";

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys(randomEmail);

        WebElement inputPhone = driver.findElement(By.id("input-telephone"));
        inputPhone.sendKeys("0894145222");

        WebElement inputCustomerPassword = driver.findElement(By.id("input-password"));
        inputCustomerPassword.sendKeys("parola123!");

        WebElement inputCustomerPasswordConfirm = driver.findElement(By.id("input-confirm"));
        inputCustomerPasswordConfirm.sendKeys("parola123!");

        Select newsLetterDropDown = new Select(driver.findElement(By.id("input-newsletter")));
        newsLetterDropDown.selectByValue("1");

        WebElement saveCustomerButton = driver.findElement(By.cssSelector("div.pull-right > button.btn-primary"));
        saveCustomerButton.click();

        WebElement inputFilterEmail = driver.findElement(By.id("input-email"));
        inputFilterEmail.sendKeys(randomEmail);

        WebElement buttonFilterSubmit = driver.findElement(By.id("button-filter"));
        buttonFilterSubmit.click();

        WebElement resultTableBody = driver.findElement(By.cssSelector(".table-bordered tbody"));
        Assert.assertTrue(resultTableBody.getText().contains(randomEmail));
    }
}