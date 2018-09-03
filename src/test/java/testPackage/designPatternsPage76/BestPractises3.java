package testPackage.designPatternsPage76;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestPractises3 {
    WebDriver selenium;

    @Before
    public void setUP() {
        selenium = new ChromeDriver();
    }

    @After
    public void tearDown() {
        selenium.close();
        selenium.quit();
    }

    @Test
    public void
    ShouldLoadTheHomePageAndThenCheckButtonOnChapter2() {
        selenium.get("http://book.theautomatedtester.co.uk");
        HomePage hp = new HomePage(selenium);
        Chapter2 ch2 = hp.clickChapter2();
        Assert.assertTrue(ch2.isButtonPresent("but1"));
    }
}