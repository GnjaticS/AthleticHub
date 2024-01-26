import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.openqa.selenium.Keys.ENTER;

public class Zadatak3 {
    public static void main(String[] args) {
        //Zadatak 3
//Otici na Google
//Zatim ukucati "Wikipedia" u polje za pretragu
//Odraditi pretragu i otvoriti stranicu
//Na stranici Wikipedia pretraziti "Nikola Tesla"

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.className("gLFyf"));
        search.sendKeys("Wikipedia");
        search.sendKeys(ENTER);

        WebElement wiki = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
        wiki.click();

        WebElement wikiSearch = driver.findElement(By.id("searchInput"));
        wikiSearch.sendKeys("Nikola Tesla");
        wikiSearch.sendKeys(ENTER);

        String expectedURL = "https://en.wikipedia.org/wiki/Nikola_Tesla";

        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        WebElement Webtitle = driver.findElement(By.className("mw-page-title-main"));
        String title = Webtitle.getText();
        String expectedTitle = "Nikola Tesla";

        Assert.assertEquals(title, expectedTitle);

        WebElement pageImage = driver.findElement(By.className("mw-file-description"));

        Assert.assertTrue(pageImage.isDisplayed());

        /* Alternative code:

        import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class Zadatak4 {
    public static void main(String[] args) {

        //Zadatak 4
//Otici na Google
//Zatim ukucati "Wikipedia" u polje za pretragu
//Odraditi pretragu i otvoriti stranicu
//Na stranici Wikipedia pretraziti "Nikola Tesla"

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Wikipedia");

        List<WebElement> searchButton = driver.findElements(By.name("btnK"));
        searchButton.get(1).click();

        // Pogresan nacin
        //WebElement wikipediaLink = driver.findElement(By.className("LC20lb MBeuO DKV0Md"));

        WebElement wikipediaLink = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));

        wikipediaLink.click();

        WebElement wikipediaSearch = driver.findElement(By.id("searchInput"));

        wikipediaSearch.sendKeys("Nikola Tesla");
        wikipediaSearch.sendKeys(ENTER);

    }
}
         */
    }
}
