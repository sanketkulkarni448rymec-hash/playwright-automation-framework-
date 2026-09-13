package framework;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.*;

public class BaseTest {

    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    protected static Page page;
    String browserName = ConfigReader.getProperty("browser");

    @BeforeSuite
    public void setUp() {
        PlaywrightFactory.setup(ConfigReader.getProperty("browser"));
        page = PlaywrightFactory.getPage();// Create Page
    }

    @AfterSuite
    public void tearDown() {
        if (context != null) context.close();       // Close Context
        if (browser != null) browser.close();        // Close Browser
        if (playwright != null) playwright.close();  // Close Playwright
    }
}