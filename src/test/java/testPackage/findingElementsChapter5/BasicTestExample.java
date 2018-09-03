package testPackage.findingElementsChapter5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTestExample {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("book.theautomatedtester.co.uk/chapter1");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testExample() {
    }
}