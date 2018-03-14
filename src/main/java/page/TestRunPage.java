package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class TestRunPage {

    private SelenideElement firstTestResult = $(By.xpath("(.//table[@class='table grid-table']//tr)[2]"));
    private SelenideElement testResultTitle = $(By.xpath(".//h5[text()='Test Result Overview']"));
    private SelenideElement outComeRateTitle = $(By.xpath(".//h3[text()='Outgoing and incoming video bitrate']"));
    private SelenideElement selectButton = $(By.xpath(".//select[@ng-change='onFilterChange()']"));
    private SelenideElement searchInput = $(By.xpath(".//input[@ng-model='search.term']"));
    private SelenideElement searchButton = $(By.xpath(".//button[@class='btn btn-sm btn-default']"));
    private List<SelenideElement> testList = $$(By.xpath(".//table[@class='table grid-table']//th"));
    private List<SelenideElement> selectList = $$(By.xpath(".//select[@ng-change='onFilterChange()']//option"));

    public TestRunPage(){

    }

    public void openPage(){

        open("/app/testRun/");
        sleep(3000);
    }

    public void openTestResults(){
        firstTestResult.should(Condition.exist);
        firstTestResult.click();
        sleep(3000);

    }

    public void checkTestResultTitle(){
        testResultTitle.should(Condition.visible);
    }

    public void checkOutComeRateTitle(){
        outComeRateTitle.should(Condition.visible);
    }

    public void sortByFirstSelectTest() {
        for (int i = 0; i < 8; i++) {
            selectButton.click();
            sleep(1000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    public void sortBySecondSelectTest() {
        for (int i = 8; i < selectList.size() - 4; i++) {
            selectButton.click();
            sleep(1000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    public void sortByThirdSelectTest() {
        for (int i = selectList.size() - 4; i < selectList.size(); i++) {
            selectButton.click();
            sleep(1000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    public void sortByManual() {
        testList.get(0).click();
        sleep(2000);
        testList.get(0).click();
        sleep(2000);
    }

    public void sortByFlag() {
        testList.get(1).click();
        sleep(2000);
        testList.get(1).click();
        sleep(2000);
    }

    public void sortByName() {
        testList.get(2).click();
        sleep(2000);
        testList.get(2).click();
        sleep(2000);
    }

    public void sortByMachines() {
        testList.get(3).click();
        sleep(2000);
        testList.get(3).click();
        sleep(2000);
    }

    public void sortByIterations() {
        testList.get(4).click();
        sleep(2000);
        testList.get(4).click();
        sleep(2000);
    }

    public void sortByProbes() {
        testList.get(5).click();
        sleep(2000);
        testList.get(5).click();
        sleep(2000);
    }

    public void sortByTime() {
        testList.get(6).click();
        sleep(2000);
        testList.get(6).click();
        sleep(2000);
    }

    public void searchByName(String name) {
        searchInput.setValue(name);
        sleep(2000);
        searchButton.click();
        sleep(2000);
    }
}
