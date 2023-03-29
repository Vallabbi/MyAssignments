package week5.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	drive.get("https://dev57553.service-now.com/");
	Thread.sleep(2000);
	drive.findElement(By.id("user_name")).sendKeys("admin");
	Thread.sleep(2000);
	drive.findElement(By.id("user_password")).sendKeys("2oaD6KN$q$vN");
	Thread.sleep(2000);
	drive.findElement(By.id("sysverb_login")).click();
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
	drive.quit();
	
	
	}

}
