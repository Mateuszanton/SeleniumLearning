package testPackage.advancedUserInteractionsChapter9.actionChain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByOffset {

    WebDriver driver;

    @Before
    public void setUp() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.introduceFlakinessByIgnoringSecurityDomains();
        options.ignoreZoomSettings();
        options.requireWindowFocus();
        driver = new InternetExplorerDriver(options);
        driver.get("https://html5demos.com/drag/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shouldDragAndDropToXY() {
        WebElement dragItem = driver.findElement(By.id("one"));
        WebElement dragBin = driver.findElement(By.id("bin"));
        int a = dragBin.getLocation().getX();
        int b = dragBin.getLocation().getY();
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(dragItem, a, b).
                build().
                perform();
    }
}