package page;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class WebRTCDumpPage extends Page {

    public WebRTCDumpPage(){

    }

    public void openPage(){
        open("/app/analyzeDump/");
    }
}
