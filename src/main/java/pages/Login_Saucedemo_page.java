package pages;

import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Login_Saucedemo_page {

	Page page;
	public Login_Saucedemo_page(Page page) {
		// TODO Auto-generated constructor stub
		 this.page = page;
	}
//	 public FormPage(Page page) {
//	        this.page = page;
//	    }
//	
	public void Click_on_Login() {
		
	page.locator("#customer_login_link").first().click();
		
	}
	
	public void Enter_Email() {
		
		page.locator("//input[@id='customer_email']").type("sanketkulkarni448rymec@gmail.com");
		
	}
	
	public void Enter_Password() {
		
		page.locator("//input[@id='customer_password']").type("Sanket@1996");
	}
	
	public void Singin() {
		
	page.locator("//*[@id='customer_login']/div[5]/input").click();
		
		
	}
	
	public void Verifytittle() {
		
		
		assertThat(page).hasTitle("Account – Sauce Demo");
		
		
		
	}
	
}