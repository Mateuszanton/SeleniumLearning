package testPackage.findingElementsChapter5.tipsAndTricks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FidingIfElementNotExistsWithoutThrowingAnException {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter1");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testExample() {
        List<WebElement> elements = driver.findElements(By.id("non-existingId"));
        Assert.assertEquals(0, elements.size());
    }
}