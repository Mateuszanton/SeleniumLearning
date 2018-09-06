package testPackage.advancedUserInteractionsChapter9.actionChain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.util.concurrent.TimeUnit;

public class DragAndDropOnTheElement {

    WebDriver driver;

    @Before
    public void setUp() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        driver = new ChromeDriver(options);
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.introduceFlakinessByIgnoringSecurityDomains();
        options.ignoreZoomSettings();
        options.requireWindowFocus();
        driver = new InternetExplorerDriver(options);
        driver.get("https://html5demos.com/drag/");
    }

    @After
    public void tearDown() {
        driver.close();
//        driver.quit();
    }

    @Test
    public void shouldDragElementsToTheBox() {

        WebElement firstDraggableElement = driver.findElement(By.id("one"));
        WebElement secondDraggableElement = driver.findElement(By.id("two"));
        WebElement thirdDraggableElement = driver.findElement(By.id("three"));
        WebElement forthDraggableElement = driver.findElement(By.id("four"));
        WebElement fifthDraggableElement = driver.findElement(By.id("five"));

        WebElement[] elementsList = {
                firstDraggableElement,
                secondDraggableElement,
                thirdDraggableElement,
                forthDraggableElement,
                fifthDraggableElement
        };

        WebElement dragAndDropBin = driver.findElement(By.id("bin"));

        //chain action
        for (int i = 0; i < elementsList.length; i++) {
            Actions builder = new Actions(driver);
            builder.dragAndDrop(elementsList[i], dragAndDropBin).perform();

//            Action dragAndDrop = builder.clickAndHold(elementsList[i])
//                    .moveToElement(dragAndDropBin)
//                    .release(dragAndDropBin)
//                    .build();

//            dragAndDrop.perform();
            System.out.println(i + " element was dragged to bin correctly");
        }
    }
}