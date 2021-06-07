package testcase;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String company,String fName,String lName,String pNo) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(name="fetchData")
	public Object[][] sendData() {
       String[][] data=new String[2][4];//index starts with 0
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="R";
		data[0][3]="99";
		data[1][0]="Wipro";
		data[1][1]="HariBabu";
		data[1][2]="Ru";
		data[1][3]="99";
		return data;
	}
}






