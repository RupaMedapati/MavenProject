package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Handleiframes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().frame("iframeResult");
        driver.findElementByXPath("//button[text()='Try it']").click();
        Alert al=driver.switchTo().alert();
        al.sendKeys("rupa");
        al.accept();
        String name=driver.findElementById("demo").getText();
        System.out.println(name);
        if(name.contains("rupa")){
            System.out.println("displayed");
        }
        else
            System.out.println("not displayed");


    }
}
