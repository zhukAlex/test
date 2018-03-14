package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Martin Keprta on 3/3/2018.
 */
public class Page {
    private SelenideElement pageHeading = $(By.xpath(".//h2"));

    List<SelenideElement> requiredElements = new ArrayList<>();


    public void checkElements() {

        requiredElements.forEach((temp) -> {
            checkElementVisible(temp);
        });

    }

    @Step
    public void checkElementVisible(SelenideElement element){
        element.should(Condition.visible);
    }
}
