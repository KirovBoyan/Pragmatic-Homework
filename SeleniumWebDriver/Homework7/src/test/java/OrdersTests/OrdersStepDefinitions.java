package OrdersTests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class OrdersStepDefinitions {
    private WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    @Before
    public void setUp() {
        System.setProperty("webdriver.chomre.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Given("The user is on the Orders page and logged in as Admin")
    public void The_user_is_on_the_Orders_page_and_logged_in_as_admin() {
        driver.get("http://shop.pragmatic.bg/admin");
        driver.findElement(By.id("input-username")).sendKeys("admin");
        driver.findElement(By.id("input-password")).sendKeys("parola123!");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.cssSelector("a.btn-info")).click();
    }

    @When("he tries to edit the order")
    public void he_tries_to_edit_the_order() {
        driver.findElement(By.xpath("//a[@data-original-title='Edit']")).click();
    }

    @When("changes the currency to: Euro")
    public void changes_the_currency_to_Euro() {
        Select inputCurrency = new Select(driver.findElement(By.id("input-currency")));
        inputCurrency.selectByVisibleText("Euro");
    }

    @When("continues and saves the changes")
    public void continues_and_saves_the_changes() {
        driver.findElement(By.id("button-customer")).click();
        driver.findElement(By.id("button-cart")).click();
        driver.findElement(By.id("button-payment-address")).click();
        driver.findElement(By.id("button-shipping-address")).click();
        driver.findElement(By.id("button-save")).click();
    }

    @When("he changes the Order status to complete")
    public void he_changes_the_Order_status_to_complete() {
        Select orderStatus = new Select(driver.findElement(By.id("input-order-status")));
        orderStatus.selectByVisibleText("Complete");
    }

    @When("he changes the Order status to Denied")
    public void he_changes_the_Order_status_to_Denied() {
        Select orderStatus = new Select(driver.findElement(By.id("input-order-status")));
        orderStatus.selectByVisibleText("Denied");
    }

    @When("Provides a reason for it")
    public void Provides_a_reason_for_it() {
        driver.findElement(By.id("input-comment")).sendKeys("Out of stock!");
    }

    @When("Notifies the customer for it")
    public void Notifies_the_customer_for_it() {
        driver.findElement(By.id("input-notify")).click();
    }

    @When("saves the changes")
    public void saves_the_changes() {
        driver.findElement(By.id("button-history")).click();
    }


    @Then("ensures that the order's new currency is Euro")
    public void ensures_that_the_orders_new_currency_is_Euro() {
        String actualTest = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        Assert.assertEquals(actualTest, "Success: You have modified orders!\n×");
    }

    @Then("ensures that the order's new status is Complete")
    public void ensures_that_the_orders_new_status_is_Complete() {
        String statusComplete = driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[3]")).getText();
        Assert.assertEquals(statusComplete, "Complete");
    }

    @Then("ensures the the orders is denied and a reason is provided")
    public void ensures_the_the_orders_is_denied_and_a_reason_is_provided() {
        String orderStatus = driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[3]")).getText();
        softAssert.assertEquals(orderStatus, "Denied");
        String orderReason = driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]")).getText();
        softAssert.assertEquals(orderReason, "Out of stock!");
        softAssert.assertAll();
    }

}
