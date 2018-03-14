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
    public void sortByFirstSelectTest() {
        testRunPage.sortByFirstSelectTest();
    }

    @Test
    public void sortBySecondSelectTest() {
        testRunPage.sortBySecondSelectTest();
    }

    @Test
    public void sortByThirdSelectTest() {
        testRunPage.sortByThirdSelectTest();
    }

    @Test
    public void sortByManualTest() {
        testRunPage.sortByManual();
    }

    @Test
    public void sortByFlagTest() {
        testRunPage.sortByFlag();
    }

    @Test
    public void sortByNameTest() {
        testRunPage.sortByName();
    }

    @Test
    public void sortByMachinesTest() {
        testRunPage.sortByMachines();
    }

    @Test
    public void sortByIterations() {
        testRunPage.sortByIterations();
    }

    @Test
    public void sortByProbes() {
        testRunPage.sortByProbes();
    }

    @Test
    public void sortByTime() {
        testRunPage.sortByTime();
    }

    @Test
    public void searchByName() {
        testRunPage.searchByName("test");
    }
}
