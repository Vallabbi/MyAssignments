package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameMessage {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	drive.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	WebElement element = drive.findElement(By.xpath("//iframe[@id='iframeResult']"));
	drive.switchTo().frame(element);
	drive.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert alert = drive.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.accept();
	String text2 = drive.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println(text2);
}
}
