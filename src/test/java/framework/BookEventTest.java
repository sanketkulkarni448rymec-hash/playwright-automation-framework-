package framework;

import org.testng.annotations.Test;
import pages.EventBooking;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class BookEventTest extends BaseTest {




    @Test(dependsOnGroups = "Event")
    public void Book() throws InterruptedException {

        EventBooking EB = new EventBooking(
                page,
                eventcreation.uniqueEventName
        );

        EB.bookEvents(
                "Sanket",
                "Sanket@gmail.com",
                "4567890987"
        );
        assertThat(page.getByText("Booking Confirmed!")).isVisible();
        System.out.println("Booking Sucesfully ");
    }
}