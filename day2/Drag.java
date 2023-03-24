package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
	ChromeDriver drive=new ChromeDriver(option);
	drive.get("https://www.leafground.com/drag.xhtml");
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement drag = drive.findElement(By.xpath("//span[@style='text-align:center']"));
	Actions build=new Actions(drive);
	Point move = drag.getLocation();
	int x = move.getX();
	System.out.println("X value = "+x);
	int y = move.getY();
	System.out.println("Y value = "+y);
	build.dragAndDropBy(drag, 50,50).perform();
	System.out.println(drag.getLocation().getX());
	WebElement drag1 = drive.findElement(By.xpath("//th[@id='form:j_idt94:j_idt95']"));
	 WebElement drag2 = drive.findElement(By.xpath("//th[@id='form:j_idt94:j_idt97']"));
	 build.dragAndDrop(drag2, drag1).perform();
	 System.out.println("Draggable coloumns ="+drag1.getCssValue("background-color"));
	 WebElement drag3 = drive.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
	 WebElement drag4 = drive.findElement(By.xpath("(//td[text()='Black Watch'])[2]"));
	 build.dragAndDrop(drag4, drag3).perform();
	 System.out.println("Draggable row = "+drag3.getCssValue("background-color"));
	 WebElement drag5 = drive.findElement(By.xpath("//p[text()='Drag to target']"));
	 WebElement drag6 = drive.findElement(By.xpath("//p[text()='Drop here']"));
	build.dragAndDrop(drag5, drag6).perform();
	 System.out.println("Draggable and drop = "+drag6.getCssValue("background-color"));
	 Thread.sleep(6000);
	 drive.quit();
}
}
