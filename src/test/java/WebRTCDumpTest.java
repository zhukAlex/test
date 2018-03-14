import io.qameta.allure.Description;
import page.WebRTCDumpPage;
import org.testng.annotations.Test;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class WebRTCDumpTest  {

    WebRTCDumpPage webRTCDumpPage=new WebRTCDumpPage();

    @Test
    @Description("Opening Web RTC Dump Page")
    public void webRTCDump(){
        webRTCDumpPage.openPage();
    }
}
