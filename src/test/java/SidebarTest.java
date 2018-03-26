import io.qameta.allure.Description;
import org.testng.annotations.Test;
import page.SidebarPage;
import page.TestDetailsPage;
import org.testng.annotations.BeforeClass;

/**
 * Created by Martin Keprta on 3/4/2018.
 */
public class SidebarTest extends TestDetailsPage {

    SidebarPage sidebarPage;

    @BeforeClass
    @Description("Opening base page")
    public void openPage(){
        sidebarPage = new SidebarPage();
    }

    @Test
    @Description("Click menu item \"Home\"")
    public void testClickAtHome() {
        sidebarPage.clickMenuItemsAtUrl("/app/main/");
    }

    @Test
    @Description("Click menu item \"Tests\"")
    public void testClickAtTests() {
        sidebarPage.clickMenuItemsAtUrl("/app/testDefinition/");
    }

    @Test
    @Description("Click menu item \"Test Run History\"")
    public void testClickAtTestRunHistory() {
        sidebarPage.clickMenuItemsAtUrl("/app/testRun/");
    }

    @Test
    @Description("Click menu item \"Monitor Run History\"")
    public void testClickAtMonitorRunHistory() {
        sidebarPage.clickMenuItemsAtUrl("/app/monitor-run/");
    }

    @Test
    @Description("Click menu item \"Analyze Web RTC Dump\"")
    public void testClickAtAnalyze() {
        sidebarPage.clickMenuItemsAtUrl("/app/analyzeDump/");
    }

    @Test
    @Description("Testing chat")
    public void testClickChat() {
        sidebarPage.clickChat();
    }
}
