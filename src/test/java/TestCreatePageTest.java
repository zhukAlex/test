import io.qameta.allure.Description;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.TestCreatePage;

/**
 * Created by Алексей on 05.03.2018.
 */
public class TestCreatePageTest {
    TestCreatePage testCreatePage = new TestCreatePage();
    String name = "NameTest" + System.currentTimeMillis();


    @Test
    @Description("Create and save new test")
    public void createTest() {
        testCreatePage.openPage("/app/new-testProperties/");
        testCreatePage.setName(name);
        testCreatePage.setDescription("desc");
        testCreatePage.setConcurrentProbes("1");
        testCreatePage.setIterations("1");
        testCreatePage.setServiceUrl("https://www.google.com/");
        testCreatePage.addRunOptions("#session");
        testCreatePage.addRunOptions("#vnc");
        testCreatePage.createTest();
    }

    @Test
    @Description("Delete created test")
    public void deleteTest() {
        testCreatePage.openPage("/app/testDefinition/");
        testCreatePage.deleteTest(name);
    }
}