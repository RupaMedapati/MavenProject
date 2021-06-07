package week4.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MergeLeadInCmr {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement user = driver.findElementByXPath("//input[@id='username']");
        user.sendKeys("DemoSalesManager");
        driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
        driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
        driver.findElementByLinkText("Leads").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/mergeLeadsForm']").click();
        String titleOfParent = driver.getTitle();
        driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
        String titleOfChild= driver.getTitle();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String each:windowHandles){
            System.out.println(each);
        }
        List<String> hs=new ArrayList<>(windowHandles);
        String s=hs.get(1);
        //move 1 wind to another
        driver.switchTo().window(s);
        driver.findElementByXPath("//input[@name='id']").sendKeys("10143");
        Thread.sleep(3000);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(4000);
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
    }
}
