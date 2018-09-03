//package testPackage.FirstTests;
//
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Chapter2;
import pageObjects.HomePage0;

public class BestPractices {
    WebDriver driver;

    @Before
    public void SetUp() {
        driver = new ChromeDriver();
    }

    @After
    public void TearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void ShouldLoadHomePageThenClickChapter2() {
        driver.get("http://book.theautomatedtester.co.uk");
        HomePage0 homePage = new HomePage0(driver);
        Chapter2 chapter2 = homePage.clickChapter2();
        Assert.assertTrue(chapter2.isButtonPresent("but1"));
    }
}