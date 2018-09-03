package testPackage.loadableComponent81;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadableComponentTest {
    WebDriver selenium;

    @Before
    public void setUp() {
        selenium = new ChromeDriver();
    }

    @After
    public void tearDown() {
        selenium.close();
        selenium.quit();
    }

    @Test
    public void shouldLoadTheHomePageThenCheckButtonOnChapter2() {
//        selenium.get("http://book.theautomatedtester.co.uk");
//        HomePage hp = new HomePage(selenium);
        Chapter2UsingPageObject chp = new Chapter2UsingPageObject(selenium).get();
        chp.isButtonDisplayed("but1");
    }
}