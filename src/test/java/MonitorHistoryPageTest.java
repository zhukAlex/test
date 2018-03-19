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
    @Description("Click on sort by \"Result\"")
    public void testSortByResult() {
        monitorHistoryPage.sortByResult();
    }

    @Test
    @Description("Click on sort by \"Monitor\"")
    public void testSortByMonitor() {
        monitorHistoryPage.sortByMonitor();
    }

    @Test
    @Description("Click on sort by \"Date\"")
    public void testSortByDate() {
        monitorHistoryPage.sortByDate();
    }

    @Test
    @Description("Click on sort by \"Flag\"")
    public void testSortByFlag() {
        monitorHistoryPage.sortByFlag();
    }

    @Test
    @Description("Click on sort by \"Name\"")
    public void testSortByName() {
        monitorHistoryPage.sortByName();
    }

    @Test
    @Description("Click on sort by \"Run\"")
    public void testSortByRun() {
        monitorHistoryPage.sortByRun();
    }

    @Test
    @Description("Click on sort by \"Monitor\"")
    public void testSearchByMonitor() {
        monitorHistoryPage.searchByMonitor("test");
    }

}