import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Zadatak 10
//Otici na stranicu https://imgflip.com/memegenerator
//Uploadovati sliku od koje treba napraviti mim
//Mim mora biti vezan za IT, QA ili kurs
//Sliku rucno skinuti i ubaciti na Slack thread poruku
//Autor mima sa najvise lajkova dobija pivo na druzenju
//
//Napomena: Izazov zadatka je kod lokatora, assertove ne treba dodavati i ne treba raditi sa
// anotacijama

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://imgflip.com/memegenerator");
        // Thread.sleep(5000);
        WebElement template = driver.findElement(By.id("mm-show-upload"));
        template.click();

        String meme = "/Users/stefang/Desktop/memeIT.png";

        WebElement uploadURL = driver.findElement(By.id("mm-upload-url"));
        uploadURL.sendKeys(meme);
        WebElement upload = driver.findElement(By.id("mm-upload-btn"));
        upload.click();



    }
}
