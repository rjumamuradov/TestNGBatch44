package tests.day12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_Mouse_Actions extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://amazon.com");
        Actions actions = new Actions(driver);

        WebElement helloElement=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
            actions.moveToElement(helloElement).perform();

        Thread.sleep(3000);

            WebElement createElement= driver.findElement(By.xpath("//span[text()='Create a List']"));
        actions.click(createElement).perform();

        Thread.sleep(3000);

    }

}
