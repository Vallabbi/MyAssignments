package week2.day2;

import org.apache.poi.hssf.record.SelectionRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadCreate {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver drive=new ChromeDriver();
	drive.get("http://leaftaps.com/opentaps/control/login");
	drive.manage().window().maximize();
	drive.findElement(By.id("username")).sendKeys("demosalesmanager");
	drive.findElement(By.id("password")).sendKeys("crmsfa");
	drive.findElement(By.className("decorativeSubmit")).click();
	drive.findElement(By.linkText("CRM/SFA")).click();
	drive.findElement(By.linkText("Leads")).click();
	drive.findElement(By.partialLinkText("Create Lead")).click();
	drive.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Vallabbi");
	drive.findElement(By.id("createLeadForm_lastName")).sendKeys("Pattabiraman");
	WebElement tool = drive.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop=new Select(tool);
	drop.selectByVisibleText("Employee");
	WebElement tool1 = drive.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select drop1=new Select(tool1);
	drop1.selectByValue("9001");
	WebElement tool2 = drive.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select drop2=new Select(tool2);
	drop2.selectByIndex(5);
	WebElement tool3 = drive.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select drop3=new Select(tool3);
	drop3.selectByVisibleText("India");
	drive.findElement(By.name("submitButton")).click();
	String title = drive.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	drive.quit();
	
}
}
