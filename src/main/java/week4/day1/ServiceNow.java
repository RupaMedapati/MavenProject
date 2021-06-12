package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ServiceNow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev103117.service-now.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame("gsft_main");
        driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
        Thread.sleep(3000);
        driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");
        driver.findElementById("sysverb_login").click();
        driver.findElementById("filter").sendKeys("incident");
        driver.findElementByXPath("(//div[@class='sn-widget-list-title'][text()='All'])[2]").click();
        Thread.sleep(3000);
        driver.switchTo().frame("gsft_main");
        driver.findElementById("sysverb_new").click();
        Thread.sleep(6000);
        driver.findElementById("lookup.incident.caller_id").click();
       // Thread.sleep(3000);
        Set<String> windowHandles=driver.getWindowHandles();
        List<String> windowId=new ArrayList<>(windowHandles);
        driver.switchTo().window(windowId.get(1));
        driver.findElementByXPath("//table[@id='sys_user_table']//td/a").click();
        driver.switchTo().window(windowId.get(0));
        driver.switchTo().frame("gsft_main");
        driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("hii");
       //String incNumber= driver.findElementById("incident.number");
       // System.out.println(incNumber);
        //driver.switchTo().frame("gsft_main");
       // Thread.sleep(3000);
       // driver.findElementById("sysverb_insert_bottom").click();




    }
}
