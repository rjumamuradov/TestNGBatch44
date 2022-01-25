package tests.day09_dependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class C02_SoftAssertion {
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

    //1. “http://zero.webappsecurity.com/” Adresine gidin

    driver.get("http://zero.webappsecurity.com");
// 2. Sign in butonuna basin
    driver.findElement(By.xpath("//button[@id='signin_button']")).click();
    //  3. Login kutusuna “username” yazin
    WebElement login =driver.findElement(By.xpath("//input[@type='text']"));
    login.sendKeys("username");

    // 4. Password kutusuna “password” yazin
    WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("password");
    //5. Sign in tusuna basin
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.navigate().back();


    // 6. Pay Bills sayfasina gidin
    driver.findElement(By.xpath("//a[@id='online-banking']")).click();
    driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();

    //7. “Purchase Foreign Currency” tusuna basin
    driver.findElement(By.xpath("(//li[@class='ui-state-default ui-corner-top'])[2]")).click();
    //8. “Currency” drop down menusunden Eurozone’u secin
    WebElement currency = driver.findElement(By.xpath("//select[@id='pc_currency']"));
    Select select =new Select(currency) ;
    select.selectByValue("EUR");

    SoftAssert softAssert=new SoftAssert();
    String actualSecim=select.getFirstSelectedOption().getText();
    String expectedSecim="Eurozone (euro)";
    softAssert.assertEquals(actualSecim,expectedSecim,"dropdown dogru secilemedi");



    List<WebElement> opyionalList=select.getOptions();


    String actualOptionalList="";
    for (WebElement each:opyionalList
         ) {

        actualOptionalList+="\""+  each.getText()+ "\"";


    }

    softAssert.assertAll();;





}
}
