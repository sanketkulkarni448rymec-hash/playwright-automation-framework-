package factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    public static Page initBrowser() {

        if (browser != null) {   // 🔥 prevents second launch
            return page;
        }

        playwright = Playwright.create();

        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        context = browser.newContext();
        page = context.newPage();

        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        return page;
    }
}