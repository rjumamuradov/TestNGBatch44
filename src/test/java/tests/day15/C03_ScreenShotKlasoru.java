package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class C03_ScreenShotKlasoru extends TestBase {
    WebElement aramaKutusu;

@Test
    public void test() throws IOException {

    driver.get("https://www.amazon.com");
  aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    aramaKutusu.sendKeys("The Flash" + Keys.ENTER);
    allPageScreenShots();

}
@Test
    public void test1() throws IOException {
   aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
   aramaKutusu.clear();
    aramaKutusu.sendKeys("Green Arrow" + Keys.ENTER);
    allPageScreenShots();
}
@Test
    public void test3() throws IOException {

        driver.get("https://www.amazon.com");
   aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
   aramaKutusu.clear();
        aramaKutusu.sendKeys("Batman" + Keys.ENTER);
        allPageScreenShots();

    }

}
