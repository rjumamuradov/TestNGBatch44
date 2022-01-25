package tests.day09_dependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;
import static org.testng.TestRunner.PriorityWeight.priority;


public class C01_DependsOnMethods {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }
    @Test
    public void logoTest(){
        driver.get("https://amazon.com");
        WebElement logoElement = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(logoElement.isDisplayed());




    }
    @Test(dependsOnMethods = "logoTest")
    public void aramaTest(){
WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
aramakutusu.sendKeys("Nutella"+ Keys.ENTER);


    }

    @Test(dependsOnMethods="aramaTest")
    public void fiyatTest(){

      driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();
        WebElement urunFiyati= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
    String actualTitle= driver.getTitle();
    String expectedTitle= "Nutella";
    Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


}
