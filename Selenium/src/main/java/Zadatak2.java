import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak2 {
    //Zadatak 2
//Otvoriti browser i jos 5 tabova
//Na svakom tabu otvoriti URL po zelji
//Zatvoriti sve tabove osim onog gde je otvoren Google
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://www.joberty.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i=0; i<5; i++){
            js.executeScript("window.open()");
        }

        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listaTabova.get(1));
        driver.get("https://www.youtube.com/");

        driver.switchTo().window(listaTabova.get(2));
        driver.get("https://www.linkedin.com/feed/");

        driver.switchTo().window(listaTabova.get(3));
        driver.get("https://www.google.com/");

        driver.switchTo().window(listaTabova.get(4));
        driver.get("https://www.facebook.com/");

        driver.switchTo().window(listaTabova.get(5));
        driver.get("https://pomofocus.io/");

        for (int i=0; i<listaTabova.size(); i++){
            driver.switchTo().window(listaTabova.get(i));
            if (!driver.getCurrentUrl().equalsIgnoreCase("https://www.google.com/")) {
                driver.close();
            }
        }

    }
}
