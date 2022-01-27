package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_BasivAuthentication {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void test() {


        //1- Bir class olusturun : BasicAuthentication
        //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        //driver.get("https://the-internet.herokuapp.com/basic_auth");


        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin


        //    Html komutu : https://username:password@URL
        //    Username     : admin
        //    password      : admin


       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //4- Basarili sekilde sayfaya girildigini dogrulayin
        WebElement congratMesajElementi=driver.findElement(By.tagName("p"));
        Assert.assertTrue(congratMesajElementi.isDisplayed());






    }


}
