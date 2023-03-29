package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ArticleNew {

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
	Shadow article=new Shadow(drive);
	article.setImplicitWait(15);
	article.findElementByXPath("//div[@class='sn-polaris-nav-header-filter can-animate']").click();
	article.setImplicitWait(10);
	WebElement read= article.findElementByXPath("//input[@id='filter']");
	article.setImplicitWait(10);
	read.click();
	Thread.sleep(1000);
	read.sendKeys("Knowledge",Keys.ENTER);
	Thread.sleep(1000);
	article.findElementByXPath("//mark[text()='Knowledge']").click();
	Thread.sleep(1000);
	WebElement field = article.findElementByXPath("//iframe[@title='Main Content']");
WebDriver frames = drive.switchTo().frame(field);
System.out.println(frames);
drive.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Thread.sleep(1000);
drive.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT",Keys.ENTER);
Thread.sleep(1000);
drive.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
drive.findElement(By.xpath("(//div[@class='list-item arrow'])[4]")).click();
Thread.sleep(1000);
drive.findElement(By.xpath("//span[text()='Java']")).click();
Thread.sleep(1000);
drive.findElement(By.xpath("//button[@id='ok_button']")).click();
Thread.sleep(1000);
drive.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("Sessions going to be held in 'IT' knowledge base,under the category 'Java'",Keys.ENTER);
Thread.sleep(1000);
drive.findElement(By.xpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]")).click();
Thread.sleep(5000);
drive.quit();
	}

}
