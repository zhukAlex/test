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
    @Description("Click at menu item \"Home\"")
    public void testClickHome() {
        sidebarPage.clickMenuAtHome();
    }

    @Test
    @Description("Click at menu item \"Tests\"")
    public void testClickAtTests() {
        sidebarPage.clickMenuAtTests();
    }

    @Test
    @Description("Click at menu item \"Test Run History\"")
    public void testClickAtTestRunHistory() {
        sidebarPage.clickMenuAtTestRunHistory();
    }

    @Test
    @Description("Click at menu item \"Monitor Run History\"")
    public void testClickAtMonitorRunHistory() {
        sidebarPage.clickMenuAtMonitorRunHistory();
    }

    @Test
    @Description("Click at menu item \"Analyze Web RTC Dump\"")
    public void testClickAtAnalyze() {
        sidebarPage.clickMenuAtAnalyze();
    }

    @Test
    @Description("Testing chat")
    public void testClickChat() {
        sidebarPage.clickChat();
    }
}
