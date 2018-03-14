package page;


import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Martin Keprta on 3/4/2018.
 */
public class AnalysePage {

    private SelenideElement analyseServiceImage = $(By.xpath(".//img[@src='assets/images/analyze-banner.png']"));
    private SelenideElement analyseServiceForm = $(By.xpath(".//form[@name='form']"));


    public AnalysePage(){

    }
    @Step
    public void openPage(){
        open(Configuration.baseUrl+"/login");
    }

    @Step
    public void clickOnImage(){
        analyseServiceImage.click();

    }

    @Step
    public void checkForm(){

        analyseServiceForm.should(Condition.visible);
    }

    @Step
    public void checkUrl(){
        Assert.assertEquals(Configuration.baseUrl+"/analyze", WebDriverRunner.getWebDriver().getCurrentUrl());
    }


}
