package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
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
    private List<SelenideElement> sortList = $$(By.xpath(".//table[@class='table grid-table']//th"));
    private List<SelenideElement> selectList = $$(By.xpath(".//select[@ng-change='onFilterChange()']//option"));

    public TestRunPage(){

    }

    @Step
    public void openPage(){

        open("/app/testRun/");
        sleep(3000);
    }

    @Step
    public void openTestResults(){
        firstTestResult.should(Condition.exist);
        firstTestResult.click();
        sleep(3000);

    }

    @Step
    public void checkTestResultTitle(){
        testResultTitle.should(Condition.visible);
    }

    @Step
    public void checkOutComeRateTitle(){
        outComeRateTitle.should(Condition.visible);
    }

    @Step
    public void sortByFirstSelectTest() {
        for (int i = 0; i < 8; i++) {
            selectButton.click();
            sleep(1000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    @Step
    public void sortBySecondSelectTest() {
        for (int i = 8; i < selectList.size() - 4; i++) {
            selectButton.click();
            sleep(1000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    @Step
    public void sortByThirdSelectTest() {
        for (int i = selectList.size() - 4; i < selectList.size(); i++) {
            selectButton.click();
            sleep(1000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    @Step
    public void clickSortListAt(int i) {
        sortList.get(i).click();
    }

    @Step
    public void sortByManual() {
        clickSortListAt(0);
        sleep(2000);
        clickSortListAt(0);
        sleep(2000);
    }

    @Step
    public void sortByFlag() {
        clickSortListAt(1);
        sleep(2000);
        clickSortListAt(1);
        sleep(2000);
    }

    @Step
    public void sortByName() {
        clickSortListAt(2);
        sleep(2000);
        clickSortListAt(2);
        sleep(2000);
    }

    @Step
    public void sortByMachines() {
        clickSortListAt(3);
        sleep(2000);
        clickSortListAt(3);
        sleep(2000);
    }

    @Step
    public void sortByIterations() {
        clickSortListAt(4);
        sleep(2000);
        clickSortListAt(4);
        sleep(2000);
    }

    @Step
    public void sortByProbes() {
        clickSortListAt(5);
        sleep(2000);
        clickSortListAt(5);
        sleep(2000);
    }

    @Step
    public void sortByTime() {
        clickSortListAt(6);
        sleep(2000);
        clickSortListAt(6);
        sleep(2000);
    }

    @Step
    public void searchByName(String name) {
        searchInput.setValue(name);
        sleep(2000);
        searchButton.click();
        sleep(2000);
    }
}
