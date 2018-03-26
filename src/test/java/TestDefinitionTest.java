import page.TestDefinitionPage;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class TestDefinitionTest {

    TestDefinitionPage testDefinition = new TestDefinitionPage();

    //Correct test file
    private File validTestFile = new File("./src/test/resources/data/ValidTestFile.json");
    private File invalidTestFile = new File("./src/test/resources/data/InvalidTestFile.json");

    @BeforeMethod
    @Description("Opening base page")
    public void testDefinition(){

        testDefinition.openPage();
    }

    @Test
    @Description("Importing valid test case into suite from JSON")
    public void importValidTest(){

        testDefinition.importTest(validTestFile,true);
    }

    @Test
    @Description("Importing invalid test case into suite from JSON")
    public void importInvalidTest(){
        testDefinition.importTest(invalidTestFile,false);
    }

    @Test
    @Description("Click on \"create\" test button")
    public void createTest(){
        testDefinition.createTest();
    }

    @Test
    @Description("Click on sort by \"Name\"")
    public void testSortByName() {
        testDefinition.sortByName();
    }

    @Test
    @Description("Click on sort by \"Run Count\"")
    public void testSortByRunCount() {
        testDefinition.sortByRunCount();
    }

    @Test
    @Description("Click on sort by \"Last Run\"")
    public void testSortByLastRun() {
        testDefinition.sortByLastRun();
    }

    @Test
    @Description("Search test by name or description")
    public void testSearchByNameOrDescription() {
        testDefinition.searchByNameOrDescription("Talky");
    }

    @Test
    @Description("Click on next and prev page button")
    public void testChangePage() {
        testDefinition.selectPage();
    }
}
