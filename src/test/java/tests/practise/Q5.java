package tests.practise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Q5 extends TestBase {
    @Test
    public void test() throws InterruptedException {

        ////              2.soru:Turkce
        //        //     url'ye gidin :http://demo.automationtesting.in/Alerts.html
                    driver.get("http://demo.automationtesting.in/Alerts.html");
        //        //     "Alert with OK"yi tıklayın ve 'click the button to display a confirm box' i tıklayın:'
                    driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
                    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

                        Thread.sleep(1000);


        //        //     Uyarıyı kabul et(I am an alert box!) ve uyarıyı konsolda yazdır
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();
        //        //      "Alert with OK & Cancel" ı tıklayın ve 'click the button to display a confirm box' i tıklayın
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Thread.sleep(1000);

        //        //     Uyarıyı iptal et (Press a Button !)
          driver.switchTo().alert().dismiss();
          //        //     "Alert with Textbox" ı tıklayın ve 'click the button to demonstrate the prompt box' tıklayın'
          driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
          driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
          //        //     ve ardından sendKeys 'TechProEducation' (Lütfen adınızı girin)
                          driver.switchTo().alert().sendKeys("TechProEducation");
                          Thread.sleep(1000);
                          driver.switchTo().alert().accept();
          //        //     sonunda "Hello TechproEducation How are you today" mesajını konsola yazdır (edited)

          System.out.println("driver.findElement(By.xpath(\"//p[@id='demo1']\")).getText() = " + driver.findElement(By.xpath("//p[@id='demo1']")).getText());
          Assert.assertTrue( driver.findElement(By.xpath("//p[@id='demo1']")).isDisplayed());



    }
}
