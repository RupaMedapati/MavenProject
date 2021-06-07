package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Window.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String title = driver.getTitle();
        driver.findElementById("home").click();
        String title2=driver.getTitle();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String each:windowHandles){
            System.out.println(each);
        }
        List<String> hs=new ArrayList<>(windowHandles);
        String s=hs.get(1);
        //move 1 wind to another
        driver.switchTo().window(s);
        driver.findElementByXPath("(//a[@class='wp-categories-link maxheight'])[1]").click();
        driver.close();
        driver.switchTo().window(hs.get(0));
        String firsttitle=driver.getTitle();
        System.out.println(firsttitle);
        //screenshots
        File source=driver.getScreenshotAs(OutputType.FILE);
        File target=new File("./snaps/leafground.png");
        FileUtils.copyFile(source,target);
    }
}
