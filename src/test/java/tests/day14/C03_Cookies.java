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

        Assert.assertTrue(cookieSet.size() > 5, "buyuk degil");

        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin

        Cookie cookie = driver.manage().getCookieNamed("i18n-prefs");
        System.out.println("cookie = " + cookie);

        Assert.assertTrue(driver.manage().getCookieNamed("i18n-prefs").getValue().equals("USD"));
        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie cookieBest = new Cookie("en sevdigim cookie", "cikolatali");
        driver.manage().addCookie(cookieBest);
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        Set<Cookie> set2=driver.manage().getCookies();
        int sayac1 = 1;
        for (Cookie each1 : set2) {

            System.out.println("my cookie is = " + each1);
            sayac1++;

        }
        //7- ismi skin olan cookie’yi silin ve silindigini test edin
            driver.manage().deleteCookieNamed("skin");
        //8- tum cookie’leri silin ve silindigini test edin

    Assert.assertFalse(set2.contains("skin"),"skin isimli cookie silinemedi");
    driver.manage().deleteAllCookies();
        Set<Cookie> set4=driver.manage().getCookies();
    Assert.assertTrue(set4.size()==0,"silinemedi hala var");
    }

}
