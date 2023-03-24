package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Menu {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.get("https://www.leafground.com/menu.xhtml");
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement menu = drive.findElement(By.xpath("//h5[text()='Context Menu']"));
	Actions right=new Actions(drive);
	right.contextClick().perform();
	Thread.sleep(2000);
	right.contextClick(menu).perform();
	System.out.println("Right click action is performed");
	Thread.sleep(2000);
	drive.quit();
}
}
