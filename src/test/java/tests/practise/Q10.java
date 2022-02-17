package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;
public class Q10 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        ////1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");
        //    //2..“Our Products” butonuna basin
        WebElement iframe=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//a[@href='products.html']")).click();
        //    //3.“Cameras product”i tiklayin
        driver.findElement(By.xpath("(//p[@class='sub-heading'])[2]")).click();
        //    //4.Popup mesajini yazdirin
        Thread.sleep(3000);
        String popUp=driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
        System.out.println(popUp);
        //    //5.“close” butonuna basin
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
        //    //6."WebdriverUniversity.com (IFrame)" linkini tiklayin
        driver.switchTo().parentFrame();
        //    //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin
        driver.findElement(By.xpath("(//a[@class='navbar-brand'])[1]")).click();
    }
}