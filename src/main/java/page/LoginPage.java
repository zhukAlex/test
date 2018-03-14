package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * Created by Martin Keprta on 2/25/2018.
 */
public class LoginPage {
    // Json for test
    private JsonUser jsonUser = new JsonUser();

    //Login buttons
    private SelenideElement loginButtonGoogle = $(By.xpath(".//button[@ng-click=\"vm.loginOauth('google')\"]"));
    private SelenideElement loginButtonFacebook = $(By.xpath(".//button[@ng-click=\"vm.loginOauth('facebook')\"]"));
    private SelenideElement loginButtonLinkedIn = $(By.xpath(".//button[@ng-click=\"vm.loginOauth('linkedin')\"]"));

    // Input authentification
    private SelenideElement password = $(By.xpath(".//input[@type='password']"));

    // Google authentification
    private SelenideElement emailGoogle = $(By.xpath(".//input[@type='email']"));
    private SelenideElement nextButtonEmailGoogle = $(By.xpath(".//div[@id='identifierNext']"));
    private SelenideElement nextButtonPasswordGoogle = $(By.xpath(".//div[@id='passwordNext']"));
    private SelenideElement errorGoogle = $(By.xpath(".//div[@class='dEOOab RxsGPe']"));

    // Facebook authentification
    private SelenideElement emailFacebook = $(By.xpath(".//input[@type='text']"));
    private SelenideElement nextButtonFacebook = $(By.xpath(".//button[@name='login']"));

    // LinkedIn authentification
    private SelenideElement emailLinkedIn = $(By.xpath(".//input[@type='text']"));
    private SelenideElement nextButtonLinkedIn = $(By.xpath(".//input[@name='authorize']"));

    // Form authentication
    private SelenideElement formEmail = $(By.xpath(".//input[@type='email']"));
    private SelenideElement fomrPass= $(By.xpath(".//input[@type='password']"));
    private SelenideElement formSubmit = $(By.xpath(".//button[@type='submit']"));

    public LoginPage(){

        Configuration.headless = true;
        Configuration.browser="chrome";
        Configuration.baseUrl="https://app.testrtc.com";
        Configuration.timeout = 3000;
    }

    @Step
    public void checkIfUserIsLogged(){
        // URL Should be : https://staging1.testrtc.com/app/main/
        Assert.assertEquals("https://app.testrtc.com/app/main/",url());
    }

    @Step
    public void openPage(){
        open("/login");
    }

    @Step
    public void loginWithForm(){
        formEmail.append("testrtctest@mailinator.com");
        fomrPass.append("testrtctest@mailinator.com");
        sleep(1000);
        formSubmit.click();
        sleep(2000);
        //testrtctest@mailinator.com


    }

    @Step
    public void loginWithGoogleSimple(){
        loginButtonGoogle.click();
        emailGoogle.append("keprta.martin@gmail.com");
        nextButtonEmailGoogle.click();

        password.append("Bratislava123");
        nextButtonPasswordGoogle.click();
        sleep(4000);
        open(Configuration.baseUrl);

    }
}
