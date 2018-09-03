package testPackage.pageFactoryUsage78;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    WebDriver selenium;

    public HomePage(WebDriver selenium) {
        this.selenium = selenium;
    }

//    public Chapter2Improvement clickChapter2() {
//        clickChapter("2");
//        return new Chapter2Improvement(selenium);
//    }
    public Chapter2Improvement clickChapter2() {
        clickChapter("2");
        return PageFactory.initElements(selenium, Chapter2Improvement.class);
    }

    private void clickChapter(String number) {
        selenium.findElement(By.linkText("Chapter" + number)).click();
    }
}