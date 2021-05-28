package Week3.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RedBus {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");

        driver.manage().window().maximize();
        driver.findElementById("src").sendKeys("C");
        Thread.sleep(2000);
        // driver.findElementByXPath("/ul[@class='autoFill']/li[2]").click();
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        for (WebElement opt : options) {
            String cityName = opt.getText();

            if (cityName.contains("Coimbatore")) {
                opt.click();
                break;
            }
        }
        driver.findElementByXPath("//input[@id='dest']").sendKeys("Ra");
        Thread.sleep(2000);
        List<WebElement> options1 = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        for (WebElement opt1 : options1) {
            String cityName1 = opt1.getText();

            if (cityName1.contains("Ranchi")) {
                opt1.click();
                break;
            }
        }
        //handling calendar
        driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']/table[1]//td[@class='current day']").click();
        driver.findElementByXPath("//button[@id='search_btn']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//div[@class='sodc-doj-c  m-r-20']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//label[@title='SLEEPER']").click();
        Thread.sleep(2000);
       String availableofbus =driver.findElementByXPath("//span[@class='w-60 d-block d-found']").getText();
       String num=availableofbus.replaceAll("a-zA-Z()","").trim();
        System.out.println(num);
        Thread.sleep(3000);
        driver.findElementByXPath("//label[@title='NONAC']").click();
        String availableofnonacbus =driver.findElementByXPath("//span[@class='w-60 d-block d-found']").getText();
        String num1=availableofnonacbus.replaceAll("[a-zA-Z()]","").trim();
        System.out.println(num1);
    }
}






