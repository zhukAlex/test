import io.qameta.allure.Description;
import page.DashBoardPage;
import org.testng.annotations.Test;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class DashBoardTest {

    DashBoardPage dashBoardPage = new DashBoardPage();

    @Test
    @Description("Opening base page")
    public void dashBoard(){
        dashBoardPage.openPage();
    }
}
