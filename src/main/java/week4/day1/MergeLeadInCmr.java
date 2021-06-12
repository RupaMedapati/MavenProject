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
        String titleOfChild = driver.getTitle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            System.out.println(each);
        }
        List<String> hs = new ArrayList<>(windowHandles);
        String s = hs.get(1);
        driver.switchTo().window(s);
        String firstLead = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
        Thread.sleep(9000);
        String s1 = hs.get(0);
        driver.switchTo().window(s1);
        System.out.println(s1);
        Thread.sleep(3000);
        driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
        Thread.sleep(3000);
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String each : windowHandles1) {
            System.out.println(each);
        }
        List<String> hs1 = new ArrayList<>(windowHandles1);
        String s2 = hs1.get(1);
        driver.switchTo().window(s2);
        Thread.sleep(3000);

        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
        String s3 = hs1.get(0);
        driver.switchTo().window(s3);
        Thread.sleep(3000);
        driver.findElementByXPath("//a[@class='buttonDangerous']").click();
        driver.switchTo().alert().accept();
        driver.findElementByXPath("//ul[@class='shortcuts']/li[3]").click();
        driver.findElementByXPath("//input[@name='id']").sendKeys(firstLead);
        driver.findElementByXPath("//em[@unselectable='on']/button[text()='Find Leads']").click();
        String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
        if (text.contains("No records to display")) {
            System.out.println("successfully merged");
        } else
            System.out.println("not merged");
        driver.close();
        driver.quit();
    }
}
