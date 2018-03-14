package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Martin Keprta on 3/3/2018.
 */

public class TestDetailsPage extends Page {
    //Basic test information
    private SelenideElement name = $(By.name("name"));
    private SelenideElement info = $(By.name("info"));
    private SelenideElement concurrentUsers = $(By.name("concurrentUsers"));
    private SelenideElement loopCount = $(By.name("loopCount"));
    private SelenideElement runOptions = $(By.name("runOptions"));
    private SelenideElement checkBox = $(By.xpath(".//div[@class='checkbox']/label"));
    private SelenideElement serviceUrl = $(By.name("serviceUrl"));
    //Test script
    private SelenideElement upload = $(By.xpath(".//input[@type='file']"));
    private SelenideElement codeEditor = $(By.id("open-text-editor"));
    //Profiles
    private List<SelenideElement> profiles =$$(By.xpath(".//div[@ng-repeat='profile in vm.testProfiles']"));
    private String profileBrowser ="browser";
    private String profileLocation="location";
    private String profileNetwork="network";
    private String profileFirewall="firewall";
    private String profileMedia="media";
    //Buttons
    private SelenideElement deleteButton = $(By.xpath(".//a[@ng-click='vm.delete()']"));
    private SelenideElement exportButton = $(By.xpath(".//a[@ng-click='vm.export()']"));
    private SelenideElement duplicateButton = $(By.xpath(".//a[@ng-click='vm.copyTest()']"));
    //Delete test form
    private SelenideElement confirmDeleteButton = $(By.xpath(".//div[@class='sa-confirm-button-container']"));

    public TestDetailsPage(){
        sleep(3000);

        //Basic elements which must be present!
        requiredElements.add(name);
        requiredElements.add(info);
        requiredElements.add(concurrentUsers);
        requiredElements.add(loopCount);
        requiredElements.add(runOptions);
        requiredElements.add(checkBox);
        requiredElements.add(serviceUrl);

        //checkElements();
    }













}
