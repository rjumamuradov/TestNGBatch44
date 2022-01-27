package tests.day09_dependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Youtube {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));





    }
    @Test
    public void test1(){

        driver.get("https://www.youtube.com");
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@id='search'] "));   //div[@class='ytd-searchbox-spt']
        aramakutusu.sendKeys("tupac changes");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();


        //WebElement tupac=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']"));
        //tupac.click();

    }

    @Test
    public void test2(){


    }
    @Test
    public void test3(){


    }

    @AfterClass

    public void after() throws InterruptedException {
        Thread.sleep(2000);

        //driver.close();

    }

}
