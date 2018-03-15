package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class DashBoardPage extends Page{
    private By logoutButton = By.xpath(".//a[@ng-click='vm.logout()']");
    private By supportButton = By.xpath(".//a[@ui-sref='app.freshdesk']");

    private By loginTitle = By.xpath(".//strong[@class='font-bold ng-binding']");

    public DashBoardPage() {

    }

    public void clickLogout() {
        getElement(logoutButton).click();
    }

    public void clickSupport() {
        getElement(supportButton).click();
    }

    public String getLoginTitle() {
        return getElement(loginTitle).getText();
    }

    public void openPage() {
        open("/app/main/");
        sleep(5000);
        checkElements();
    }
}