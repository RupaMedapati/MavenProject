package Week5.day2.addExcelDataDynamically;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import testcase.BaseClass;

import java.io.IOException;

public class DeleteLead extends BaseClass {
	@Test(dataProvider = "fetchData")
	public void runDelete(String phonenumber) throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		ReadExcelDynamically obj = new ReadExcelDynamically();
		//obj.excelDynamically();
		Object[][] data = obj.excelDynamically("DeleteLeadData","Sheet1");//index starts with 0

		return data;

	}
}







