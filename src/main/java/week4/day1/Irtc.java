package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Irtc {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementByXPath("(//button[@type='submit'])[1]").click();
        WebElement elementByXPath = driver.findElementByXPath("//span[@class='allcircle circleone']");
        elementByXPath.click();
       // driver.switchTo().window(elementByXPath);
        File source=driver.getScreenshotAs(OutputType.FILE);
        File target=new File("./snaps/leafground.png");
        FileUtils.copyFile(source,target);
    }
}
