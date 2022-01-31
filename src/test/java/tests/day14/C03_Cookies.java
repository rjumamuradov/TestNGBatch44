package tests.day14;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {


    @Test
    public void test() {
        //Yeni bir class olusturun : cookiesAutomation
        //1- Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2- tum cookie’leri listeleyin
        Set<Cookie> cookieSet = driver.manage().getCookies();
        System.out.println("cookieSet = " + cookieSet);
        int sayac = 1;
        for (Cookie each : cookieSet) {

            System.out.println("cookie = " + each);
            sayac++;

        }

        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin

        Assert.assertTrue(cookieSet.size()>5,"buyuk degil");

        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin

        Cookie cookie =driver.manage().getCookieNamed("i18n-prefs");

        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin

        //7- ismi skin olan cookie’yi silin ve silindigini test edin

        //8- tum cookie’leri silin ve silindigini test edin

    }

}
