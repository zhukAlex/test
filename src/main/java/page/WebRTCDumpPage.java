package page;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class WebRTCDumpPage extends Page {

    public WebRTCDumpPage(){

    }

    @Step
    public void openPage(){
        open("/app/analyzeDump/");
    }
}
