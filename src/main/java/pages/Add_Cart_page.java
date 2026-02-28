package pages;

import com.microsoft.playwright.Page;

import factory.PlaywrightFactory;

public class Add_Cart_page {

private Page page;

public Add_Cart_page(Page page) {
    this.page = page;
}

public void click_on_product() {
	page = PlaywrightFactory.initBrowser();
	page.locator("//*[@id='product-1']").click();
	
}
	
	
	
	
}
