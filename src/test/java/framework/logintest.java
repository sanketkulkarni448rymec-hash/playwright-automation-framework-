package framework;

import org.testng.annotations.Test;
import pages.eventHubLogin;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class logintest extends BaseTest {
    eventHubLogin eventlogin;

    @Test(groups = "Login")
    public void LoginEvent() {
        eventlogin = new eventHubLogin(page);
        eventlogin.login("kulkarnisanket444@gmail.com", "Sanket@1996");
        assertThat(page).hasTitle("EventHub — Discover & Book Events");
        assertThat(eventlogin.browseEventsLink()).hasText("Browse Events →");

    }

}
