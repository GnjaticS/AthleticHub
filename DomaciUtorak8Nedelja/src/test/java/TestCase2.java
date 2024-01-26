import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {
        // #2 Login unable with incorrect password

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
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        Thread.sleep(4000);

        String expectedMessage = "Your password is invalid!";
        WebElement error = driver.findElement(By.id("error"));
        String errrorMessage = error.getText();

        // Assert that the error message is the same as expected

        Assert.assertEquals(expectedMessage, errrorMessage);

        // Assert that the URL is different from the correct one, the one we get after successful log in

        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";

        Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);



    }
}
