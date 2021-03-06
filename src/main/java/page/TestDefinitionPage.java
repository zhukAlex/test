package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class TestDefinitionPage extends Page{

    //Not used!
    private SelenideElement importButton = $(By.xpath(".//a[@ng-click='vm.clickUpload()']"));
    //Create new test button
    private SelenideElement createNewTestButton = $(By.xpath(".//button[@ng-click='vm.testNew()']"));
    //Hidden element for file upload
    private SelenideElement uploadElement = $(By.xpath(".//input[@id='upload']"));
    //TestName.This is static value.If changed test will fail
    private SelenideElement successNotification=$(By.xpath(".//div[@class='success']"));
    private SelenideElement failureNotification=$(By.xpath(".//div[@class='error']"));
    //TestList
    private List<SelenideElement> testList=$$(By.xpath(".//table[@class='table grid-table']//tr"));
    private List<SelenideElement> sortList=$$(By.xpath(".//table[@class='table grid-table']//th"));
    //Search details
    private SelenideElement searchButton = $(By.xpath(".//button[@class='btn btn-sm btn-default']"));
    private SelenideElement searchInput = $(By.xpath(".//input[@ng-model='search.term']"));
    //Change page
    private SelenideElement prevPage = $(By.xpath(".//a[@ng-click='onPageChange(state.currentPage - 1)']"));
    private SelenideElement nextPage = $(By.xpath(".//a[@ng-click='onPageChange(state.currentPage + 1)']"));


    public TestDefinitionPage(){

    }

    @Step
    public void openPage(){
        //Open page based on relative url
        open("/app/testDefinition/");
        //This conditions checks if test data from previous run were deleted
        //newTestCase.shouldNot(Condition.exist);
        sleep(2000);
    }

    @Step
    public void importTest(File file,Boolean valid){
        //Upload test
        uploadElement.uploadFile(file);

        if(valid){
            successNotification.should(Condition.appear);
        }else {
            failureNotification.should(Condition.appear);
        }


    }

    @Step
    public void createTest() {

        createNewTestButton.click();

        sleep(10000);
        Assert.assertEquals(url(), Configuration.baseUrl+"/app/new-testProperties/");

    }

    @Step
    public void clickSortListAt(int i) {
        sortList.get(i).click();
    }

    @Step
    public void sortByName() {
        clickSortListAt(0);
        sleep(2000);
        clickSortListAt(0);
        sleep(2000);
    }

    @Step
    public void sortByRunCount() {
        clickSortListAt(2);
        sleep(2000);
        clickSortListAt(2);
        sleep(2000);
    }

    @Step
    public void sortByLastRun() {
        clickSortListAt(3);
        sleep(2000);
        clickSortListAt(3);
        sleep(2000);
    }

    @Step
    public void searchByNameOrDescription(String string) {
        searchInput.setValue(string);
        sleep(2000);
        searchButton.click();
        sleep(2000);
    }

    @Step
    public void clickNextPage() {
        nextPage.click();
    }

    @Step
    public void clickPrevPage() {
        prevPage.click();
    }

    @Step
    public void selectPage() {
        clickNextPage();
        sleep(2000);
        clickPrevPage();
        sleep(2000);
    }
}
