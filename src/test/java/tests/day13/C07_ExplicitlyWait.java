package tests.day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C07_ExplicitlyWait extends TestBase {



    @Test
    public void test(){

    driver.get("https://www.google.com");

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
        System.out.println("wait.until(ExpectedConditions.titleIs(\"Google\")) = " + wait.until(ExpectedConditions.titleIs("Google")));


    }
}
