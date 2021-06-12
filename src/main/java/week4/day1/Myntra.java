package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Myntra {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement women=driver.findElementByLinkText("WOMEN");
        Actions builder=new Actions(driver);
        builder.moveToElement(women).pause(500).click(driver.findElementByXPath("//a[text()='Jackets & Coats']")).perform();
        String countItems=driver.findElementByXPath("//span[@class='title-count']").getText();
        String trimcount = countItems.replaceAll("[a-z-]", "").trim();
       // System.out.println(trimcount);
        int totalcount = Integer.parseInt(trimcount);
        System.out.println(totalcount);
        String categoryCount=driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText().replaceAll("[()]","").trim();
        int category = Integer.parseInt(categoryCount);
        String categoryCount2=driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText().replaceAll("[()]","").trim();
        int category2 = Integer.parseInt(categoryCount2);
        int s = category + category2;
        System.out.println(s);
        if(totalcount==s){
            System.out.println("the sum of jackets and coats are equal with total count");
        }
        else{
            System.out.println("not equal");
        }
        Thread.sleep(2000);
        driver.findElementByXPath("(//label[@class='common-customCheckbox vertical-filters-label'])[2]").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//div[@class='brand-more']").click();
        driver.findElementByXPath("//input[@class='FilterDirectory-searchInput']").sendKeys("MANGO");
        Thread.sleep(3000);
        driver.findElementByXPath("(//label[text()='MANGO'])[2]").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
        Thread.sleep(4000);
        List<WebElement> brandNames=driver.findElementsByXPath("//h3[@class='product-brand']");
        List<String> addList=new ArrayList<>();
        for(int i=1;i<=brandNames.size();i++) {
            addList.add(driver.findElementByXPath("(//h3[@class='product-brand'])[" + i + "]").getText());
        }
            Boolean m=addList.contains("MANGO");
            if(m==true){
                System.out.println("all coats are of brand mango");
            }
            else
                System.out.println("not mango brand");
            Thread.sleep(3000);
            Actions builder1=new Actions(driver);
            builder1.moveToElement(driver.findElementByXPath("//div[@class='sort-sortBy']")).pause(1100).click(driver.findElementByXPath("(//ul[@class='sort-list']//label)[3]")).perform();
            Thread.sleep(3000);
            String cost=driver.findElementByXPath("//span[@class='product-discountedPrice'][1]").getText();

            System.out.println(cost+"is the cost of first item");
            Thread.sleep(4000);
            Actions builder2=new Actions(driver);
            builder2.moveToElement(driver.findElementByXPath("(//img[@class='img-responsive'])[1]")).pause(1000).click(driver.findElementByXPath("(//span[@class='product-wishlistFlex product-actionsButton product-wishlist '])[1]")).perform();
            driver.close();





    }
}
