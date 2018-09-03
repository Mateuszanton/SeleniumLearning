package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Chapter2 {
    WebDriver driver;

    @FindBy(how = How.NAME, using = "verifybutton")
    @CacheLookup
    WebElement verifybutton;

    public Chapter2(WebDriver driver) {
        this.driver = driver;
        if (!"Chapter2".equalsIgnoreCase(this.driver.getTitle())) {
            driver.get("http://book.theautomatedtester.co.uk/chapter2");
        }
    }

    public boolean isButtonPresent(String button) {
        return driver.findElement(By.xpath("//input[@id='" + button + "']")).isDisplayed();
    }
}