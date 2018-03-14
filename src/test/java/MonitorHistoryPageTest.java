import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MonitorHistoryPage;

/**
 * Created by Martin Keprta on 07.03.2018.
 */
public class MonitorHistoryPageTest {
    MonitorHistoryPage monitorHistoryPage = new MonitorHistoryPage();

    @BeforeMethod
    @Description("Opening base page")
    public void testDefinition(){
        monitorHistoryPage.openPage();
    }

    @Test
    @Description("Sort history by result")
    public void testSortByResult() {
        monitorHistoryPage.sortByResult();
    }

    @Test
    @Description("Sort history by monitor")
    public void testSortByMonitor() {
        monitorHistoryPage.sortByMonitor();
    }

    @Test
    @Description("Sort history by date")
    public void testSortByDate() {
        monitorHistoryPage.sortByDate();
    }

    @Test
    @Description("Sort history by flag")
    public void testSortByFlag() {
        monitorHistoryPage.sortByFlag();
    }

    @Test
    @Description("Sort history by name")
    public void testSortByName() {
        monitorHistoryPage.sortByName();
    }

    @Test
    @Description("Sort history by run")
    public void testSortByRun() {
        monitorHistoryPage.sortByRun();
    }

    @Test
    @Description("Search test by monitor")
    public void testSearchByMonitor() {
        monitorHistoryPage.searchByMonitor("test");
    }

}