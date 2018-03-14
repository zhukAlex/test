package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class DashBoardPage extends Page{

    private SelenideElement logoutButton = $(By.xpath(".//a[@ng-click='vm.logout()']"));
    private SelenideElement supportButton = $(By.xpath(".//a[@ui-sref='app.freshdesk']"));

    public DashBoardPage(){
        requiredElements.add(logoutButton);
        requiredElements.add(supportButton);
    }

    public void openPage(){
        open("/app/main/");
        sleep(5000);
        checkElements();
    }


}
