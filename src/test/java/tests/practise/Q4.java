package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;


import java.util.ArrayList;
import java.util.List;

public class Q4 extends TestBase {
    @Test
    public void test() {
        ///*
        //     * Navigate to  https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com");
        //     * Enter the user name  as standard_user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //     * Enter the password as   secret_sauce
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //     * Click on login button
        driver.findElement(By.id("login-button")).click();
        //     *     T1 : Choose price low to high
        WebElement dd = driver.findElement(By.className("product_sort_container"));//select[@class='product_sort_container']

        //     *     T2 : Verify item prices are sorted from low to high with soft Assert
        Select select = new Select(dd);
        select.selectByVisibleText("Price (low to high)");


        String expected = "PRICE (LOW TO HIGH)";
        String actual = driver.findElement(By.className("active_option")).getText();
        Assert.assertEquals(actual, expected, "low high gorunmuyor");


        List<WebElement> fiyatlar = driver.findElements(By.className("inventory_item_price"));
        ArrayList<Double> fiyatlarDouble = new ArrayList<>();



    }
}
