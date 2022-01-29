package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_KeybordActions extends TestBase {


    @Test
    public void test() throws InterruptedException {

//1- Bir Class olusturalim KeyboardActions1
//2- https://www.amazon.com sayfasina gidelim
        driver.get("https://amazon.com");
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      //aramaKutusu.sendKeys("Samsung S3 mini"+ Keys.ENTER);
      //Thread.sleep(2000);

      //aramaKutusu.clear();
        aramaKutusu.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).
                sendKeys("s").
                keyUp(Keys.SHIFT).
                sendKeys("amsung ").
                keyDown(Keys.SHIFT).
                sendKeys("a").
                keyUp(Keys.SHIFT).
                sendKeys("71").
                sendKeys(Keys.ENTER).
                perform();

//3- Arama kutusuna actions method’larine kullanarak samsung A71 yazdirin ve Enter’a basarak arama yaptirin
//4- aramanin gerceklestigini test edin




    }
}
