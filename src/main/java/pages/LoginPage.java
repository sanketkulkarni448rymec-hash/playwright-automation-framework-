package pages;
 
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
 
public class LoginPage {
 
    private Page page;
 
    // 🔹 Locators
    private String usernameInput = "//*[@id=\"username\"]";
    private String passwordInput = "//*[@id=\"password\"]";
    private String loginButton = "//*[@id=\"submit\"]";
    private String dashboardHeader = "h6:has-text('Dashboard')";
 
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
    	 System.out.println("Execution completed...................");
    	 assertThat(page).hasTitle("Test Login | Practice Test Automation");
    	 System.out.println("Execution completed sucesfullyy...................");
    	 
    	 page.close();
    
    }
 
//    public boolean isDashboardVisible() {
//        return page.isVisible(dashboardHeader);
//    }
}