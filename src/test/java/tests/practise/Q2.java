package tests.practise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;
import static org.testng.TestRunner.PriorityWeight.priority;

public class Q2  extends TestBase{

    ///*
    //birbirine bagimli testler olusturun..
    //.beforClass olusturup setUp ayarlarini yapin..
    //  birbirine bagimli testler olusturarak;
    //      ilk once facebook a gidin
    //      sonra facebook a bagimli olarak google a gidin,
    //      daha sonra google a bagimli olarak amazon a gidin
    //driver i kapatin
    //
    // */

    @Test(dependsOnMethods="facebookTesti")
    public void googleTesti(){
        driver.get("https://www.google.com");



    }
    @Test
    public void amazonTesti(){
        driver.get("https://www.amazon.com");

    }
    @Test(enabled = false)
    public void facebookTesti(){
        driver.get("http://www.facebook.com");


    }


}
