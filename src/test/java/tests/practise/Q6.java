package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Q6 extends TestBase {

    @Test
    public void test(){
        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2. "Hover over Me First" kutusunun ustune gelin
        WebElement hover= driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        //3. "Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[@class='list-alert'])[1]")).click();


        //4. Popup mesajini yazdirin
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());

        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //6. "Click and hold" kutusuna basili tutun
        WebElement holdBox= driver.findElement(By.xpath("//div[@id='click-box']"));
       actions.clickAndHold(holdBox).perform();
        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println("holdBox.getText() = " + holdBox.getText());

        //8. "Double click me" butonunu cift tiklayin


    }
}
