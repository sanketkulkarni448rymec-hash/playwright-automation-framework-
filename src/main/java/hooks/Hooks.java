package hooks;

import com.microsoft.playwright.Page;
import factory.PlaywrightFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    public static Page page;

    @Before
    public void setUp() {
        page = PlaywrightFactory.initBrowser();  // 🔥 Only here
    }

    @After
    public void tearDown() {
        PlaywrightFactory.browser.close();
        PlaywrightFactory.playwright.close();
    }
}