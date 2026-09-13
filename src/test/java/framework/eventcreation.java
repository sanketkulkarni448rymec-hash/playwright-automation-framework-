package framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.EventBooking;
import pages.Eventcreationpage;
import utils.DataProviderUtil;

import java.io.IOException;
import java.util.HashMap;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class eventcreation extends BaseTest {
    static String uniqueEventName;


    @DataProvider(name="create event")
    public Object[][] eventbooking() throws IOException {

        return  DataProviderUtil.getJsonDataToMap("/src/test/resource/Testdat.json");

    }


    @Test(dataProvider = "create event", dependsOnGroups="Login" , groups ="Event")
    public void createevent(HashMap<String , String >data) {
        Eventcreationpage  Ec = new Eventcreationpage(page);
      //  assertThat(Ec.browseEventsLink()).isVisible();

        page.navigate("https://eventhub.rahulshettyacademy.com/admin/events");
        assertThat(Ec.Info()).hasText("You can add up to 6 events. Once the limit is reached, your oldest event is automatically replaced when you add a new one.");
          uniqueEventName = "Test Event " + System.currentTimeMillis();

        System.out.println("Name of the Event: " + uniqueEventName);





        Ec.create_event(
                uniqueEventName,
                data.get("description"),
                data.get("category"),   // maps to Category dropdown
                data.get("city"),
                data.get("venue"),
                data.get("dateTime"),
                data.get("price"),
                data.get("totalSeats")
        );




    }
}
