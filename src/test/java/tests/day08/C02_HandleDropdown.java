package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C02_HandleDropdown {


    static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }


    @Test
    public void testHandleDropdown() throws InterruptedException {
        driver.get("https://www.amazon.com");
WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));


        Select select = new Select(ddm);

        select.selectByIndex(3);

        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(3000);

        select.selectByVisibleText("Deals");
        Thread.sleep(3000);
        select.selectByValue("search-alias=kitchen-intl-ship");

List<WebElement> liste=select.getOptions();
liste.stream().forEach(t-> System.out.println("t = " + t.getText()));
    for(WebElement each:liste){
            System.out.println(each.getText());
        }
    }
    @AfterMethod
    public static void taerdown() {
   //driver.close();

    }
}
