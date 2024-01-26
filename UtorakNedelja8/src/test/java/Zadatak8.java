import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class Zadatak8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://wordpress.com/?apppromo");
        WebElement logIn = driver.findElement(By.linkText("Log In"));
        logIn.click();
        WebElement userName = driver.findElement(By.id("usernameOrEmail"));
        userName.sendKeys("gnjatic.stefan1@gmail.com");
        userName.sendKeys(ENTER);
        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/main/div[2]/div/form/div[1]/div[1]/div/div/input"));
        password.sendKeys("zidniProzor");
        WebElement finalLogIn = driver.findElement(By.className("login__form-action"));
        finalLogIn.click();
        String expectedURL = "https://wordpress.com/home/gnjaticstefan1.wordpress.com";
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        Cookie cookie = new Cookie("wordpress_login", "gnjaticstefan1%7C1800042288%7CmGskZvfjJGCRt4uabzWdXFI6kmBrFw0ycI1i96Ju3en%7C6a1f69d9f88a5d442fae43688e8df5d68d393250fc5b80f4e657612c91706351");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        Thread.sleep(4000);

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

    }
}
