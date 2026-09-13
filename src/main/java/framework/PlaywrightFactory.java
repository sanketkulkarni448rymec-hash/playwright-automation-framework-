package framework;

import com.microsoft.playwright.*;


public class PlaywrightFactory {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    public static Page page;
    Page newTab;
    static boolean Headlessvalue = Boolean.parseBoolean(ConfigReader.getProperty("headless"));
    static boolean browserName = Boolean.parseBoolean(ConfigReader.getProperty("browser"));

    public static void setup(String browserName) {

        playwright = Playwright.create();


        switch (browserName.toLowerCase()) {

            case "chromium":
                browser = playwright.chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(Headlessvalue));
                break;
            case "firefox":
                browser = playwright.firefox().launch(
                        new BrowserType.LaunchOptions().setHeadless(Headlessvalue));
                break;
            case "webkit":
                browser = playwright.webkit().launch(
                        new BrowserType.LaunchOptions().setHeadless(Headlessvalue));
                break;
            default:
                throw new IllegalArgumentException("Invalid browser" + browserName);

        }
        context = browser.newContext();
        page = context.newPage();
    }

        public static Page getPage() {
            return page;
        }

        public static Browser getBrowser() {
            return browser;
        }

        public static BrowserContext getContext() {
            return context;
        }

        public static void closeBrowser() {

            if (page != null) {
                page.close();
            }

            if (context != null) {
                context.close();
            }

            if (browser != null) {
                browser.close();
            }

            if (playwright != null) {
                playwright.close();
            }
        }
    }


