package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    ChromeDriver driver;
    @Parameters({"url","username","password"})//name shouls exactly match with testng.xml under suite parameter names
    @BeforeMethod
    public  void preCondition(String url,String uName,String pwd){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys(uName);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
    }
    @AfterMethod
    public void postCondition(){

        driver.close();
    }
}
