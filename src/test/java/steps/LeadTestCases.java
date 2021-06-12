package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadTestCases {
    ChromeDriver driver;
    @And("Click on CRM/SFA button")
    public void clickCrm(){
        driver.findElement(By.linkText("CRM/SFA")).click();
    }
    @And("Click on createlead")
    public void clickOnCreateLead(){
        driver.findElement(By.linkText("Create Lead")).click();
    }
    @And("Enter company name as {string}")
    public void enterCmpName(String companyName){
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

    }
    @And("Enter firstname as {string}")
    public void enterFirstName(String firstName){
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
    }
    @And("Enter lastname as {string}")
    public void enterLastName(String lastName){
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
    }
    @And("Enter phonenumber {string}")
    public void enterPhoneNum(String phoneNum){
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNum);
    }
    @When("Click on submitbutton")
    public void clickSubmit(){
        driver.findElement(By.name("submitButton")).click();
    }
    @Then("Display lead is created")
    public void verifyMsg(){
        System.out.println("Lead created");
    }

}
