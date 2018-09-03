package testPackage.findingElementsChapter5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByLinkText;

public class FindElementByLinkTextUsage {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testExample() {
        WebElement element = ((FindsByLinkText) driver).findElementByLinkText("chapter1");
      element.isDisplayed();
    }
}