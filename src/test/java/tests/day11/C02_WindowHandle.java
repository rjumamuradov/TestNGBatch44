package tests.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class C02_WindowHandle {
WebDriver driver;
@BeforeClass
    public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


}



@Test
    public void test(){
    //● Tests package’inda yeni bir class olusturun: WindowHandle2
    //● https://the-internet.herokuapp.com/windows adresine gidin.


    driver.get("https://the-internet.herokuapp.com/windows");

    //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    WebElement sayfadakiYazi=driver.findElement(By.tagName("h3"));
    String expectedYazi="Opening a new window";


    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(sayfadakiYazi.getText(),expectedYazi,"sayfadaki yazi o degil");


    //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.

    softAssert.assertEquals(driver.getTitle(),"The Internet","sayfa basligi internet degil");
    //● Click Here butonuna basın.
    String windowHandelDeger1=driver.getWindowHandle();
    driver.findElement(By.xpath("//a[text()='Click Here']")).click();


    //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.


    Set<String> handleDegerleriSeti=driver.getWindowHandles();

    String windowHandleDegeri2="";


    for (String eactHandle : handleDegerleriSeti
         ) {
        if (!(eactHandle.equals(windowHandelDeger1))){
            windowHandleDegeri2=eactHandle;

        }
        System.out.println("windowHandleDegeri2 = " + windowHandleDegeri2);

    }
    //● Sayfadaki textin “New Window” olduğunu doğrulayın.
    driver.switchTo().window(windowHandleDegeri2);

    //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

    softAssert.assertEquals(driver.getTitle(),"The Internet","the intr icermiyo");


    WebElement ikinciSayfaYaziElement = driver.findElement(By.tagName("h3"));




}



@AfterClass
    public void tearDown() {

   // driver.close();
}
}
