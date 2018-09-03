package testPackage.pageFactoryUsage78;

        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;


public class TestChapter2Improved {
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

    // TODO nie dziala to to:
//     initialize the factory:
//   public Chapter2Improvement clickChapter2() {
//        clickChapter("2");
//        return PageFactory.initElements(selenium, Chapter2Improvement.class);
//    }


    @Test
    public void shouldLoadTheHomePageThenCheckButtonOnChapter2() {
        selenium.get("http://book.theautomatedtester.co.uk");
        HomePage hp = new HomePage(selenium);
        Chapter2Improvement chi2 = hp.clickChapter2();
        Assert.assertTrue(chi2.isButton("but1"));
    }
}