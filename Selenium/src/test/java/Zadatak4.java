import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class Zadatak4 {
    public static void main(String[] args) {
        // Zadatak 4
// Testirati log in stranice https://practicetestautomation.com/

        // added: Assert log out button functionality

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");
        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();
        WebElement testLogIn = driver.findElement(By.linkText("Test Login Page"));
        testLogIn.click();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        // Assert the message after successful login

        WebElement messageLogIn = driver.findElement(By.className("post-title"));
        String message = messageLogIn.getText();
        String expectedMessage = "Logged In Successfully";
        Assert.assertEquals(message, expectedMessage);

        // Assert that Log Out button is present

        WebElement logOutButton = driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logOutButton.isDisplayed());

        // Assert LogOut button Functionality

        logOutButton.click();
        Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);


    }
}