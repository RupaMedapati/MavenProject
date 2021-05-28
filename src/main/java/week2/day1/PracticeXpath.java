package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        WebElement user = driver.findElementByXPath("//input[@id='username']");
        user.sendKeys("DemoSalesManager");
        driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
        driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
        driver.findElementByXPath("//a[text()='Leads']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//a[text()='Merge Leads']").click();
        driver.findElementByXPath("(//img[@alt='Lookup'][1])[1]");
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();//firstresultant lead
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();//secondicon
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();//secondlead
        driver.findElementByXPath("//a[@class='buttonDangerous']").click();//merge lead button

    }
}
