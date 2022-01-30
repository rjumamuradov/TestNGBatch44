package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase {


    @Test
    public void isExistTesti(){
        String dosyaYolu= System.getProperty("user.home")+ "\\Downloads\\download.png";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
    @Test
    public void downloadTesti() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[.='download.png']")).click();
        Thread.sleep(5000);
    }
}
