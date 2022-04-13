/*За домашна, отворете takeaway.com, и използвайте търсачката им да намерите предпочитан от Вас ресторант спрямо
Вашата улица, като изчакването да се случи посредством Explicit wait.
Естествено направете и проверка, че се е появил очаквания от Вас ресторант на заредената страница. */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TakeAwayTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boyan\\OneDrive\\Работен плот\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://takeaway.com/bg/");
        WebElement searchOkButton = driver.findElement(By.cssSelector("button[aria-label='Приемане на всички бисквитки']"));
        searchOkButton.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchInTakeAway() {
        //finding the search input field
        WebElement searchInputField = driver.findElement(By.xpath("//input[contains(@id,'combobox-input')]"));
        //Clearing any leftover information
        searchInputField.clear();
        //input what we want
        searchInputField.sendKeys("Обелски могили");
        //wait for the result to appear in the dropdown
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//ul[contains(@id,'listbox')]")), "Обелски"));

        //Choose one of the suggested results
        List<WebElement> allResultsAfterTypingInSearchField = driver.findElements(By.xpath("//li[contains(@id,'suggestion-list')]"));
        for (WebElement currentAddress : allResultsAfterTypingInSearchField) {
            if (currentAddress.getText().contains("Обелски могили")) {
                //clicking on the result
                currentAddress.click();
                break;
            }
        }

        //Wait for the results to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@aria-label='Отворено']")));

        //Loading the whole page by scrolling down
        lazyLoadingScroll(driver);

        //Check that our restaurant is present in the whole list
        Assert.assertTrue(driver.findElement(By.cssSelector("div[data-qa='restaurant-card-nito-street-food']")).getText().contains("NITO"));
    }

    //Internal helper method for scrolling down the web page
    private void lazyLoadingScroll(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            Long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
            while (true) {
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(500);

                Long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
                if (newHeight.equals(lastHeight)) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}