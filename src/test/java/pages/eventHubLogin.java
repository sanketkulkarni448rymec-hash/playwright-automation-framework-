package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import framework.ConfigReader;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class eventHubLogin {


    private final Locator Email;
    private final Locator Password;
    private final Locator button;
    private final Page page;
    public final Locator browseEventsLink;

    public eventHubLogin(Page page) {
        this.page = page;
        Email = page.getByLabel("Email");
        Password = page.getByLabel("Password");
        button = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign In"));
        browseEventsLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Browse Events →"));

    }


    public void login(String Emaildata, String password) {

        page.navigate(ConfigReader.getProperty("EventhubUrl"));
        Email.fill(Emaildata);
        Password.fill(password);
        button.click();


    }

    public Locator browseEventsLink() {
        return browseEventsLink;
    }
}
