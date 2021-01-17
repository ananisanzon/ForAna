import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ElementScreenshot extends HomePage{
        private static WebDriver driver;

         public  ElementScreenshot() {
        driver = DriverSingleton.getDriverInstance();
    }

        public void elementScreenshotTest() {
            takeElementScreenshot(driver.findElement(By.id("myButton")));
        }

        private static void takeElementScreenshot(WebElement element){
            File screenShotFile = element.getScreenshotAs(OutputType.FILE); // take the screenshot
            try {
                FileUtils.copyFile(screenShotFile, new File("element-screenshot.png")); // save screenshot to disk
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
