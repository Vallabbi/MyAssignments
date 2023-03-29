package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class Callers {

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
	drive.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Vallabbi");
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Pattabiraman");
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Testleaf student");
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("vallabbi#0994@gmail.com");
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("+1 4255054341");
	Thread.sleep(1000);
	drive.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("+1 2069873345");
	Thread.sleep(1000);
	drive.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
	Thread.sleep(1000);
	drive.findElement(By.xpath("(//input[@class='list_header_search  form-control form-control-search'])[2]")).sendKeys("Vallabbi",Keys.ENTER);
	Thread.sleep(1000);
	String v = drive.findElement(By.xpath("//table[@id='sys_user_table']")).getText();
	System.out.println(v);
	Thread.sleep(5000);
	drive.quit();
	}
}
