package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_Facebookkayit extends TestBase {
    ///Yeni bir class olusturalim: D15_MouseActions4


    @Test
    public void test(){
        //1- https://www.facebook.com adresine gidelim

        driver.get("https://facebook.com");

        //2- Yeni hesap olustur butonuna basalim
      driver.
              findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).
              click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        
        //4- Kaydol tusuna basalim
    }

    //

}
