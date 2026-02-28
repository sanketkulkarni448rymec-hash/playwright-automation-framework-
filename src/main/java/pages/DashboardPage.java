package pages;
 
import com.microsoft.playwright.Page;
 
public class DashboardPage {
 
    private Page page;
 
    // 🔹 Locator (change if your app is different)
    private String dashboardHeader = "h6:has-text('Dashboard')";
 
    // 🔹 Constructor
    public DashboardPage(Page page) {
        this.page = page;
    }
 
    // 🔹 Verification Method
    public boolean isDashboardVisible() {
        return page.isVisible(dashboardHeader);
    }
}