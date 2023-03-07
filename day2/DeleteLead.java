package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9012345678");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=15769'])[1]")).click();
	System.out.println("The captured Id is 15769");
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.partialLinkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys("15769");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	String text = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']")).getText();
	if (text.contains("No")) {
		System.out.println("Record not found");
	} 
	else {
		System.out.println("Record is found");
	}
	}

}
