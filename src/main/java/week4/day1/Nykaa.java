package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Nykaa {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.nykaa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement brands=driver.findElementByXPath("//a[text()='brands']");
        Actions builder=new Actions(driver);
        builder.moveToElement(brands).pause(900).moveToElement(driver.findElementByXPath("//a[text()='Popular']")).perform();
        driver.findElementByXPath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']").click();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String each:windowHandles){
            System.out.println(each);
        }
        List<String> hs=new ArrayList<>(windowHandles);
        String s=hs.get(1);
        System.out.println(s);
        driver.switchTo().window(s);
        String firsttitle=driver.getTitle();
        System.out.println(firsttitle);
        if(firsttitle.contains("L'Oreal Paris")){
            System.out.println("title contains");
        }
        else
            System.out.println("not contains");

driver.findElementByXPath("//span[text()='popularity']").click();
driver.findElementByXPath("//span[text()='customer top rated']").click();
Thread.sleep(4000);
driver.findElementByXPath("(//div[@class='clearfix'])[2]").click();
Thread.sleep(3000);
driver.findElementByXPath("//div[@class='category-wrap-top']").click();
Thread.sleep(2000);
driver.findElementByXPath("//span[text()='Hair Care']").click();
driver.findElementByXPath("//div[@class='control__indicator']").click();
String text=driver.findElementByXPath("//ul[@class='pull-left applied-filter-lists']").getText();
if(text.contains("Shampoo")){
    System.out.println("Filter with shampoo");
}
else
    System.out.println("not filter with shampoo");
driver.findElementByXPath("//span[contains(text() , ' Paris Colour Protect Shampoo')]").click();
Thread.sleep(2000);
        Set<String> windowHandles1 = driver.getWindowHandles();
        for(String each:windowHandles1){
            System.out.println(each);
        }
        List<String> hs1=new ArrayList<>(windowHandles1);
        String s1=hs1.get(2);
        //move 1 wind to another
        driver.switchTo().window(s1);
        Thread.sleep(3000);
        driver.findElementByXPath("(//span[@class='size-pallets'])[1]").click();
        String price=driver.findElementByXPath("//span[@class='post-card__content-price-offer']").getText();
        System.out.println("price of product is  "+price);
        Thread.sleep(3000);
        driver.findElementByXPath("(//div[@class='pull-left'])[1]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//div[@class='AddBagIcon']").click();
        String grandTotal=driver.findElementByXPath("//div[@class='value medium-strong']").getText().replaceAll("[₹]","").trim();
        System.out.println("grand total amount is "+grandTotal);
        Thread.sleep(3000);
        driver.findElementByXPath("(//button[@type='button'])[5] ").click();
        Thread.sleep(3000);
        driver.findElementByXPath("(//button[@type='button'])[2]").click();
        Thread.sleep(3000);
        String totalAmoutForPayment=driver.findElementByXPath("//div[text()='Grand Total']/following-sibling::div").getText().replaceAll("[₹]","").trim();
        System.out.println(totalAmoutForPayment);
        if(grandTotal.equals(totalAmoutForPayment)){
            System.out.println("amount is same ");
        }
        else
            System.out.println("not same");
        driver.quit();
    }


}
