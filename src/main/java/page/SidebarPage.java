package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * Created by Martin Keprta on 3/4/2018.
 */
public class SidebarPage extends Page {

    private SelenideElement menuItemHome = $(By.xpath(".//a[@href='/app/main/']"));
    private SelenideElement menuItemTests = $(By.xpath(".//a[@href='/app/testDefinition/']"));
    private SelenideElement menuItemTestRunHistory = $(By.xpath(".//a[@href='/app/testRun/']"));
    private SelenideElement menuItemMonitoring = $(By.xpath(".//a[@href='/app/monitoring']"));
    private SelenideElement menuItemMonitorRunHistory = $(By.xpath(".//a[@href='/app/monitor-run/']"));
    private SelenideElement menuItemAnalyzeWebRTCDump = $(By.xpath(".//a[@href='/app/analyzeDump/']"));
    private SelenideElement menuItemHelp = $(By.xpath(".//a[@href='http://testrtc.com/manual']"));

    private SelenideElement buttonStartChat = $(By.xpath(".//div[@id='ue_launcherAvatar']"));
    private SelenideElement buttonCloseChat = $(By.xpath(".//div[@id='ue_closeMessenger']"));
    private SelenideElement inputChat = $(By.xpath(".//textarea[@rows='1']"));
    private SelenideElement buttonEmojiChat = $(By.xpath(".//div[@id='ue_messengerEmoji']"));

    private String [] urls = new String[] {
            "https://app.testrtc.com/app/main/",
            "https://app.testrtc.com/app/testDefinition/",
            "https://app.testrtc.com/app/testRun/",
            "https://app.testrtc.com/app/monitor-run/",
            "https://app.testrtc.com/app/analyzeDump/",
            "http://testrtc.com/manual"
    };

    public SidebarPage(){
        requiredElements.add(menuItemHome);
        requiredElements.add(menuItemTests);
        requiredElements.add(menuItemTestRunHistory);
        requiredElements.add(menuItemMonitorRunHistory);
        requiredElements.add(menuItemAnalyzeWebRTCDump);
        //  requiredElements.add(menuItemHelp);

        checkElements();
    }

    @Step
    public void openPage(String url) {
        sleep(2000);
    }

    @Step
    public void clickMenuItemsAtUrl(String url) {
        for (int i = 0; i < requiredElements.size(); i++) {
            open(url);
            sleep(2000);
            requiredElements.get(i).click();
            sleep(2000);
            Assert.assertEquals(urls[i], url());
        }
    }

    @Step
    public void clickChat() {
        buttonStartChat.click();
        sleep(2000);
        buttonEmojiChat.click();
        sleep(2000);
        inputChat.setValue("test");
        sleep(2000);
        buttonCloseChat.click();
        sleep(2000);
    }

}
