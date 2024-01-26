
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // //Domaci Zadatak 2:
        ////https://demoqa.com/text-box napisati test case za dati text box

        driver.get("https://demoqa.com/text-box");
        WebElement name = driver.findElement(By.id("userName"));
        name.click();
        name.sendKeys("Stefan");
        WebElement userName = driver.findElement(By.id("userEmail"));
        userName.click();
        userName.sendKeys("name@something.com");
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.click();
        address.sendKeys("Bogdana Šuputa 12");

        Thread.sleep(5000);

        WebElement permanentAddress = wait.until(ExpectedConditions.elementToBeClickable(By.id("permanentAddress")));
        Thread.sleep(5000);
        permanentAddress.click();
        permanentAddress.sendKeys("Bogdana Šuputa 12");

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        submit.click();
        String expectedURL = "https://demoqa.com/text-box";

        Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);


    }
}
