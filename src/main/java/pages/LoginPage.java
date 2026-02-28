package pages;
 
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.microsoft.playwright.options.LoadState;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
 
public class LoginPage {
 
    private Page page;
 
    // 🔹 Locators
    private String usernameInput = "//*[@name='username']";
    private String passwordInput = "//*[@type='password']";
    private String loginButton = "//button[@type='submit']";
    private String dashboardHeader = "h6:has-text('Dashboard')";
    private String errormessage="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']";
    // 🔹 Constructor
    public LoginPage(Page page) {
        this.page = page;
    }
 
    // 🔹 Actions
    public void enterUsername(String username) throws InterruptedException {
        //page.waitForSelector(usernameInput,new Page.WaitForSelectorOptions().setTimeout(1000));
      
        page.locator(usernameInput).type(username);
    //    page.wait(10000);
        
        page.waitForLoadState(LoadState.LOAD);
    }
 
    public void enterPassword(String password) throws InterruptedException {
    	 page.locator(passwordInput).fill(password);
    	
		//	page.wait(10000);
   	 page.waitForLoadState(LoadState.LOAD);
        
    }
 
    public void clickLogin() throws InterruptedException {
    	 page.locator(loginButton).click();
    //	 page.wait(10000);
    	 page.waitForLoadState(LoadState.LOAD);
    	// System.out.println("Execution completed...................");
    	 assertThat(page).hasTitle("OrangeHRM");
    	// System.out.println("Execution completed sucesfullyy...................");
    	 
    	// page.close();
    
    }
 
    public void isDashboardVisible() {
  //  return page.locator("text=Dashboard").isVisible();
	 assertThat(page).hasTitle("OrangeHRM");
    }
    public void enterinvalidUsername(String username) throws InterruptedException {
        //page.waitForSelector(usernameInput,new Page.WaitForSelectorOptions().setTimeout(1000));
      
        page.locator(usernameInput).type(username);
    //    page.wait(10000);
        
        page.waitForLoadState(LoadState.LOAD);
       
}
    public void enterinvalidpassword(String username) throws InterruptedException {
        //page.waitForSelector(usernameInput,new Page.WaitForSelectorOptions().setTimeout(1000));
      
        page.locator(passwordInput).type(username);
    //    page.wait(10000);
        
        page.waitForLoadState(LoadState.LOAD);
       
}
    
    public void errormessage() {
    	
    	
    Locator error=	page.locator(errormessage);
    
    assertThat(error).hasText(dashboardHeader, null);
    	
    	
    }


    
}