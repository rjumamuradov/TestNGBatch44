package tests.practise;

import org.testng.annotations.Test;
import utilities.TestBase;

import static org.testng.TestRunner.PriorityWeight.priority;

public class Q1 extends TestBase {

    @Test (priority=3000)
    public void testb(){
        System.out.println("driver b= " );

    }
    @Test(priority = 2001, enabled = false)
    public void testa(){

        System.out.println("driver a= "  );


    }

    @Test(priority = 2000)
    public void testc(){
        System.out.println("driver c= "  );
    }

    @Test
    public void test1(){
        System.out.println("Test  1....");
    }

    @Test
    public void test2(){
        System.out.println("Test  2....");
    }
    @Test
    public void test3(){
        System.out.println("Test  3....");
    }
    @Test(enabled = false)
    public void test4(){
        System.out.println("Test  4....");
    }
    @Test(enabled = false)
    public void test5(){
        System.out.println("Test  5....");
    } @Test
    public void test6(){
        System.out.println("Test 6....");
    }




}
