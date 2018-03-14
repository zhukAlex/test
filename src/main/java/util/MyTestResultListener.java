package util;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MyTestResultListener extends TestListenerAdapter {


    @Attachment(value = "PNG Attachment}", type = "image/png")
    public byte[] createAttachment() {

        return captureScreenShot();
    }

    private byte[] captureScreenShot() {
        BufferedImage image = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(WebDriverRunner.getWebDriver()).getImage();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] imageInByte = null;
        try {
            ImageIO.write(image, "png", baos);
            baos.flush();
            imageInByte = baos.toByteArray();
            baos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return imageInByte;
    }



    @Override
    public void onTestFailure(ITestResult result) {
        createAttachment();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        createAttachment();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        createAttachment();
    }
}