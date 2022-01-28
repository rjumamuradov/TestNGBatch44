package tests.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import static java.awt.SystemColor.window;

public class C01_Window_Handle {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com");
        String windowHandleDeger1=driver.getWindowHandle();
        System.out.println("olk sayfaniin handle degeri : "+driver.getWindowHandle());

     driver.switchTo().newWindow(WindowType.WINDOW);  //yeni bir pencere acilir
       // driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.bestbuy.com");
        String windowHandleDeger2=driver.getWindowHandle();

        System.out.println();

        //System.out.println("hadles:     ---->"+driver.getWindowHandles());

        Set<String> handeDegerleriSet=driver.getWindowHandles();
        System.out.println("handeDegerleriSet = " + handeDegerleriSet);

        Thread.sleep(3000);


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");

        driver.switchTo().window(windowHandleDeger1);

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);

        driver.switchTo().window(windowHandleDeger2);


        String windowHandleDeger3="";
        for (String each:handeDegerleriSet
             ) {

            if (!(each.equals(windowHandleDeger1)||each.equals(windowHandleDeger2))){



                windowHandleDeger3+=each;

            }
            System.out.println("windowHandleDeger3 = " + windowHandleDeger3);

        }




    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
