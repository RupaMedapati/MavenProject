package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditLead {
    @Test
    public  void Edit() {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        WebElement user = driver.findElementByXPath("//input[@id='username']");
        user.sendKeys("DemoSalesManager");
        driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
        driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
        driver.findElementByLinkText("Leads").click();

        driver.findElementByLinkText("Find Leads").click();

        driver.findElementByXPath("(//div[@class='x-form-element']/input[@name='firstName'])[3]").sendKeys("med");
        driver.findElementByXPath("//button[@class='x-btn-text'][text()='Find Leads']").click();

        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]").click();
        Assert.assertTrue(driver.getTitle().contains("View Lead"));
        driver.findElementByXPath("//div[@class='frameSectionExtra']/a[3]").click();
        driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();

        String newcmp = "infosys";
        driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys(newcmp);

        driver.findElementByXPath("(//td[@colspan='4']/input)[1]").click();
       // Thread.sleep(2000);
        String updatedcmpnyname = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
        String finalstring = updatedcmpnyname.replaceAll("[0-9()]", "").trim();
        Assert.assertEquals(newcmp, finalstring);
        driver.close();
        driver.quit();

    }
}
