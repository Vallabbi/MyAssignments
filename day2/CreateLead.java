package week6.day2;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{
	@BeforeTest
	public  void setup() {
	    excelFile="CreateLead";
	}
@Test(dataProvider = "fetchData")
	public  void createLead(String name1,String name2,String name3,String name4) {
	    driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(name1);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name2);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(name3);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(name4);
		driver.findElement(By.name("submitButton")).click();
		
}

    
}









