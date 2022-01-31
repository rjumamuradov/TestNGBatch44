package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class Q3 extends TestBase {

    @Test
    public void test(){


        //// go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
        ////-->Task1 Find Dropdown on Multi Selection
        ////-->Task2 Find Dropdown Elements
        ////-->Task3 printout DropDown Elements number
        ////-->Task4 choose all dropdown elements and printout dropdown elements name
        ////-->Task5 check until choise 6
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree");

driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click(); //dropdowni bulduk
     List <WebElement> dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

        System.out.println("list.size() = " + dropList.size());

        for (WebElement element : dropList) {

            System.out.println("element = " + element.getText());


        }



    }
}
