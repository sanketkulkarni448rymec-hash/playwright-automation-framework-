package stepdefinitions;

import com.microsoft.playwright.Page;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.Add_Cart_page;

public class Add_Cart {
	
	Page page;
	Add_Cart_page add_Cart_page;

	@When("the user selects the first available product")
	public void the_user_selects_the_first_available_product() {
		 page = Hooks.page; 
		 add_Cart_page = new Add_Cart_page(page);  
		add_Cart_page.click_on_product();
	}
	@When("the user adds the product to the cart")
	public void the_user_adds_the_product_to_the_cart() {
	
	}
	@Then("the cart badge should display {string}")
	public void the_cart_badge_should_display(String string) {

	}
	@Then("the cart should contain the selected product")
	public void the_cart_should_contain_the_selected_product() {
	
	}

	
	
}
