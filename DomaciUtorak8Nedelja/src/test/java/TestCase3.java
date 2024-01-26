import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestCase3 {
    public static void main(String[] args) throws InterruptedException {
        // #3 Log in unable with incorrect username
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
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        Thread.sleep(4000);
        String message = "Your username is invalid!";
        Assert.assertEquals(driver.findElement(By.id("error")).getText(), message);

        // URL je različit od uspešnog URL-a

        Assert.assertNotEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");

    }
}
