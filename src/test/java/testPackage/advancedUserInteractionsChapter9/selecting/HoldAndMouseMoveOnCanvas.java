package testPackage.advancedUserInteractionsChapter9.selecting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoldAndMouseMoveOnCanvas {

    WebDriver driver;

    @Before
    public void setUp() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.introduceFlakinessByIgnoringSecurityDomains();
        options.ignoreZoomSettings();
        driver = new InternetExplorerDriver(options);
        driver.get("https://www.tutorialspoint.com/html5/canvas_demo.htm");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shouldClickAndHoldThenMove() {
        Actions builder = new Actions(driver);
        WebElement canvas = (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver d) {
                        return d.findElement(By.cssSelector("div.content"));
                    }
                });

        builder.clickAndHold(canvas)
                .moveByOffset(-40, -60)
                .moveByOffset(20, 20)
                .moveByOffset(100, 150)
                .build()
                .perform();
    }
}