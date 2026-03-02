package stepdefinitions;

import com.microsoft.playwright.Page;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.Add_Employee_page;

public class Add_Employeee_Stepdef {

    Add_Employee_page add_Employee_page = new Add_Employee_page(Hooks.page);

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
        add_Employee_page.Enter_Firstname("Sanket"); // pass the actual first name
    }

    @And("Enter the Last name of the employee")
    public void enter_the_last_name_of_the_employee() {
        add_Employee_page.Enter_Lastname("Kulkarni"); // pass last name
        add_Employee_page.generateEmployeeIdOnce();    // generate unique Emp ID once
        add_Employee_page.Enter_EmployeeID();         // enter Emp ID in field
    }

    @And("Click on Save button")
    public void click_on_save_button() {
        add_Employee_page.Click_on_Save();
    }

    @Then("Validate Employee is created")
    public void validate_employee_is_created() {
        add_Employee_page.Validate_Success_Message();
    }
}