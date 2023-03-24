package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.get("https://jqueryui.com/selectable/");
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	drive.switchTo().frame(0);
	WebElement s1 = drive.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement s2 = drive.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement s3 = drive.findElement(By.xpath("//li[text()='Item 5']"));
	WebElement s4 = drive.findElement(By.xpath("//li[text()='Item 7']"));
	WebElement s5 = drive.findElement(By.xpath("//li[text()='Item 2']"));
	Actions select=new Actions(drive);
	select.keyDown(Keys.CONTROL).click(s1).click(s3).click(s5).click(s2).click(s4).keyUp(Keys.CONTROL).perform();
	System.out.println("Frames are selected using keys");
	Thread.sleep(5000);
	drive.quit();
}
}
