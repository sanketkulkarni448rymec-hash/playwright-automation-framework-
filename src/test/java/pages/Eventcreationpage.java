package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import java.util.Random;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Eventcreationpage {
    Page page;

    public final Locator Admin;
    public final Locator ManageEvents;
    public final Locator Info;
    public final Locator Name;
    public final Locator Describetheevent;
    public final Locator Category;
    public final Locator City;
    public final Locator adress;
    public final Locator eventdate;
    public final Locator price;
    public final Locator totalseats;
    public final Locator addeventbutton;
    public final Locator Sucess;

    public Eventcreationpage(Page page) {
        this.page = page;

        Admin = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Admin"));
        ManageEvents = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Manage Events")).first();
        Info = page.getByText("You can add up to 6 events. Once the limit is reached, your oldest event is automatically replaced when you add a new one.");
        Name = page.getByLabel("Title");
        Describetheevent = page.getByPlaceholder("Describe the event…");
        Category = page.getByLabel("Category");
        City = page.getByLabel("City");
        adress = page.getByPlaceholder("Venue name & address");
        eventdate = page.getByLabel("Event Date & Time");
        price = page.locator("//*[@id=\"price-($)\"]");
        totalseats = page.getByLabel("Total Seats");
        addeventbutton = page.locator("#add-event-btn");
        Sucess=page.getByText("Event created");
    }

    public void create_event(String uniqueEventName, String Desc, String categoryvalue, String Citydata,
                             String venue, String date, String Price, String total_seats) {
        Admin.click();
        ManageEvents.click();
        Name.fill(uniqueEventName);
        Describetheevent.fill(Desc);
        Category.selectOption(categoryvalue);
        City.fill(Citydata);
        adress.fill(venue);
        eventdate.fill(date);
        price.fill(Price);
        totalseats.fill(total_seats);
        addeventbutton.click();
    }

    public Locator Sucess() {
        return Sucess;
    }

    public Locator Info() {
        return Info;
    }

}

