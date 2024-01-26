import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class Zadatak9 {
    public static void main(String[] args) throws InterruptedException {
        ///*Zadatak 9
        //https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2
        //Testirati dodavanje knjige u korpu i da li se knjiga obrise kada obrisete kolacice*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
        Thread.sleep(10000);

        WebElement getBook = driver.findElement(By.id("twotabsearchtextbox"));
        getBook.sendKeys(ENTER);
        WebElement book = driver.findElement(By.cssSelector(".a-link-normal.s-no-outline"));
        book.click();
        WebElement addBook = driver.findElement(By.className("a-button-input"));
        addBook.click();

        WebElement cart = driver.findElement(By.id("nav-cart-count"));
        cart.click();

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        String praznaKorpa = "Your Amazon Cart is empty";
        Assert.assertEquals(driver.findElement(By.cssSelector(".a-row.sc-your-amazon-cart-is-empty")), praznaKorpa);





    }

}
