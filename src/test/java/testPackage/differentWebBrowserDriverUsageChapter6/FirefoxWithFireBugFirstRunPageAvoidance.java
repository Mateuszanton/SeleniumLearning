package testPackage.differentWebBrowserDriverUsageChapter6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class FirefoxWithFireBugFirstRunPageAvoidance {

    WebDriver driver;

    @Before
    public void setUp() {
        FirefoxProfile profile = new FirefoxProfile(); //to chyba jest stare, teraz jest options tak jak w chrome
        FirefoxOptions option = new FirefoxOptions();
        option.setProfile(profile);
//        profile.addExtension(new File("D:\\Selenium\\firebug\\firebug.xpi")); //firefox juz nie wspiera ;<
//        profile.setPreference("extentions.firebug.currentVersion", "99.9");
        driver = new FirefoxDriver(option);
        driver.get("http://book.theautomatedtester.co.uk/chapter4");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void shouldFindElementThenSendKeys() {
        WebElement element = driver.findElement(By.id("nextBid"));
        element.sendKeys("100");
    }
}