import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        //#5 unable to log in with only password
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();

        WebElement testLogIn = driver.findElement(By.linkText("Test Login Page"));
        testLogIn.click();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("students");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        Thread.sleep(3000);
        // URL did not change
        String expectedURL = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        // Test log in title is still present
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div/section/section/h2")).isDisplayed());

        // username and password fields are still present

        Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());

    }
}
