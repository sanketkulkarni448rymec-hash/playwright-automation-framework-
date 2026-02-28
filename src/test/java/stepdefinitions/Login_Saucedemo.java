package stepdefinitions;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;
import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.Login_Saucedemo_page;

public class Login_Saucedemo {

	
	
	 Page page;
	Login_Saucedemo_page login_Saucedemo_page ;
	
	@Given("the user navigates to the site")
	public void navigate_to_site() {
		//page=PlaywrightFactory.initBrowser();
		page = Hooks.page;
		login_Saucedemo_page= new Login_Saucedemo_page(page);
	}
	
	@When("the user enters valid username and password")
	public void enter_username_and_password() {
		login_Saucedemo_page.Click_on_Login();
		login_Saucedemo_page.Enter_Email();
		login_Saucedemo_page.Enter_Password();
	
	}
	
	@When("the user clicks on the login button")
	public void click_login() {
		login_Saucedemo_page.Singin();
	}
	
	@Then("the user should be redirected to the inventory page")
	public void verify_landing_page() {
		login_Saucedemo_page.Verifytittle();
	}
	
	
	
	
	
	
	
}
