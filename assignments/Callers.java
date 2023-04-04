package week6.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Callers extends ProjectSpecificMethod1{
	@BeforeTest
	public void setup() {
		shadowFile="Callers";
	}
@Test(dataProvider="fetchData")
public void callers(String id2,String id3,String id4,String id5,String id6,String id7) throws InterruptedException {
	
	Shadow t1=new Shadow(drive);
	t1.setImplicitWait(15);
	t1.findElementByXPath("//div[@class='sn-polaris-nav-header-filter can-animate']").click();
	t1.setImplicitWait(10);
	WebElement call= t1.findElementByXPath("//input[@id='filter']");
	t1.setImplicitWait(10);
	call.click();
	Thread.sleep(1000);
	call.sendKeys("Callers",Keys.ENTER);
	Thread.sleep(1000);
	t1.findElementByXPath("//mark[text()='Callers']").click();
	Thread.sleep(1000);
	WebElement phone = t1.findElementByXPath("//iframe[@title='Main Content']");
	drive.switchTo().frame(phone);
	drive.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys(id2);
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys(id3);
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys(id4);
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys(id5);
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys(id6);
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys(id7);
	Thread.sleep(1000);
	drive.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
	Thread.sleep(1000);
	drive.findElement(By.xpath("(//input[@class='list_header_search  form-control form-control-search'])[2]")).sendKeys("Vallabbi",Keys.ENTER);
	Thread.sleep(1000);
	String v = drive.findElement(By.xpath("//table[@id='sys_user_table']")).getText();
	System.out.println(v);
	Thread.sleep(5000);
	
	}
}
