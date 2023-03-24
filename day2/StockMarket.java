package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StockMarket {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.chittorgarh.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//a[@class='main-nav-icons fa fa-menu ch-bar-item ch-button px-3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//b[text()='Stock Market']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[2]")).click();
	List<WebElement> elements = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]"));
	int security = elements.size();
	System.out.println("List size is "+security);
	for (int i = 0; i <security; i++) {
		String text = elements.get(i).getText();
		System.out.println(text);
		}
Set<WebElement>duplicate=new LinkedHashSet<WebElement>(elements);
int size = duplicate.size();
System.out.println("Set size is "+size);
if (security==size) {
	System.out.println("Duplicate is present");
}
else {
	System.out.println("Duplicate not present");
}
Thread.sleep(6000);
driver.quit();
}
}
