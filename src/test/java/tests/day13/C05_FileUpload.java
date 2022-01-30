package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_FileUpload extends TestBase {


    @Test
    public void test() throws InterruptedException {
//Tests packagenin altina bir class oluşturun : C05_UploadFile
//https://the-internet.herokuapp.com/upload adresine gidelim

        driver.get("https://the-internet.herokuapp.com/upload");

//chooseFile butonuna basalim





        WebElement uploadButton=driver.findElement(By.id("file-upload"));
        //Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\Deneme\\Se.xlsx";
        uploadButton.sendKeys(dosyaYolu);
        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();



        Thread.sleep(5000);
//“File Uploaded!” textinin goruntulendigini test edelim

        WebElement fileUploadYazisi= driver.findElement(By.tagName("h3"));
        String expectedYazi="File Uploaded!";
        Assert.assertTrue(fileUploadYazisi.isDisplayed());

    }
}
