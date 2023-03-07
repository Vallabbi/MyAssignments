package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("demosalesmanager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Accounts")).click();
		drive.findElement(By.partialLinkText("Create Account")).click();
		drive.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account9");
		drive.findElement(By.xpath("//textarea[@name='description']")).sendKeys( "Selenium Automation Tester");
		drive.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Vallabbi");
		drive.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
		drive.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1000000");
		WebElement find = drive.findElement(By.name("industryEnumId"));
		Select drop=new Select(find);
		drop.selectByVisibleText("Computer Software");
		WebElement find1 = drive.findElement(By.name("ownershipEnumId"));
		Select drop1=new Select(find1);
		drop1.selectByVisibleText("S-Corporation");
		WebElement find2 = drive.findElement(By.id("dataSourceId"));
		Select drop2=new Select(find2);
		drop2.selectByValue("LEAD_EMPLOYEE");
		WebElement find3 = drive.findElement(By.id("marketingCampaignId"));
		Select drop3=new Select(find3);
		drop3.selectByIndex(6);
		WebElement find4 = drive.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4=new Select(find4);
		drop4.selectByValue("TX");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//drive.close();
	}

}
