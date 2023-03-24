package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableLeaf {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://leafground.com/table.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
	int size = rows.size();
	System.out.println(" Total row size is "+size);
	Thread.sleep(2000);
	List<WebElement> coloumn = driver.findElements(By.tagName("td"));
	int size2 = coloumn.size();
	System.out.println("Total coloumn size is "+size2);
	Thread.sleep(2000);
	List<WebElement> customer = driver.findElements(By.xpath("//table[@role='grid']//tr"));
	int size3 = customer.size();
	System.out.println("Customer Analytics Table  row size is "+size3);
	List<WebElement> customer1 = driver.findElements(By.xpath("//table[@role='grid']//tr/td"));
	int size4 = customer1.size();
	System.out.println("Customer Analytics Table  Coloumn size is "+size4);
	for (int i = 1; i <size4; i++) {
		String text = customer1.get(i).getText();
        System.out.println(text);
	}
	for (int i = 1; i <size3-2; i++) {
		String text = driver.findElement(By.xpath("//table[@role='grid']//tr["+i+"]/td[3]")).getText();
		System.out.println("Dynamic values for td[3] = "+text);
	}
	Set<WebElement>duplicate=new LinkedHashSet<WebElement>(customer1);
	int size5 = duplicate.size();
	System.out.println("Set size is "+size5);
	if (size4==size5) {
		System.out.println("Duplicate elements present");
	}
	else {
		System.out.println("Duplicate not present");
	}
	driver.quit();
}
}
