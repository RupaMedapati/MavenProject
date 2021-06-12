package Week5.day2.addExcelDataDynamically;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import Wee.BaseClass;

import java.io.IOException;

public class EditLead extends BaseClass {
	@Test(dataProvider = "fetchData",dependsOnMethods = {"Week5.day2.addExcelDataDynamically.CreateLead.runCreateLead"},enabled = false)
	public void runEdit(String phoneNumber, String companyName) throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		ReadExcelDynamically obj = new ReadExcelDynamically();
		//obj.excelDynamically();
		Object[][] data = obj.excelDynamically("EditLeadData","Sheet1");//index starts with 0

		return data;
	}
}






