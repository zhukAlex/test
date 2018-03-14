package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Martin Keprta on 07.03.2018.
 */
public class MonitorHistoryPage {
    private SelenideElement selectButton = $(By.xpath(".//select[@ng-change='onFilterChange()']"));
    private List<SelenideElement> selectList = $$(By.xpath(".//select[@ng-change='onFilterChange()']//option"));
    private List<SelenideElement> testList = $$(By.xpath(".//table[@class='table grid-table']//th"));
    private SelenideElement searchInput = $(By.xpath(".//input[@ng-model='search.term']"));
    private SelenideElement searchButton = $(By.xpath(".//button[@class='btn btn-sm btn-default']"));


    public MonitorHistoryPage() {

    }

    public void openPage() {
        //Open page based on relative url
        open("/app/monitor-run/");
        //This conditions checks if test data from previous run were deleted
        //newTestCase.shouldNot(Condition.exist);
        sleep(3000);
    }

    public void sortByResult() {
        for (int i = 0; i < 6; i++) {
            selectButton.click();
            sleep(2000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    public void sortByMonitor() {
        for (int i = 6; i < selectList.size() - 4; i++) {
            selectButton.click();
            sleep(2000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    public void sortByDate() {
        for (int i = selectList.size() - 4; i < selectList.size(); i++) {
            selectButton.click();
            sleep(2000);
            selectList.get(i).click();
            sleep(3000);
        }
    }

    public void sortByFlag() {
        testList.get(0).click();
        sleep(2000);
        testList.get(0).click();
        sleep(2000);
    }

    public void sortByName() {
        testList.get(1).click();
        sleep(2000);
        testList.get(1).click();
        sleep(2000);
    }

    public void sortByRun() {
        testList.get(3).click();
        sleep(2000);
        testList.get(3).click();
        sleep(2000);
    }

    public void searchByMonitor(String monitor) {
        searchInput.setValue(monitor);
        sleep(2000);
        searchButton.click();
        sleep(2000);
    }
}
