package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_KeyboardActions extends TestBase {



    @Test
    public void test(){

        //1- Bir Class olusturalim KeyboardActions2
        //2- https://html.com/tags/iframe/ sayfasina gidelim
        //3- video’yu gorecek kadar asagi inin
        //4- videoyu izlemek icin Play tusuna basin
        //5- videoyu calistirdiginizi test edin

        driver.get("https://html.com/tags/iframe");


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_UP).perform();

        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='lazy-loaded']"));

        driver.switchTo().frame(iframeElement);

        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
        WebElement pauseButton=driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
        Assert.assertTrue(pauseButton.isEnabled(), "Video is not working. TEST FAİLED");


    }


}
