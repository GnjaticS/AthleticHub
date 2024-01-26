import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        // Napisati 5 negativnih test kejseva za dati sajt: https://practicetestautomation.com/
        // #1 can't log in without the username and password

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();

        WebElement testLogIn = driver.findElement(By.linkText("Test Login Page"));
        testLogIn.click();
        // the field for username and password have been left empty

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        Thread.sleep(4000);

        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());

        // The URL didn't change although it should, if the log in was successful

        String expectedURL = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        // Test loging text is displayed

        WebElement testLogin = driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]"));
        Assert.assertTrue(testLogin.isDisplayed());



    }
}
