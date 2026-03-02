package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;



public class Add_Employee_page {
	Page page;
	
	 public Add_Employee_page(Page page) {
	        this.page = page;
	    }
	
	public void Click_on_PIM_from_Menu() {
		
		((Page) page).getByText("PIM").click();
	}
	
	
	
	public void Click_on_AddEmployee() {
		
	//	((Page) page).getByText("Add").click();
		//page.locator("//*[@class='orangehrm-header-container']").click();
		page.getByRole(AriaRole.BUTTON, 
		        new Page.GetByRoleOptions().setName("Add")
		    ).click();

	}
	

		// Click the Add button and wait for navigation
		public final void click_on_add_button() {
		    page.getByRole(AriaRole.BUTTON,
		        new Page.GetByRoleOptions().setName("Add")
		    ).click();
		}
	
	
	
	
	public void Enter_Firstname() {
		
		//page.getByPlaceholder("First Name").type("Test1");
		
		 Locator firstName = page.locator("input[name='firstName']");
		assertThat(firstName).isVisible();
		firstName.fill("John");
		
		
	}
	
	public void Enter_Lastname() {
		
		page.getByPlaceholder("Last Name").type("Test2");
		
		
	}
	
	
	public void Click_on_Save() {
		
		page.locator("//button[@type='submit']").click();
		
	}
public void Sucessmessage() {
		
//	assertThat(page.locator(".oxd-toast-content-text"))
//    .containsText("Successfully Saved");assertThat(page.locator(".oxd-toast-content-text"))
//    .containsText("Successfully Saved");
    
    
    assertThat(
    	    page.getByText("Successfully Saved", new Page.GetByTextOptions().setExact(true))
    	).isVisible();
		
	}
	
	
	
	
	
	
	
	
}
