import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {
        // #4 Both username and password are incorrect
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

        // an error message is displayed
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.id("error")).isDisplayed());

        // URL did not change

        String expectedURL = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }
}
