package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.Random;

public class Add_Employee_page {

    Page page;
    public static String Emp; // static to keep same for all objects if needed

    // Constructor
    public Add_Employee_page(Page page) {
        this.page = page;
    }

    // Click PIM menu
    public void Click_on_PIM_from_Menu() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("PIM")).click();
    }

    // Click Add Employee
    public void Click_on_AddEmployee() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
    }

    // Enter first name
    public void Enter_Firstname(String firstName) {
        Locator firstNameField = page.locator("input[name='firstName']");
        assertThat(firstNameField).isVisible();
        firstNameField.fill(firstName);
    }

    // Enter last name
    public void Enter_Lastname(String lastName) {
        Locator lastNameField = page.locator("input[name='lastName']");
        assertThat(lastNameField).isVisible();
        lastNameField.fill(lastName);
    }

    // Generate Employee ID once
    public void generateEmployeeIdOnce() {
        if (Emp == null) {
            Emp = generateUniqueEmployeeId();
        }
        System.out.println("Employee ID is: " + Emp);
    }

    // Random Employee ID generator
    private String generateUniqueEmployeeId() {
        Random random = new Random();
        int number = 10000 + random.nextInt(90000);
        return "EMP" + number;
    }

    // Enter Employee ID in field
    public void Enter_EmployeeID() {
        Locator empField = page.locator("//label[text()='Employee Id']/following::input[1]");
        assertThat(empField).isVisible();
        empField.fill(Emp);
        System.out.println("Employee ID entered: " + Emp);
    }

    // Click Save
    public void Click_on_Save() {
        Locator saveButton = page.locator("//button[@type='submit']");
        assertThat(saveButton).isVisible();
        saveButton.click();
    }

    // Validate success message
    public void Validate_Success_Message() {
        Locator toastMessage = page.getByText("Successfully Saved", new Page.GetByTextOptions().setExact(true));
        toastMessage.waitFor(new Locator.WaitForOptions()
                .setState(com.microsoft.playwright.options.WaitForSelectorState.VISIBLE)
                .setTimeout(5000));
        assertThat(toastMessage).isVisible();
        System.out.println("Employee created successfully!");
    }
}