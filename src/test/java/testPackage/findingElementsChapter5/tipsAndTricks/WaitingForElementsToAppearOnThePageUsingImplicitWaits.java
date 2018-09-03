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
import java.util.concurrent.TimeUnit;

public class WaitingForElementsToAppearOnThePageUsingImplicitWaits {
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // searching for element for 10 sec
        List<WebElement> elements = driver.findElements(By.id("non-existingId"));
        Assert.assertEquals(0, elements.size());
    }
}