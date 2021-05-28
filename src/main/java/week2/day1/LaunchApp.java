package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LaunchApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.out.println(System.getProperty("webdriver.chrome.driver"));//to check path of driver
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        WebElement user = driver.findElementById("username");
        user.sendKeys("DemoSalesManager");
        // Thread.sleep(5000);
        driver.findElementByName("PASSWORD").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        System.out.println(driver.getTitle());
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys("Brain o vision");
        driver.findElementById("createLeadForm_firstName").sendKeys("med");
        driver.findElementById("createLeadForm_lastName").sendKeys("Rupa");
        driver.findElementById("createLeadForm_firstNameLocal").sendKeys("rupabhavani");
        driver.findElementById("createLeadForm_lastNameLocal").sendKeys("reddy");
        driver.findElementById("createLeadForm_personalTitle").sendKeys("homepage");
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("tester");
        driver.findElementByName("annualRevenue").sendKeys("330000");
        driver.findElementById("createLeadForm_birthDate").sendKeys("12/14/1998");
        driver.findElementById("createLeadForm_departmentName").sendKeys("cse");
        driver.findElementById("createLeadForm_numberEmployees").sendKeys("150");
        WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
        Select ownerdrop = new Select(owner);
        ownerdrop.selectByValue("OWN_PARTNERSHIP");
        WebElement source = driver.findElementById("createLeadForm_industryEnumId");
        Select drop = new Select(source);
        drop.selectByValue("IND_HEALTH_CARE");
        WebElement source1 = driver.findElementById("createLeadForm_dataSourceId");
        Select drop1 = new Select(source1);
        drop1.selectByVisibleText("Employee");
        WebElement source2 = driver.findElementById("createLeadForm_marketingCampaignId");
        Select drop2 = new Select(source2);
        drop2.selectByValue("CATRQ_AUTOMOBILE");
        WebElement source4 = driver.findElementById("createLeadForm_currencyUomId");
        Select drop4 = new Select(source4);
        drop4.selectByIndex(3);
        driver.findElementById("createLeadForm_sicCode").sendKeys("123523");
        driver.findElementById("createLeadForm_description").sendKeys("hi all ");
        driver.findElementById("createLeadForm_tickerSymbol").sendKeys("a class");
        driver.findElementById("createLeadForm_importantNote").sendKeys("this is to fill important note");
        driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
        driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("53422");
        driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9617229821");
        driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("no extension");
        driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("ask for name");
        driver.findElementById("createLeadForm_primaryEmail").sendKeys("rupa@gmail.com");
        driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://amazon.com");
        driver.findElementById("createLeadForm_generalToName").sendKeys("reddymed");
        driver.findElementById("createLeadForm_generalAttnName").sendKeys("medpati");
        driver.findElementById("createLeadForm_generalAddress1").sendKeys("near high school pali");
        driver.findElementById("createLeadForm_generalAddress2").sendKeys("Pali village");
        driver.findElementById("createLeadForm_generalCity").sendKeys("Attili");
        driver.findElementById("createLeadForm_generalPostalCode").sendKeys("534225");


        WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
        Select coundrop = new Select(country);
        coundrop.selectByValue("IND");
        Thread.sleep(2000);
        WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
        Select statedrop = new Select(state);
        statedrop.selectByValue("IN-AP");
        driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("type");


        driver.findElementByName("submitButton").click();
        Thread.sleep(3000);
        driver.findElementByLinkText("Duplicate Lead").click();
        driver.findElementById("createLeadForm_companyName").clear();

        driver.findElementById("createLeadForm_companyName").sendKeys("tcs");
        driver.findElementByClassName("smallSubmit").click();
        String viewLead_companyName_sp = driver.findElementById("viewLead_companyName_sp").getText();
        String s = viewLead_companyName_sp.replaceAll("[0-9()]", "").trim();
        Assert.assertEquals("tcs", s);


        System.out.println("successfully done......");


        driver.close();
    }
}
