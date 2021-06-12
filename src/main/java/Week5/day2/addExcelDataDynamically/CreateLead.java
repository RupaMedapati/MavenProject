package Week5.day2.addExcelDataDynamically;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateLead extends BaseClass {
	@Test(dataProvider = "fetchData",invocationCount = 2,enabled = false)
	public void runCreateLead(String company,String fName,String lName,String pNo) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();

	}
	@BeforeClass
	public void rupa(){
		System.out.println("hiirupa");
	}

	@DataProvider(name="fetchData",indices = 0)
	public Object[][] sendData() throws IOException {
		ReadExcelDynamically obj=new ReadExcelDynamically();
		//obj.excelDynamically();
       Object[][] data=obj.excelDynamically("CreateLeadData","Sheet2");//index starts with 0

		return data;
	}
}






