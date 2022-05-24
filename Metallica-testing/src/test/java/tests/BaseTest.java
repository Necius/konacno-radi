package tests;

import Pages.Kupindo;
import browser.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

    protected static Kupindo kupindo;

    @BeforeClass
    public static void setup() {
        kupindo = new Kupindo();
        ChromeDriverManager.chromedriver().setup();

    }

    @AfterClass
    public static void cleanUp() {
        Browser.getBrowser().quit();
    }

}
