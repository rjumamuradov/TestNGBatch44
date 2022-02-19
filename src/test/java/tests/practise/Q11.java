package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class Q11 extends TestBase {


    @Test
    public void test(){

        //1."http://webdriveruniversity.com/" adresine gidin

        driver.get("http://webdriveruniversity.com/");
        String handle1=driver.getWindowHandle();

        //2."Login Portal" a kadar asagi inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //3."Login Portal" a tiklayin

        WebElement loginButton=driver.findElement(By.xpath("//div[@class='section-title']"));
        loginButton.click();
        //4.Diger window'a gecin
        Set<String> handles=driver.getWindowHandles();
        String handle2="";
        for (String w : handles){
            if (w!=handle1){
                handle2=w;
            }
        }
        driver.switchTo().window(handle2);

        //5."username" ve "password" kutularina deger yazdirin
        driver.findElement(By.id("text")).sendKeys("Ozzy");

        //6."login" butonuna basin

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin

        //8.Ok diyerek Popup'i kapatin
        //9.Ilk sayfaya geri donun
        //10.Ilk sayfaya donuldugunu test edin
    }
}
