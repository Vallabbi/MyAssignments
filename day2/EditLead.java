package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver drive=new ChromeDriver();
drive.get("http://leaftaps.com/opentaps/control/login");
drive.manage().window().maximize();
drive.findElement(By.id("username")).sendKeys("demosalesmanager");
drive.findElement(By.id("password")).sendKeys("crmsfa");
drive.findElement(By.className("decorativeSubmit")).click();
drive.findElement(By.linkText("CRM/SFA")).click();
drive.findElement(By.linkText("Leads")).click();
drive.findElement(By.partialLinkText("Find Leads")).click();
Thread.sleep(2000);
drive.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vallabbi");
drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
drive.findElement(By.xpath("(//a[text()='Amazon'])[1]")).click();
String title = drive.getTitle();
System.out.println(title);
drive.findElement(By.xpath("//a[text()='Edit']")).click();
drive.findElement(By.id("updateLeadForm_companyName")).clear();
drive.findElement(By.id("updateLeadForm_companyName")).sendKeys("Microsoft");
drive.findElement(By.xpath("//input[@name='submitButton']")).click();
String title2 = drive.getTitle();
System.out.println(title2);
Thread.sleep(5000);
drive.close();
	}

}
