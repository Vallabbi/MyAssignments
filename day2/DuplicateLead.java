package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
	drive.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pv");
	drive.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	drive.findElement(By.id("createLeadForm_description")).sendKeys("Basic testing to find duplicate lead");
	drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vallabbilatha@gmail.com");
	drive.findElement(By.name("submitButton")).click();
	String title = drive.getTitle();
	System.out.println(title);
	drive.findElement(By.linkText("Duplicate Lead")).click();
drive.findElement(By.id("createLeadForm_companyName")).clear();
drive.findElement(By.id("createLeadForm_companyName")).sendKeys("Starbucks");
drive.findElement(By.id("createLeadForm_firstName")).clear();
drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Bavyasri");
drive.findElement(By.name("submitButton")).click();
String title1 = drive.getTitle();
System.out.println(title1);
Thread.sleep(3000);
drive.quit();


}
}
