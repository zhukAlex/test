import io.qameta.allure.Description;
import org.testng.Assert;
import page.DashBoardPage;
import page.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Martin Keprta on 3/4/2018.
 */
public class LoginTest {
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage;

    @BeforeClass
    public void setup() {
        loginPage.openPage();
    }

    @Test
    @Description("Login into application")
    public void loginIntoApplication() {
        loginPage.loginWithForm();
        dashBoardPage = new DashBoardPage();
        Assert.assertEquals("testrtctest@mailinator.com", dashBoardPage.getLoginTitle());
    }
}
