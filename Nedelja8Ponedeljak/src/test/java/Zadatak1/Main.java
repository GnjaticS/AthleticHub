package Zadatak1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        // // Zadatak 5
        //// Testirati log in stranice https://practicetestautomation.com/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/");

        // WebElement element = driver.findElement(By.className("home page-template-default page page-id-23 wp-custom-logo full-post"));
        WebElement element1 = driver.findElement(By.cssSelector(".home.page-template-default.page.page-id-23.wp-custom-logo.full-post"));
        element1.click();

        driver.findElement(By.xpath("/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]/p/a")).click();

        WebElement usernameFinder = driver.findElement(By.id("username"));
        usernameFinder.sendKeys("student");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Password123");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        WebElement webpageName = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[1]/h1"));
        String pageTitle = webpageName.getText();
        String expectedTitle = "Logged In Successfully";

        Assert.assertEquals(pageTitle, expectedTitle);

        WebElement logOutButton = driver.findElement(By.linkText("Log out"));

        Assert.assertFalse(logOutButton.isDisplayed());

        driver.quit();








    }
}
