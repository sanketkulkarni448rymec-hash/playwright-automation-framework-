package factory;
 
import com.microsoft.playwright.*;
 
public class PlaywrightFactory {
 
    static Playwright playwright;
    static Browser browser;
    static BrowserContext context;
    public static Page page;
 
    public static Page initBrowser() {
 
        playwright = Playwright.create();
 
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)   // true = headless mode
        );
 
        context = browser.newContext();
 
        page = context.newPage();
 
        page.navigate("https://sauce-demo.myshopify.com/");
        // 🔴 Replace with your application URL
 
        return page;
    }
 
//    public static void closeBrowser() {
//        if (browser != null) {
//            browser.close();
//        }
//        if (playwright != null) {
//            playwright.close();
//        }
//    }
}