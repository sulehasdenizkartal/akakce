package aramaYap;

//import jdk.internal.access.JavaIOFileDescriptorAccess;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AramaYap {

    public static void main(String[] args) throws InterruptedException {

        WebDriver cdriver= new ChromeDriver();
        int milis=3000;
        JavascriptExecutor jsx= (JavascriptExecutor) cdriver;
        cdriver.get("https://www.akakce.com/");
        Actions actions=new Actions(cdriver);
        cdriver.manage().window().maximize();


        WebElement aramaYap =cdriver.findElement(By.xpath("//input[@id='q']"));
        aramaYap.click();
        aramaYap.sendKeys("iphone");
        Thread.sleep(milis);


        //Tüm listeyi içeren id bulundu.
        WebElement listElement = cdriver.findElement(By.id("ACList4[object HTMLInputElement]"));

        // İphone14 ürünü seçildi.
        WebElement item = listElement.findElement(By.xpath("//body[1]/div[1]/header[1]/div[3]/form[1]/span[1]/ul[1]/li[3]"));
        item.click();
        Thread.sleep(milis);


        WebElement urunegit=cdriver.findElement(By.xpath("//b[contains(text(),'Ürüne Git (+102)')]"));
        urunegit.click();
        Thread.sleep(milis);

        jsx.executeScript("window.scrollBy(0,500)","");//Sayfa aşağı kaydırılır


        WebElement takipet=cdriver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]"));
        takipet.click();
        Thread.sleep(milis);


        WebElement eposta=cdriver.findElement(By.id("life"));
        eposta.click();
        eposta.sendKeys("sulehasdeniz@hotmail.com");

        WebElement sifre=cdriver.findElement(By.id("lifp"));
        sifre.click();
        sifre.sendKeys("Akakçe06*");

        WebElement girisyapbtn=cdriver.findElement(By.id("lfb"));
        girisyapbtn.click();
        Thread.sleep(milis);

        //Takip listemi görüntüle
        WebElement takiplist= cdriver.findElement(By.id("H_f_v8"));
        takiplist.click();



















        Thread.sleep(milis);


//        boolean isSelectedHome=checkBoxHome.isSelected();
//        if (isSelectedHome){
//            System.out.println("Checkbox is already selected");
//        }else{
//            checkBoxHome.click();
//            System.out.println("Checkbox is selected now");
//        }
//
//
//        Thread.sleep(milis);
//        List<WebElement> resultHome=driver.findElements(By.className("text-success"));
//        for (WebElement result:resultHome){
//            System.out.println(result.getText());
//        }











    }
}
