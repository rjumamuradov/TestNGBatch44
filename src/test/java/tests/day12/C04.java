package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C04 extends TestBase {

    @Test
    public void test() {
        //Yeni bir class olusturalim: MouseActions2
        //1- https://demoqa.com/droppable adresine gidelim

        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement tasinacak = driver.findElement(By.xpath("//div[text()='Drag me']"));

        WebElement hedef = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(tasinacak,hedef).perform();

        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

        String actualDropYazisi=hedef.getText();
        String expectedYazi="Dropped!";
        Assert.assertEquals(actualDropYazisi,expectedYazi,"dropped yazi icermiyor");
    }
}
