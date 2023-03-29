package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ProposalNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	drive.get("https://dev138514.service-now.com");
	Thread.sleep(2000);
	drive.findElement(By.id("user_name")).sendKeys("admin");
	Thread.sleep(2000);
	drive.findElement(By.id("user_password")).sendKeys("Vallabbi@95");
	Thread.sleep(2000);
	drive.findElement(By.id("sysverb_login")).click();
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
	drive.findElement(By.id("std_change_proposal.short_description")).sendKeys("Reset my password");
	drive.findElement(By.xpath("//span[text()='Change Request values']")).click();
	Thread.sleep(1000);
	drive.findElement(By.xpath("(//input[@class='filerTableInput form-control'])[1]")).clear();
	Thread.sleep(1000);
	drive.findElement(By.xpath("(//input[@class='filerTableInput form-control'])[1]")).sendKeys("Password needs to get reset");
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[1]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[1]")).sendKeys("Changing password");
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[2]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[2]")).sendKeys("New password replacing old password");
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[3]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[3]")).sendKeys("If new password not working try old password once again.");
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[4]")).clear();
	Thread.sleep(2000);
	drive.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[4]")).sendKeys("New password working properly");
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
	drive.quit();
	}

}
