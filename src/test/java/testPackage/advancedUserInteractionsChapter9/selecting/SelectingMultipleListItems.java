package testPackage.advancedUserInteractionsChapter9.selecting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectingMultipleListItems {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://bugzilla.redhat.com/query.cgi?format=advanced");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void shouldSelectMultipleItemsOnTheList() {
        WebElement wholeList = driver.findElement(By.id("classification"));
        List <WebElement> options = wholeList.findElements(By.tagName("option"));

        Actions builder = new Actions(driver);
        builder.keyDown(Keys.SHIFT)
                .click(options.get(0))
                .click(options.get(2))
                .build()
                .perform();
    }
}