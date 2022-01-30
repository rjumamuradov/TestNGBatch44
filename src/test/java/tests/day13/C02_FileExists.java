package tests.day13;

import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;


public class C02_FileExists {


    @Test
    public void test(){

       String dosyaYolu=(System.getProperty("user.home")+"\\Desktop\\Deneme\\Se.xlsx");

        System.out.println("(\"user.dir  :\"+System.getProperty(\"user.dir\")) = " + ("user.dir  :" + System.getProperty("user.dir")));

        System.out.println("Files.exists(Paths.get(dosyaYolu)) = " + Files.exists(Paths.get(dosyaYolu)));



    }
}
