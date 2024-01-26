import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiuwr_DrdiDAxX58LsIHcHiCr4QPAgJ");
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
