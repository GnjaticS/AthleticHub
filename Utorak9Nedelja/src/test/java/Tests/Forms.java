package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forms extends BaseTest{

    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://demoqa.com/");
    }

    @Test
    public void UserCanFillTheForm() throws InterruptedException {
        homePage.clickOnForms("Forms");
        formsPage.clickOnPractice();

    }
}
