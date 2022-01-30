package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_PomIsDisable {

    @Test
    public void test(){

        String dosyaYolu=System.getProperty("user.dir");
        Assert.assertTrue(dosyaYolu.contains("Pom.xml"));

    }
}
