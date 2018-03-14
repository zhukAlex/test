package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

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

    public SidebarPage(){
        requiredElements.add(menuItemAnalyzeWebRTCDump);
        //  requiredElements.add(menuItemHelp);
        requiredElements.add(menuItemHome);
        requiredElements.add(menuItemTests);
        //  requiredElements.add(menuItemMonitoring);
        requiredElements.add(menuItemAnalyzeWebRTCDump);
        requiredElements.add(menuItemMonitorRunHistory);
        requiredElements.add(menuItemTestRunHistory);

        checkElements();
    }

    public void openPage() {
        sleep(2000);
    }

    public void clickMenuAtHome() {
        for (int i = 0; i < requiredElements.size(); i++) {
            open("/app/main/");
            sleep(2000);
            try {
                requiredElements.get(i).click();
            } catch (ElementClickInterceptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickMenuAtTests() {
        for (int i = 0; i < requiredElements.size(); i++) {
            open("/app/testDefinition/");
            sleep(2000);
            try {
                requiredElements.get(i).click();
            } catch (ElementClickInterceptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickMenuAtTestRunHistory() {
        for (int i = 0; i < requiredElements.size(); i++) {
            open("/app/testRun/");
            sleep(2000);
            try {
                requiredElements.get(i).click();
            } catch (ElementClickInterceptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickMenuAtMonitorRunHistory() {
        for (int i = 0; i < requiredElements.size(); i++) {
            open("/app/monitor-run/");
            sleep(2000);
            try {
                requiredElements.get(i).click();
            } catch (ElementClickInterceptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickMenuAtAnalyze() {
        for (int i = 0; i < requiredElements.size(); i++) {
            open("/app/analyzeDump/");
            sleep(2000);
            try {
                requiredElements.get(i).click();
            } catch (ElementClickInterceptedException e) {
                e.printStackTrace();
            }
        }
    }

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
