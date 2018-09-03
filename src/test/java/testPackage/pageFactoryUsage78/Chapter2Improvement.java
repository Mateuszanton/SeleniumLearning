package testPackage.pageFactoryUsage78;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Chapter2Improvement {
    WebDriver selenium;
    //  findElement() method is not called
//  The improvement:
    @FindBy(how = How.NAME, using = "verifybutton")
    @CacheLookup //using it to search the element just one time when it is used
    WebElement verifybutton;

    public Chapter2Improvement(WebDriver selenium) {
        this.selenium = selenium;
//        verifybutton = selenium.findElement(By.id("verifybutton")); now the verifybutton is not in the constructor
        if (!"Chapter 2".equalsIgnoreCase(this.selenium.getTitle())) {
            selenium.get("http://book.theautomatedtester.co.uk/chapter2");
        }
    }

    public boolean isButton(String button) {
        return selenium.findElements(By.xpath("//input[@id='" + button + "']")).size() > 0;
    }
}