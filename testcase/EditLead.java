package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod {
@Test(dataProvider="fetchData")
	public  void editLead(String e1,String e2) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider(name="fetchData")
public String[][] getdata() {
    String [][] data =new String[2][2];
    
    data[0][0]="99";
    data[0][1]="TCS";
    
        data[1][0]="98";
        data[1][1]="Microsoft";
      
    return data;
}
}






