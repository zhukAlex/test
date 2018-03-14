package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Алексей on 05.03.2018.
 */

public class TestCreatePage {
    private SelenideElement testName = $(By.xpath(".//input[@name='name']"));
    private SelenideElement testDescription = $(By.xpath(".//textarea[@name='info']"));
    private SelenideElement testConcurrent = $(By.xpath(".//input[@name='concurrentUsers']"));
    private SelenideElement testIterations = $(By.xpath(".//input[@name='loopCount']"));
    private SelenideElement testOptions = $(By.xpath(".//input[@name='runOptions']"));
    private SelenideElement testUrl = $(By.xpath(".//input[@name='serviceUrl']"));
    private SelenideElement saveTestButton = $(By.xpath(".//button[@progress-button='vm.submit(form)']"));
    private SelenideElement runTestButton = $(By.xpath(".//button[@progress-button='vm.run(form)']"));
    private SelenideElement deleteTestButton = $(By.xpath(".//a[@ng-click='vm.delete()']"));
    private SelenideElement deleteAcceptTestButton = $(By.xpath(".//button[@class='confirm']"));
    private List<SelenideElement> testList= $$(By.xpath(".//table[@class='table grid-table']//tr"));

    public TestCreatePage() {

    }

    public void openPage(){
        //Open page based on relative url
        open("/app/new-testProperties/");
        //This conditions checks if test data from previous run were deleted
        //newTestCase.shouldNot(Condition.exist);
        sleep(2000);
    }

    public void createTest() {
        saveTestButton.click();
        sleep(8000);
    }

    public void deleteTest(String name) {
        open("/app/testDefinition/");
        sleep(3000);
        SelenideElement td = null;
        String nameInTable = null;

        for (int i = 1; i < testList.size(); i++) {
            td = testList.get(i).find("td");
            nameInTable = td.getText();
            if (nameInTable.equals(name)) {
                td.click();
                sleep(5000);
                deleteTestButton.click();
                sleep(3000);
                deleteAcceptTestButton.click();
                sleep(3000);
                break;
            }
        }
    }

    public void setName(String name) {
        testName.append(name);
    }

    public void setDescription(String description) {
        testDescription.append(description);
    }

    public void setConcurrentProbes(String concurrentProbes) {
        testConcurrent.append(concurrentProbes);
    }

    public void setIterations(String iterations) {
        testIterations.append(iterations);
    }

    public void addRunOptions(String runOptions) {
        if (testOptions.getValue().equals(""))
            testOptions.append(runOptions);
        else
            testOptions.append(", " + runOptions);
    }

    public void setServiceUrl(String serviceUrl) {
        testUrl.append(serviceUrl);
    }
}
