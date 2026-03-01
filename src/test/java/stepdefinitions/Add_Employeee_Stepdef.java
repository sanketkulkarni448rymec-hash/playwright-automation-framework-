package stepdefinitions;

import com.microsoft.playwright.Page;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.Add_Employee_page;

public class Add_Employeee_Stepdef {
	
	Page page;
	Add_Employee_page add_Employee_page =new Add_Employee_page(Hooks.page) ;
	
	
	@Given("User click on PIM Menu")
	public void user_click_on_pim_menu() {
		add_Employee_page.Click_on_PIM_from_Menu();
	}
	@And("click on Add button")
	public void click_on_add_button() {
		add_Employee_page.Click_on_AddEmployee();

	}
	@And("Enter the First name of the employee")
	public void enter_the_first_name_of_the_employee() {
		add_Employee_page.Enter_Firstname();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
	@And("Enter the Last name of the employee")
	public void enter_the_last_name_of_the_employee() {
		add_Employee_page.Enter_Lastname();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@And("Click on Save button")
	public void click_on_save_button() {
		add_Employee_page.Click_on_Save();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("Validate Employee is created")
	public void validate_employee_is_created() {
		add_Employee_page.Sucessmessage();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
