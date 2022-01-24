package tests.day08;

import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.priority;

public class C01_TestNG {

     @Test//(priority = 9)
    public void Youtubetest1() {
         System.out.println("youtube testi calistik" );

     }



    @Test//(priority =8)
    public void amazontest2() {
        System.out.println("Amazone testi calistik" );


    }


    @Test//(priority=5)
    public void bestBuytest3() {
        System.out.println("bestbuy testi calistik" );

    }



}
