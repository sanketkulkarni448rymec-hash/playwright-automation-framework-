package stepdefinitions;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;
import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class OHRMLoginSteps {
	Page page = Hooks.page;
    LoginPage loginPage = new LoginPage(page);

    @Given("user is on the OrangeHRM login page")
    public void user_is_on_login_page() {
    	PlaywrightFactory.initBrowser();
    }

    @When("user enters valid username {string}")
    public void user_enters_username(String username) throws InterruptedException {
        loginPage.enterUsername(username);
    }

    @And("user enters valid password {string}")
    public void user_enters_password(String password) throws InterruptedException {
        loginPage.enterPassword(password);
    }

    @And("user clicks on login button")
    public void user_clicks_login() throws InterruptedException {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to dashboard page")
    public void user_should_see_dashboard() {
        loginPage.isDashboardVisible();
    }
    

    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String username) throws InterruptedException {
        loginPage.enterinvalidUsername(username);
    }

    @And("user enters invalid password {string}")
    public void user_enters_invalid_password(String password) throws InterruptedException {
        loginPage.enterinvalidpassword(password);
    }
 
    @And("error message {string} Invalid credentials should be displayed")
    public void error_message_Invalid_credentials_should_be_displayed(String error) throws InterruptedException {
        loginPage.errormessage();
}
}
