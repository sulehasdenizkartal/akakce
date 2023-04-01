package anasayfaGiris;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnaSayfa {
    public static void main(String[] args){
        WebDriver cdriver = new ChromeDriver();

        cdriver.get("https://www.akakce.com/");
        cdriver.manage().window().maximize();

        System.out.println("Mevcut Pencere URL: " + cdriver.getCurrentUrl());


    }

}