package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RowsAndColoumns {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.get("https://html.com/tags/table/");
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	List<WebElement> table1 = drive.findElements(By.xpath("//table//tr"));
	System.out.println("Row count is "+table1.size());
	List<WebElement> table2 = drive.findElements(By.tagName("th"));
	System.out.println("coloumn count is "+table2.size());
	Thread.sleep(6000);
	drive.quit();
}
}
