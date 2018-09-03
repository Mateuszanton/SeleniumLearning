package testPackage.FirstTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
    WebDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void TearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void FirstPageTest() {

        driver.navigate().to("http://www.sagiton.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement menu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='nav-menu-text']")));
        Assert.assertEquals("MENU", menu.getText());
    }
}