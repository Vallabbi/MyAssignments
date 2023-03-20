package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrainBooking {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	drive.get("https://www.irctc.co.in/");
	drive.findElement(By.xpath("(//li[@class='menu-list header-icon-menu'])[3]")).click();
	System.out.println(drive.getTitle());
	String handle = drive.getWindowHandle();
	System.out.println(handle);
	String title = drive.getTitle();
	System.out.println(title);
	Set<String> windowHandles = drive.getWindowHandles();
	List<String>air=new ArrayList<String>(windowHandles);
	drive.switchTo().window(air.get(1));
	System.out.println(drive.getTitle());
	drive.close();
	drive.switchTo().window(air.get(0));
	drive.quit();
	
}
}
