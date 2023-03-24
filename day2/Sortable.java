package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.get("https://jqueryui.com/sortable/");
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	drive.switchTo().frame(0);
	Thread.sleep(2000);
	WebElement sort1 = drive.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement sort2 = drive.findElement(By.xpath("//li[text()='Item 2']"));
	Actions s=new Actions(drive);
	s.dragAndDrop(sort2, sort1).perform();
	Thread.sleep(2000);
	WebElement sort3 = drive.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement sort4 = drive.findElement(By.xpath("//li[text()='Item 4']"));
	s.dragAndDrop(sort4, sort3).perform();
	Thread.sleep(2000);
	WebElement sort5 = drive.findElement(By.xpath("//li[text()='Item 5']"));
	WebElement sort6 = drive.findElement(By.xpath("//li[text()='Item 6']"));
	s.dragAndDrop(sort6, sort5).perform();
	Thread.sleep(2000);
	WebElement sort7 = drive.findElement(By.xpath("//li[text()='Item 7']"));
	s.dragAndDrop(sort7, sort6).perform();
	System.out.println("All frames are sorted");
	Thread.sleep(5000);
	drive.quit();
	
}
}
