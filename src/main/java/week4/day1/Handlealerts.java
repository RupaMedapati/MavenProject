package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Alert.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //handling alerts
        driver.findElementByXPath("//button[@onclick='normalAlert()']").click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElementByXPath("//button[@onclick='confirmAlert()']").click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElementByXPath("//button[@onclick='confirmPrompt()']").click();
        Alert alert=driver.switchTo().alert();
        String text=alert.getText();
        alert.sendKeys("rupa");
        alert.accept();
        driver.findElementByXPath("//button[@onclick='sweetalert()']").click();
        driver.findElementByXPath("//button[text()='OK']").click();

    }
}
