package page;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.getElement;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class LoginPage {
    // Form authentication
    private By formEmail = By.xpath(".//input[@type='email']");

    private By formPass = By.xpath(".//input[@type='password']");

    private By formSubmit = By.xpath(".//button[@type='submit']");

    public LoginPage() {
        Configuration.headless = false;
        Configuration.browser="chrome";
        Configuration.baseUrl="https://app.testrtc.com";
        Configuration.timeout = 3000;
    }

    public void openPage() {
        open("/login");
    }

    public void setEmail(String email) {
        getElement(formEmail).append(email);
    }

    public void setPassword(String password) {
        getElement(formPass).append(password);
    }

    public void clickSubmit() {
        getElement(formSubmit).click();
    }

    @Step
    public void loginWithForm() {
        sleep(2000);
        setEmail("testrtctest@mailinator.com");
        setPassword("testrtctest@mailinator.com");
        sleep(1000);
        clickSubmit();
        sleep(2000);
    }
}
