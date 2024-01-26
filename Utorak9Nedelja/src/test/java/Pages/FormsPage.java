package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormsPage {

    WebDriver driver;
    WebElement practiceForm;

    public FormsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getPracticeForm() {
       return driver.findElements(By.cssSelector(".element-list.collapse.show"));
    }

    public void clickOnPractice(){
        for (int i=0; i<getPracticeForm().size(); i++){
            if (getPracticeForm().get(i).getText().equalsIgnoreCase("practice form")) {
                getPracticeForm().get(i).click();
            }
        }
    }
}
