import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import page.TestRunPage;
import org.testng.annotations.Test;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class TestRunTest  {

    TestRunPage testRunPage = new TestRunPage();

    @BeforeMethod
    @Description("Open test-run page")
    public void testRun(){
        testRunPage.openPage();

    }

    @Test
    @Description("Open first finished test result and verifies if required content is present")
    public void getTestRunInformation(){
        testRunPage.openTestResults();
        testRunPage.checkOutComeRateTitle();
    }

    @Test
    @Description("Sort by results")
    public void sortByFirstSelectTest() {
        testRunPage.sortByFirstSelectTest();
    }

    @Test
    @Description("Sort by names")
    public void sortBySecondSelectTest() {
        testRunPage.sortBySecondSelectTest();
    }

    @Test
    @Description("Sort by dates")
    public void sortByThirdSelectTest() {
        testRunPage.sortByThirdSelectTest();
    }

    @Test
    @Description("Click on sort by \"Manual\"")
    public void sortByManualTest() {
        testRunPage.sortByManual();
    }

    @Test
    @Description("Click on sort by \"Flag\"")
    public void sortByFlagTest() {
        testRunPage.sortByFlag();
    }

    @Test
    @Description("Click on sort by \"Name\"")
    public void sortByNameTest() {
        testRunPage.sortByName();
    }

    @Test
    @Description("Click on sort by \"Machines\"")
    public void sortByMachinesTest() {
        testRunPage.sortByMachines();
    }

    @Test
    @Description("Click on sort by \"Iterations\"")
    public void sortByIterations() {
        testRunPage.sortByIterations();
    }

    @Test
    @Description("Click on sort by \"Probes\"")
    public void sortByProbes() {
        testRunPage.sortByProbes();
    }

    @Test
    @Description("Click on sort by \"Time\"")
    public void sortByTime() {
        testRunPage.sortByTime();
    }

    @Test
    @Description("Search ran test by name or description")
    public void searchByName() {
        testRunPage.searchByName("test");
    }
}
