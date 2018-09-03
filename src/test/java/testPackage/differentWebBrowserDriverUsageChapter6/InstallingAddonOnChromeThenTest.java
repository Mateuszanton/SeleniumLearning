package testPackage.differentWebBrowserDriverUsageChapter6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstallingAddonOnChromeThenTest {
    WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
//        use it when the chrome is not installed in default location
//        options.setBinary("path/to/Chrome/location");

//        path to custom profile
//        options.addArguments("user-data-dir=/path/to/your/custom/profile");
        options.addArguments("--start-maximized");
//        list of switches: https://peter.sh/experiments/chromium-command-line-switches
//        installing addon
//        options.addExtensions(new File("path/to/extension.crx"));

        driver = new ChromeDriver(options);
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