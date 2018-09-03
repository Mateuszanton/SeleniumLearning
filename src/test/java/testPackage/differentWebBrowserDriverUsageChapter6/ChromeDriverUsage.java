package testPackage.differentWebBrowserDriverUsageChapter6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverUsage {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter4");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void shouldGetElementAttributeThenAssetToExpectedText() {
        WebElement element = driver.findElement(By.id("selectLoad"));
        String value = element.getAttribute("value");
        Assert.assertEquals("Click to load the select below", value);
    }
}