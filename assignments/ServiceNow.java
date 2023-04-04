package week6.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServiceNow extends ProjectSpecificMethod1{

@Test
public void serviceNow() throws InterruptedException {
	
	Shadow service=new Shadow(drive);
	service.setImplicitWait(20);
	service.findElementByXPath("//div[@id='all']").click();
	Thread.sleep(1000);
	service.findElementByXPath("//span[text()='Service Catalog']").click();
	Thread.sleep(2000);
	WebElement frame = service.findElementByXPath("//iframe[@title='Main Content']");
	WebDriver frame2 = drive.switchTo().frame(frame);
	System.out.println("current frame title is "+frame2);
	service.findElementByXPath("//span[contains(text(),'Mobiles')]").click();
	drive.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
	drive.findElement(By.xpath("//select[@id='IO:60b15e33d7033100a9ad1e173e24d4a3']")).click();
	drive.findElement(By.xpath("//option[text()='Rose Gold']")).click();
	drive.findElement(By.xpath("//select[@id='IO:e0b15e33d7033100a9ad1e173e24d4a1']")).click();
	drive.findElement(By.xpath("//option[text()='128GB [add $50.00]']")).click();
	drive.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	String text = drive.findElement(By.xpath("//dl[@class='dl-horizontal sc-dl-horizontal']")).getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	
	
	}

}
