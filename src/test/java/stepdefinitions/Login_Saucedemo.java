package stepdefinitions;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;
import io.cucumber.java.en.*;
import pages.Login_Saucedemo_page;

public class Login_Saucedemo {

	
	
	Page page;
	Login_Saucedemo_page login_Saucedemo_page ;
	
	@Given("Navigate to site")
	public void navigate_to_site() {
		page=PlaywrightFactory.initBrowser();
		login_Saucedemo_page= new Login_Saucedemo_page(page);
	}
	
	@When("Enter username and password")
	public void enter_username_and_password() {
		login_Saucedemo_page.Click_on_Login();
		login_Saucedemo_page.Enter_Email();
		login_Saucedemo_page.Enter_Password();
	
	}
	
	@When("Click Login")
	public void click_login() {
		login_Saucedemo_page.Singin();
	}
	
	@Then("Verify landing page")
	public void verify_landing_page() {
		login_Saucedemo_page.Verifytittle();
	}
	
	
	
	
	
	
	
}
