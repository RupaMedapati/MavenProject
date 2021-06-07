package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.tools.ant.types.selectors.SelectSelector;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Handlemultiple {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        WebElement ele=driver.findElementByXPath("//input[@id='txtStationFrom']");
        Thread.sleep(7000);
        ele.clear();
        ele.sendKeys("ms");
        ele.sendKeys(Keys.TAB);
        WebElement toAdress=driver.findElementByXPath("//input[@id='txtStationTo']");

        toAdress.clear();
        toAdress.sendKeys("mdu");
        toAdress.sendKeys(Keys.TAB);
        driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
        Thread.sleep(3000);
        List<WebElement> listofrows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
        int n=listofrows.size();
        List<String> names=new ArrayList<>();
        Thread.sleep(4000);
        for(int i=0;i<=n;i++){

           String trainName= driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
           names.add(trainName);
        }
        HashSet<String> removedup=new HashSet<>(names) ;
        if(names.size()!=removedup.size()){
            System.out.println("duplicates are present");

        }
        else
            System.out.println("no duplicates");




        //driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[3]").click();
        //System.out.println(text);

    }
}
