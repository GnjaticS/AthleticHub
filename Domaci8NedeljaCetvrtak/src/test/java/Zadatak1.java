import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Zadatak1 {
    //Koristeci Anotacije - Ulogujte se na demoqa(https://demoqa.com/ -> Book Store Application)
    // preko cookies-a, dodati dve knjige na svoj nalog, zatim se izlogovati brisanjem cookies-a.
      //Ulogovati se ponovo preko log-in forme i potvrditi da se knjige i dalje nalaze na nalogu

    WebDriver driver;
    WebElement bookStore;
    WebElement login;
    WebElement username;
    WebElement password;
    WebElement loginButton;

    @BeforeClass
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
        scrollToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[2]")));
        bookStore = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[2]"));
        bookStore.click();
        login = driver.findElement(By.id("login"));
        login.click();

        Thread.sleep(2000);

        Cookie kuki = new Cookie("userName", "golmanbrani%C4%87");
        Cookie kuki2 = new Cookie("userID", "f319ed0c-8185-4370-8295-3fb09fc8fe34");
        Cookie kuki3 = new Cookie("expires", "2024-01-30T08%3A01%3A00.628Z");
        Cookie kuki4 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImdvbG1hbmJyYW5pxIciLCJwYXNzd29yZCI6IkFhMTIzNDU2NzhAIiwiaWF0IjoxNzA1OTk2ODYwfQ.925mWNRZVulr9KI_AowjHjeMLnpwmvittgIPWSbN9xo");
        //driver.navigate().refresh();

        driver.manage().addCookie(kuki);
        driver.manage().addCookie(kuki2);
        driver.manage().addCookie(kuki3);
        driver.manage().addCookie(kuki4);
        driver.navigate().refresh();

        //Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400);");
        //Thread.sleep(2000);

        List<WebElement> bookApp = driver.findElements(By.cssSelector(".btn.btn-light"));

        for (int i=0; i<bookApp.size(); i++){
            if (bookApp.get(i).getText().equalsIgnoreCase("Book Store")) {
                bookApp.get(i).click();
                break;
            }
        }
        Thread.sleep(2000);



        WebElement book1 = driver.findElement(By.linkText("Git Pocket Guide"));
        book1.click();

        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0, 300);");

        List<WebElement> addBook = driver.findElements(By.cssSelector(".text-right.fullButton"));
        for (int i=0; i< addBook.size(); i++){
            if(addBook.get(i).getText().equalsIgnoreCase("add to your collection")){
                addBook.get(i).click();
            }
        }


        driver.navigate().refresh();
        driver.navigate().back();

        WebElement addBook2 = driver.findElement(By.linkText("Learning JavaScript Design Patterns"));
        addBook2.click();

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0, 300);");

        List<WebElement> addBooks = driver.findElements(By.cssSelector(".text-right.fullButton"));
        for (int i=0; i< addBooks.size(); i++){
            if(addBooks.get(i).getText().equalsIgnoreCase("add to your collection")){
                addBooks.get(i).click();
            }
        }
        driver.navigate().refresh();
        driver.navigate().back();

        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();





    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    @BeforeMethod
    public void pageSetUp() {

    }
    @Test
    public void prviTest(){

    }



}
