package stepdefinitions;
 
import com.microsoft.playwright.Page;  // ✅ ADD THIS
import com.microsoft.playwright.Playwright;

import factory.PlaywrightFactory;
import io.cucumber.java.en.*;
//import org.testng.Assert;
import pages.FormPage;
import pages.LoginPage;
 
public class LoginSteps {
 
    Page page;
    LoginPage loginPage;
    //FormPage FP;
 
    @Given("User launches the browser1")
    public void launchBrowser() {
        page = PlaywrightFactory.initBrowser();
        loginPage = new LoginPage(page);
      //  FP=new FormPage(page);
        
    }
 
    @When("User enters username {string}") 
    public void enterUsername(String username) throws InterruptedException {
        loginPage.enterUsername(username);
        
    }
 
    @When("User enters password {string}")
    public void enterPassword(String password) throws InterruptedException {
        loginPage.enterPassword(password);
    }
 
    @When("User clicks login button")
    public void clickLogin() throws InterruptedException {
        loginPage.clickLogin();
    }
// 
//    @Then("User should see dashboard page")
//    public void verifyDashboard() {
//       // Assert.assertTrue(loginPage.isDashboardVisible());
//    }
}
 