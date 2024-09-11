package utilities.screenShotUtility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import globalResources.GlobalStatic;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void captureScreenshot(String screenshotName) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) GlobalStatic.driver;

            File screenshotSource = screenshot.getScreenshotAs(OutputType.FILE);

            File screenshotDestination = new File("C:/TestsRunEvidences/" + GlobalStatic.Testcase_ID + "/" + screenshotName + ".png");

            FileUtils.copyFile(screenshotSource, screenshotDestination);


        } catch (IOException e) {
            System.out.println("Something wrong with source & destination of screenshot location");

        }
    }
}
