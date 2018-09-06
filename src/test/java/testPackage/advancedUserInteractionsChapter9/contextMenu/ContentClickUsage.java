package testPackage.advancedUserInteractionsChapter9.contextMenu;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContentClickUsage {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://html5demos.com/drag/");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void shouldExpandContextMenu() {
        WebElement htmlBadge = driver.findElement(By.id("html5badge"));
        Actions builder = new Actions(driver);
        builder.contextClick(htmlBadge).build().perform();
    }
}