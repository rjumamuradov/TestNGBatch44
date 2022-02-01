package tests.day14;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_Faker extends TestBase {


@Test
    public void test() throws InterruptedException {
    driver.get("https://www.facebook.com");

    Faker faker = new Faker();
    //driver.findElement(By.xpath("//button[text()='Allow All Cookies']")).click();
    //2- Yeni hesap olustur butonuna basalim
    driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

    //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
    WebElement isimKutusu= driver.findElement(By.xpath("//input[@name='firstname']"));


    Actions actions=new Actions(driver);
        String fakeEmail=faker.internet().emailAddress();

    actions.click(isimKutusu).sendKeys(faker.name().name())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().lastName())
            .sendKeys(Keys.TAB)
            .sendKeys(fakeEmail)
            .sendKeys(Keys.TAB)
            .sendKeys(fakeEmail)
            .sendKeys(Keys.TAB)
            .sendKeys(faker.internet().password())
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys("30")
            .sendKeys(Keys.TAB)
            .sendKeys("Aug")
            .sendKeys(Keys.TAB)
            .sendKeys("1993")
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.ARROW_DOWN)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.ENTER).perform();


    WebElement erkekSecimElementi=driver.findElement(By.xpath("//input[@value='2']"));
    WebElement kadinSecimElementi=driver.findElement(By.xpath("//input[@value='1']"));

    Assert.assertTrue(erkekSecimElementi.isSelected());
    Assert.assertFalse(kadinSecimElementi.isSelected());
    Thread.sleep(2000);
}

}
