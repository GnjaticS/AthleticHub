import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak7 {
    public static void main(String[] args) throws InterruptedException {
        /*Zadatak 9
https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2
Testirati dodavanje knjige u korpu i da li se knjiga obrise kada obrisete kolacice*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2\n");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Thread.sleep(7000);

        WebElement cart = driver.findElement(By.cssSelector(".nav-cart-icon.nav-sprite"));
        cart.click();

        // making sure that the shopping cart is empty
        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart"));

        String expectedText = "Your Amazon Cart is empty";

        Assert.assertEquals(driver.findElement(By.cssSelector(".a-row.sc-your-amazon-cart-is-empty")).getText(), expectedText);

        driver.navigate().refresh();
        driver.navigate().back();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();

        // check if the item is added to the cart

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold"))));

        Assert.assertEquals(driver.findElement(By.cssSelector(".a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold")).getText(), "Added to Cart");

        // check if there is one item in the cart
        WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
        Assert.assertEquals(cartCount.getText(), "1");

        //check if the title of the book the same as the one we added
        WebElement book = driver.findElement(By.cssSelector(".sc-product-image.celwidget"));
        book.click();
        String title = "Selenium Framework Design in Data-Driven Testing: Build data-driven test frameworks using Selenium WebDriver, AppiumDriver, Java, and TestNG";
        Assert.assertEquals(driver.findElement(By.id("productTitle")).getText(), title);

        // delete cookies
        driver.navigate().refresh();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        // check if the item was deleted from the cart

        String addedBookURL = "https://www.amazon.com/cart/smart-wagon?newItems=d60f3b1e-467f-49aa-836f-57c6c685a873,1&ref_=sw_refresh";

        Assert.assertNotEquals(addedBookURL, driver.getCurrentUrl());

        // also check if the number on cart is now 0

        WebElement cartNumber = driver.findElement(By.id("nav-cart-count"));

        Assert.assertEquals(cartNumber.getText(), "0");



    }
}
