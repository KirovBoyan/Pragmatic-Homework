package OrdersTests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class UserGroupsDefinitions {
    private WebDriver driver;

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

    @Given("The user is on the Dashboard and logged in as Admin")
    public void The_user_is_on_the_Dashboard_and_logged_in_as_Admin() {
        driver.get("http://shop.pragmatic.bg/admin");
        driver.findElement(By.id("input-username")).sendKeys("admin");
        driver.findElement(By.id("input-password")).sendKeys("parola123!");
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }

    @When("he goes to the customer groups submenu")
    public void he_goes_to_the_customer_groups_submenu() {
        driver.findElement(By.id("menu-customer")).click();
        driver.findElement(By.cssSelector("a[href*='/customer_group']")).click();
    }

    @When("clicks on the add new button")
    public void clicks_on_the_add_new_button() {
        driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
    }

    @When("he enters {string} as Group name")
    public void he_enters_as_Group_name(String groupName) {
        driver.findElement(By.cssSelector("input[placeholder='Customer Group Name']")).sendKeys(groupName);
    }

    @When("he enters {string} as Description of the group")
    public void he_enters_as_Description_of_the_group(String description) {
        driver.findElement(By.id("input-description1")).sendKeys(description);
    }

    @When("he saves the new group")
    public void he_saves_the_new_group() {
        driver.findElement(By.xpath("//i[@class='fa fa-save']")).click();
    }

    @When("he sees Test groups, selects all of them")
    public void he_sees_Test_groups_selects_all_of_them() {
        int rowNum = driver.findElements(By.xpath("//tbody/tr")).size();
        for (int i=1; i<=rowNum; i++) {
            for(int j=1; j<=2; j++) {
                if (driver.findElement(By.xpath("//tbody/tr[" + i + "]/td["+j+"]")).getText().toLowerCase().contains("test")) {
                    driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]")).click();
                }
            }
        }
    }

    @When("deletes them")
    public void deletes_them() {
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert alert =driver.switchTo().alert();
        alert.accept();
    }

    @Then("ensures that {string} message is displayed")
    public void ensures_that_message_is_displayed(String modified_customer_group) {
        String successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        Assert.assertEquals(successMessage, modified_customer_group);
    }

    @Then("ensures there are no Test groups")
    public void ensures_there_are_no_Test_groups() {
        int testGroupCount = 0;
        int rowNum = driver.findElements(By.xpath("//tbody/tr")).size();
        for (int i=1; i<=rowNum; i++) {
            for(int j=1; j<=2; j++) {
                if (driver.findElement(By.xpath("//tbody/tr[" + i + "]/td["+j+"]")).getText().toLowerCase().contains("test")) {
                    testGroupCount+=1;
                }
            }
        }
        Assert.assertEquals(testGroupCount, 0);
    }
}
