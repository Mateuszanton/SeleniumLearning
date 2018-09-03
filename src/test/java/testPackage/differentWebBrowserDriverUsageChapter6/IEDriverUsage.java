package testPackage.differentWebBrowserDriverUsageChapter6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.internal.FindsByCssSelector;

public class IEDriverUsage {
    WebDriver driver;

    @Before
    public void setUp() {
//        System.setProperty("webdriver.ie.driver.logfile", "C:/Projects/logme.txt"); maybe helpful
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.ignoreZoomSettings();
        options.introduceFlakinessByIgnoringSecurityDomains();
        options.ignoreZoomSettings();
        options.enablePersistentHovering();
        options.requireWindowFocus();
//        options.destructivelyEnsureCleanSession();
        driver = new InternetExplorerDriver(options);
        driver.get("http://book.theautomatedtester.co.uk/chapter4");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shouldGoToChapter4ThenAssertBidElement() {
        WebElement element = driver.findElement(By.cssSelector("span#bid"));
        Assert.assertEquals("50", element.getText());
    }
}