package pages;

import com.microsoft.playwright.Page;

public class FormPage {

	
	  private Page page;
	  
	    // 🔹 Locators
	    private String Firstname = "//input[@id='firstName']";
	    private String Lastname = "//input[@id='lastName']";
	    private String Email = "//input[@id='name@example.com']";
	    private String Gender = "//*[@id='gender-radio-1']";
	    private String Mobilenum = "//*[@id='userNumber']";
	    private String Hobbies = "//*[@id='hobbies-checkbox-1']";
	    private String Cadress = "//*[@id='currentAddress']";
	    private String Submit = "//*[@id='submit']";
	    private String Form = "//*[@id='root']/div/div/div[2]/div/a[2]/div/div/div[2]";
	 
	    // 🔹 Constructor
	    public FormPage(Page page) {
	        this.page = page;
	    }
	    
	    public void clickonform() {
			   
			   page.locator(Form).click();
			   
		   }
	    
	   public void Enter_Firstnmae() {
		   
		   page.locator(Firstname).type("Sanket");
		   
	   }
	   
	   public void Enter_Lastname() {
		   
		   
		   page.locator(Lastname).type("Kulkarni");
	   }
	   
	   public void Email() {
		   page.locator(Email).type("Sanket.kulkarni1@cbre.com");
	   }
	   public void Gender() {
		   page.locator(Gender).click();
	   }
	   public void Mobilenum() {
		   page.locator(Mobilenum).type("7204538450");
	   }
	   public void Hobbies() {
		   page.locator(Hobbies).click();
	   }
	   public void Caddress() {
		   page.locator(Cadress).fill("Student Registration FormStudent Registration FormStudent Registration FormStudent Registration FormStudent Registration FormStudent Registration Form");
	   }
	   public void Submit() {
		   page.locator(Submit).click();
		   

	   }
	   
	   
	   
	   
	   
	   
}
