package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ERail {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	drive.get("https://erail.in/");
	drive.findElement(By.id("txtStationFrom")).clear();
	drive.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
	drive.findElement(By.id("txtStationTo")).clear();
	drive.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
	Thread.sleep(2000);
	drive.findElement(By.id("buttonFromTo")).click();
	drive.findElement(By.id("chkSelectDateOnly")).click();
	Thread.sleep(3000);
	List<WebElement> elements = drive.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
System.out.println(elements.size());
for (int i = 1; i <elements.size(); i++) {
	String text = elements.get(i).getText();
	System.out.println(text);
}
Set<WebElement>dup=new LinkedHashSet<WebElement>(elements);
System.out.println("set size"+dup.size());
 
if(elements.size()==dup.size()) {
	System.out.println("Duplicate Present");
}
else {
	System.out.println("Duplicate Not present");
}
}
}

