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

    @BeforeMethod
    @Description("Opening base page")
    public void testDefinition(){
        testCreatePage.openPage();
    }

    @Test
    public void createTest() {
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
    public void deleteTest() {
        testCreatePage.deleteTest(name);
    }
}