package week6.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ProposalNew extends ProjectSpecificMethod1 {
	@BeforeTest
	public void setup() {
		shadowFile="ProposalNew";
	}

	@Test(dataProvider="fetchData")
	public void proposalNew(String pn2,String pn3,String pn4,String pn5,String pn6,String pn7) throws InterruptedException {
	Shadow p1=new Shadow(drive);
	p1.setImplicitWait(15);
	p1.findElementByXPath("//div[@class='sn-polaris-nav-header-filter can-animate']").click();
	p1.setImplicitWait(10);
	WebElement path = p1.findElementByXPath("//input[@id='filter']");
	p1.setImplicitWait(10);
	path.click();
	Thread.sleep(1000);
	path.sendKeys("My proposals",Keys.ENTER);
	Thread.sleep(1000);
	p1.findElementByXPath("//span[text()='My Proposals']").click();
	Thread.sleep(1000);
	WebElement frame = p1.findElementByXPath("//iframe[@title='Main Content']");
	WebDriver frame2 = drive.switchTo().frame(frame);
	System.out.println("current frame title is "+frame2);
	drive.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
	drive.findElement(By.id("std_change_proposal.short_description")).sendKeys(pn2);
	drive.findElement(By.xpath("//span[text()='Change Request values']")).click();
	Thread.sleep(1000);
	drive.findElement(By.xpath("(//input[@class='filerTableInput form-control'])[1]")).clear();
	Thread.sleep(1000);
	drive.findElement(By.xpath("(//input[@class='filerTableInput form-control'])[1]")).sendKeys(pn3);
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[1]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[1]")).sendKeys(pn4);
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[2]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[2]")).sendKeys(pn5);
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[3]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[3]")).sendKeys(pn6);
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[4]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[4]")).sendKeys(pn7);
	Thread.sleep(2000);
	drive.findElement(By.xpath("//span[text()='-- choose field --']")).click();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//input[@class='select2-input'])[6]")).sendKeys("priority",Keys.ENTER);
	Thread.sleep(2000);
	drive.findElement(By.xpath("//select[@class='filerTableSelect select2 form-control']")).click();
	Thread.sleep(2000);
	drive.findElement(By.xpath("//option[text()='2 - High']")).click();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//button[@class='form_action_button  action_context btn btn-default'])[1] ")).click();
	Thread.sleep(2000);
	String record = drive.findElement(By.xpath("//table[@id='std_change_proposal_table']")).getText();
	System.out.println(record);
	Thread.sleep(5000);

	}

}
