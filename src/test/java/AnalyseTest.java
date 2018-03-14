import page.AnalysePage;
import org.testng.annotations.Test;

/**
 * Created by Martin Keprta on 3/4/2018.
 */
public class AnalyseTest {

    AnalysePage analysePage = new AnalysePage();

    @Test
    public void analyseForm(){
        analysePage.openPage();
        analysePage.clickOnImage();
        analysePage.checkForm();
        analysePage.checkUrl();
    }
}
