package stepdefinitions;

import com.microsoft.playwright.Page;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.Add_Employee_page;
import pages.person_details_page;

public class update_Person_details {
	
	Page page;
	
	 person_details_page person_details_page1 = new person_details_page(Hooks.page);
	@When("Search with employee name")
	public void search_with_employee_ID() {
		person_details_page1.searchemployee();
	}
	@When("click on Search")
	public void click_on_search() {
		person_details_page1.Click_Search();
	}
	@When("click on Employee")
	public void click_on_employee() {
		person_details_page1.Edittheemployee();
	}
	@When("Enter the details")
	public void enter_the_details() {
		
		person_details_page1.selectnationlaity();
	}
	@When("Click on Save")
	public void click_on_save() {
	   
	}
	@Then("Validate the employee update with Person details")
	public void validate_the_employee_update_with_person_details() {
	    
	}
}
