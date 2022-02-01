package tests.day14;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;

public class C04_Screenshot extends TestBase {


    @Test
    public void test(){

        driver.get("https://www.bjk.com.tr");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File tumSayfaSS=new File("C:\\Users\\rozym\\IdeaProjects\\com.TestNGBatch44\\src");
        tumSayfaSS=screenshot.getScreenshotAs(OutputType.FILE);



    }
}
