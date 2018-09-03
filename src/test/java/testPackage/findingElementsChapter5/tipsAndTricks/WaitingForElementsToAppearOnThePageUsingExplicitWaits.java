package testPackage.findingElementsChapter5.tipsAndTricks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitingForElementsToAppearOnThePageUsingExplicitWaits {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter1");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public List<WebElement> dupa() {
        return driver.findElements(By.xpath("da"));
    }

    //TODO sprawdzic jak mozna to zastosowac dla list elementow

    @Test
    public void testExample() {
        WebElement element = (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver d) {
                        return d.findElements(By.cssSelector("div#storetext")).get(1); //get tylko dla findElements
                    }
                });
    }
}