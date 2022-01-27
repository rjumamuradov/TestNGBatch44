package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C03_IFrame {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    //

    //● Bir class olusturun: IframeTest

    @Test
    public void test(){


        //   ● https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement istenenKelime= driver.findElement(By.tagName("h3"));


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(istenenKelime.isEnabled(),"istenenkelime gorunmuyor : iframe");
        System.out.println("istenenKelime = " + istenenKelime.getText());
        //   ● Bir metod olusturun: iframeTest
        //        ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda    yazdirin.
        //        ○ Text Box’a “Merhaba Dunya!” yazin.

        WebElement iFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
        WebElement textBox=driver.findElement(By.tagName("p"));
        textBox.clear();
        textBox.sendKeys("Merhaba Dunya");
        driver.switchTo().defaultContent();
        WebElement text= driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));


        //        ○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu     dogrulayin ve  konsolda yazdirin.
    }

}
