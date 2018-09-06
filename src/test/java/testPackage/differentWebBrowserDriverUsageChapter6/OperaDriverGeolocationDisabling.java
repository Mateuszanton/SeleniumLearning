package testPackage.differentWebBrowserDriverUsageChapter6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.util.List;

public class OperaDriverGeolocationDisabling {

    WebDriver driver;

    @Before
    public void setUp() {
        OperaOptions options = new OperaOptions();
        options.addArguments("--disable-search-geolocation-disclosure");
        options.addArguments("--start-maximized"); //same switches as chromedriver addArguments
        options.setBinary("C:\\Program Files\\Opera\\55.0.2994.44\\opera.exe");
        driver = new OperaDriver(options);
        driver.get("http://book.theautomatedtester.co.uk");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void shouldGoToChapter2ByLinkThenAssertThatThereIsOneIndexLinkFound() {
        WebElement element = driver.findElement(By.cssSelector("a[href='/chapter4']"));
        element.click();
        List<WebElement> link = driver.findElements(By.linkText("Index"));
        Assert.assertEquals(1, link.size());
    }
}