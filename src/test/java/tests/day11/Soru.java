package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class Soru extends TestBase {




    @Test
    public void test(){

        //      ...Exercise6...
        //  1. Amazon.com'a gidelim.
        driver.get("https://www.amazon.com");

        //  2. DropDown üzerinde Books secelim.(All yazan yerde)
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Books");

        //     kategorilerin hepsini konsola yazdiralim
        List<WebElement> liste=select.getOptions();

        liste.stream().forEach(t-> System.out.println (t.getText()));

        //  3. Arama kutusuna Les Miserables yazalım ve arama yapalim.

        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Les Miserables"+ Keys.ENTER);


        //  4. Sonuc sayisini ekrana yazdiralim.
        WebElement sonuc= driver.findElement(By.xpath("(//span[@dir='auto'])[1]"));
        System.out.println("sonuc.getText() = " + sonuc.getText());

        //  5. Sonucların Les Miserables i icerdigini assert edelim

        Assert.assertFalse(sonuc.getText().contains("Les Miserables")," sefiller icermiyor");




    }


}
