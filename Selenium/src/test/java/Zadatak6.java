import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class Zadatak6 {
    public static void main(String[] args) throws InterruptedException {
        // testirati log in na word press stranicu

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement logIn = driver.findElement(By.linkText("Log In"));
        logIn.click();

        WebElement username = driver.findElement(By.id("usernameOrEmail"));
        username.sendKeys("gnjatic.stefan1@gmail.com");
        username.sendKeys(ENTER);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("zidniProzor");
        password.sendKeys(ENTER);

        wait.until(ExpectedConditions.urlToBe("https://wordpress.com/home/gnjaticstefan1.wordpress.com"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://wordpress.com/home/gnjaticstefan1.wordpress.com");


        WebElement profileButton = driver.findElement(By.cssSelector(".gravatar.masterbar__item-me-gravatar"));
        profileButton.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("profile-gravatar__user-display-name"))));

        String username2 = "gnjaticstefan1";
        Assert.assertEquals(driver.findElement(By.className("profile-gravatar__user-display-name")).getText(), username2);





    }
}
