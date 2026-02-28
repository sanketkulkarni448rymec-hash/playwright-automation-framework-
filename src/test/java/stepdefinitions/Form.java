package stepdefinitions;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;
import io.cucumber.java.en.*;
import pages.FormPage;
//import pages.LoginPage;

public class Form {
	
   Page page;
	FormPage formPage ;
	

	
	  @Given("User launches the browser")
	    public void launchBrowser() {
	        page = PlaywrightFactory.initBrowser();
	       // loginPage = new LoginPage(page);
	        formPage= new FormPage(page);
	       
	        
	   }
	@When("click on forms")
	public void click_on_forms() {
		formPage= new FormPage(page);
		formPage.clickonform();
		
	    page.evaluate("document.querySelectorAll('iframe').forEach(e => e.remove());");
	}
	 
	
	
	@When("enter the form values")
	public void enter_the_form_values() {
		formPage.Enter_Firstnmae();
		
		formPage.Enter_Lastname();
//		
		formPage.Email();
		
		formPage.Gender();
		
		formPage.Mobilenum();
		
		formPage.Hobbies();
		
		formPage.Caddress();
		
		
		
	}
	
	@Then("hen submit the from")
	public void hen_submit_the_from() {
		formPage.Submit();
	}
}
