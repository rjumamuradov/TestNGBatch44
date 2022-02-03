package tests.practise;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Scanner;

public class Q9_Twitter extends TestBase {
    Faker faker = new Faker();

    //twitter a faker class kullanarak kayit olmaya calisiniz
    @Test
    public void test() {

        driver.get("https://www.twitter.com");


        driver.findElement(By.xpath("//a[@data-testid='signupButton']")).click();

        Scanner scanner = new Scanner(System.in);


        phoneSignUp(driver);

        dateOfBirth(driver);

    }

    private void dateOfBirth(WebDriver driver) {
        WebElement ddm = driver.findElement(By.xpath("//select[@id='SELECTOR_1']"));
        Select option = new Select(ddm);


            }

    private void phoneSignUp(WebDriver driver) {

        WebElement nameButton = driver.findElement(By.xpath("//input[@autocomplete='name']"));
        nameButton.sendKeys(faker.name().name());
        WebElement telButton = driver.findElement(By.xpath("//input[@name='phone_number']"));


        telButton.sendKeys(faker.phoneNumber().phoneNumber());
        //telButton.sendKeys(faker.phoneNumber().cellPhone());
        //telButton.sendKeys(faker.phoneNumber().subscriberNumber());


    }

    // (actions class kullanmadan - TestNg Framework de)

}
