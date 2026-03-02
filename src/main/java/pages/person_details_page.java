package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.Random;

import com.microsoft.playwright.Locator;




public class person_details_page {
	Page page;
	Add_Employee_page add_Employee_page = new Add_Employee_page(page);
	
	//public String EmployeeID= add_Employee_page.generateUniqueEmployeeId();
	 private String Searchemployee = "//label[text()='Employee Id']/following::input[1]";
	 private String Submit="//button[@type='submit']";
	 private String Editemployee="//button[@type='button'][2]";
	 private String nationalityDD="//label[text()='Nationality']/following::div[contains(@class,'oxd-select-text')][1]";
			 

	
	
	 public person_details_page(Page page) {
	        this.page = page;
	    }
	
	
	 
	 public void searchemployee() {
		 page.waitForTimeout(5000);;
		 String emp = Add_Employee_page.Emp;
		 page.locator(Searchemployee).clear();
		 page.locator(Searchemployee).type(emp);
	//	 page.locator(Submit).click();
		 
		 System.out.println("Employee ID is 2"+emp);
	 }
	 
	 
	 
	 public void Click_Search() {
		 
	//	 page.locator(Submit).click();
		 
		 page.getByRole(AriaRole.BUTTON, 
				    new Page.GetByRoleOptions().setName("Search"))
				    .click();
	 }
	 
	 
public void Edittheemployee() {
		 
//	// page.locator(Editemployee).click();
//		 page.locator(Editemployee).clear();
//		 
//		 page.getByRole(AriaRole.ROW, 
//				    new Page.GetByRoleOptions().setName(EmployeeID))
//				    .getByRole(AriaRole.BUTTON)
//				    .nth(1)
//				    .click();
			
	 }
	 

public void selectnationlaity() {
	page.locator(nationalityDD).click();
	page.click("text()=Indian");
	
}

	 
	 
	}
	
	
	
	
	
	
	
	

