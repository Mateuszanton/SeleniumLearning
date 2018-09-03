package testPackage.findingElementsChapter5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsById;

import java.util.List;

public class FindElementsbyIdUsage {
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
        List<WebElement> elements = ((FindsById) driver).findElementsById("verifybutton");
        Assert.assertEquals(1, elements.size());
    }
}