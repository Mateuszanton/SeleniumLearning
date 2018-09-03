package testPackage.loadableComponent81;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class Chapter2UsingPageObject extends LoadableComponent<Chapter2UsingPageObject> {
    WebDriver selenium;

    @FindBy(how = How.NAME, using = "verifybutton")
    WebElement verifybutton;

    public Chapter2UsingPageObject(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
    }

    @Override
    protected void load() {
        selenium.get("http://book.theautomatedtester.co.uk/chapter2");
    }

    // https://github.com/SeleniumHQ/selenium/wiki/LoadableComponent
    @Override
    public void isLoaded() throws Error {
        String url = selenium.getCurrentUrl();
        System.out.println("to strona" + url);
        Assert.assertTrue(url.equals("http://book.theautomatedtester.co.uk/chapter2"));
    }

    public boolean isButtonDisplayed(String button) {
        return selenium.findElement(By.id(button)).isDisplayed();
    }
}