package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.LocatorAssertions;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class EventBooking {
    private final Page page;
    private final Locator events;
    private final String uniqueEventName;
    private final Locator Tickets;
    private final Locator Fullname;
    private final Locator email;
    private final Locator phumber;
    private final Locator Confirmbooking;



    public EventBooking(Page page, String uniqueEventName) {
        this.page = page;
        this.uniqueEventName = uniqueEventName;
        this.events = page.getByTestId("nav-events");
        Tickets=page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("+"));
        Fullname=page.getByLabel("Full Name");
        email=page.getByPlaceholder("you@email.com");
        phumber=page.locator("#phone");
        Confirmbooking=page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Confirm Booking"));

    }

    public void bookEvents(String name,String emaildata, String num) throws InterruptedException {
        events.click();

        Locator eventCard = page.locator("#event-card");
        Locator Requiredcard = eventCard.filter(new Locator.FilterOptions().setHasText(uniqueEventName));


        assertThat(Requiredcard).isVisible(new LocatorAssertions.IsVisibleOptions().setTimeout(5000));
        Thread.sleep(4000);
        System.out.println("Event Added Successfully");


        Requiredcard.getByRole(
                AriaRole.LINK,
                new Locator.GetByRoleOptions().setName("Book Now")
        ).click();


        Tickets.click();
        Fullname.fill(name);
        email.fill(emaildata);
        phumber.fill(num);
        Confirmbooking.click();
    }
}