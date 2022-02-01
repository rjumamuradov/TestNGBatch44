package tests.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_ScreenShotWebElement extends TestBase {


    @Test
    public void test() throws IOException {

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucYazisiElementi= driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        String sonucYazisi=sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisi.contains("Nutella"));
        File file = new File("target/screenshot/webelement.jpeg");

        File geciciResim=sonucYazisiElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,file);


    }
}
