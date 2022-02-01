package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class TestBase {

    protected WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }



@AfterClass
    public void tearDown() throws InterruptedException {
       Thread.sleep(1700);

        //driver.quit();
    }

    public void allPageScreenShots() throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        String date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());


        File file = new File("target/screenShot/tumSayfa_" +date+".jpg");
        File dummy=screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(dummy, file);

    }





}
