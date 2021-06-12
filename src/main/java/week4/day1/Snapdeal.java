package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Snapdeal {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
       // ChromeDriver driver = new ChromeDriver();
        ChromeOptions newopt=new ChromeOptions();
        newopt.addArguments("--disable-notifications");
        ChromeDriver driver=new ChromeDriver(newopt);
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement menfashion=driver.findElementByLinkText("Men's Fashion");
        Actions builder=new Actions(driver);
        builder.moveToElement(menfashion).perform();
        driver.findElementByXPath("(//span[text()='Sports Shoes'])[1]").click();
        String countOfShoes=driver.findElementByXPath("//span[@class='category-count']").getText();
        System.out.println(countOfShoes);
        driver.findElementByXPath("//div[text()='Training Shoes']").click();
        driver.findElementByXPath("//div[@class='sort-selected']").click();
        driver.findElementByXPath("(//ul[@class='sort-value']/li)[2]").click();
        Thread.sleep(4000);
       List<WebElement> costOfShoes=driver.findElementsByXPath("//span[@class='lfloat product-price']");
        LinkedList<String> costOfShoe=new LinkedList<>();
        for(int i=1;i<=costOfShoes.size();i++){
            String cost=driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]")).getText();
            costOfShoe.add(cost);
        }
        List copy=new ArrayList(costOfShoe);
        Collections.sort(copy);
        Boolean s=copy.equals(costOfShoe);
        System.out.println("items are sorted correctly : " +s);
        Thread.sleep(4000);
        WebElement firstshoe= driver.findElementByXPath("(//span[contains(@id,'display-price')])[2]");
        Actions a1=new Actions(driver);
        a1.moveToElement(firstshoe).pause(500).click(driver.findElementByXPath("(//div[contains(text(),'Quick View')])[2]")).perform();
        String costOfItem=driver.findElementByXPath("//span[@class='payBlkBig']").getText().replaceAll("[A-Za-z]","").trim();
        System.out.println("cost of shoe is : " + costOfItem);
       String discount= driver.findElementByXPath("//span[@class='percent-desc ']").getText().replaceAll("[A-Z]","").trim();
        System.out.println("discount of shoe is : " +discount);
        //taking screenshot
        File source=driver.getScreenshotAs(OutputType.FILE);
        File target=new File("./snaps/ShoeImage.png");
        FileUtils.copyFile(source,target);
        driver.findElementByXPath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]").click();
        Thread.sleep(4000);
        driver.close();
        driver.quit();

    }
}
