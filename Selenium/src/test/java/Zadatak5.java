import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak5 {
    // Testirati neuspešan logIn

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String invalidUsername = "student1";
        String invalidPassword = "Password";

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();
        WebElement testLogIn = driver.findElement(By.linkText("Test Login Page"));
        testLogIn.click();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(invalidUsername);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        Thread.sleep(3000);

        // find error message for invalidUsername

        WebElement errorMessage = driver.findElement(By.id("error"));
        String errorUsername = errorMessage.getText();
        String expectedMessage = "Your username is invalid!";
        Assert.assertEquals(expectedMessage,errorUsername);

        // URL didn't change

        String expectedURL = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);



    }
}
