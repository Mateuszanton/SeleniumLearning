package testPackage.FirstTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter2Testing {

    WebDriver driver;

    private void loadHomePage() {
        driver.get("http://book.theautomatedtester.co.uk");
    }

    private void clickAndLoadChapter2() {
        driver.findElement(By.linkText("Chapter2")).click();
    }

    @Before
    public void SetUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void TearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void shouldCheckButtonOnChapter2Page() {
        loadHomePage();
        clickAndLoadChapter2();
        Assert.assertEquals(driver.findElements(By.id("but1")).size(), 1);
    }

    @Test
    public void shouldCheckAnotherButtonOnChapter2Page() {
        loadHomePage();
        clickAndLoadChapter2();
        Assert.assertEquals(driver.findElements(By.name("verifybutton")).size(), 1);
    }
}