package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

		 
	    @Before
	    public void setup() {
	        System.out.println("Starting Test...");
	    }
	 
//	    @After
//	    public void tearDown() {
//	        System.out.println("Test Finished...");
//	    }
//		
}
