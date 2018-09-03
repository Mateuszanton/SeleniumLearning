package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage0 {
    WebDriver driver;

    public HomePage0(WebDriver driver) {

        this.driver = driver;
    }
//    public void openHomePage() {
//        driver.get("http://book.theautomatedtester.co.uk");
//    }
    public Chapter2 clickChapter2() {
        clickChapter("2");
        return PageFactory.initElements(driver, Chapter2.class);
    }

    private void clickChapter(String number) {
        driver.findElement(By.linkText("Chapter" + number)).click();
    }
}