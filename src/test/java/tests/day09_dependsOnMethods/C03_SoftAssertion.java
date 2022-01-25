package tests.day09_dependsOnMethods;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {



    @Test
    public void test(){


        int a=10;
        int b=20;
        int c=30;
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(a,b,"esit degil"); // failed
        softAssert.assertTrue(a>b,"2.tes basarisiz");  //failed

        softAssert.assertTrue(a<c,"3.tes basarili"); //passeed
        softAssert.assertTrue(b<c,"4, tes basarili"); // passed
        softAssert.assertTrue(c<b,"5.tes basarisiz"); // failed


        softAssert.assertAll();


    }
}
