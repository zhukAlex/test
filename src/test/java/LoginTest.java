import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import page.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.MyTestResultListener;

import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Martin Keprta on 3/4/2018.
 */
@Listeners({ MyTestResultListener.class })
public class LoginTest {
    LoginPage loginPage = new LoginPage();

    @Test
    @Description("Login into application")
    public void loginIntoApplication() {
        loginPage.openPage();
        loginPage.loginWithForm();
        //loginPage.checkIfUserIsLogged();
        sleep(2000);
    }
}
