package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintValues {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.get("https://html.com/tags/table/");
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	List<WebElement> library = drive.findElements(By.xpath("//table//tr[1]/td"));
	int size = library.size();
	System.out.println("size is "+size);
	for (int i = 0; i < size-1; i++) {
		String marketshare = library.get(i).getText();
		System.out.println(marketshare);
	}
	List<WebElement> library1 = drive.findElements(By.xpath("//table//tr[2]/td"));
	int sizes = library1.size();
	System.out.println("size is "+sizes);
	for (int i = 0; i < sizes-3; i++) {
		String absolutevalue = library1.get(i).getText();
		System.out.println(absolutevalue);
	}
	Thread.sleep(5000);
	drive.quit();
}
}
