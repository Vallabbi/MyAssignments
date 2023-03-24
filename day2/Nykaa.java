package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver drive=new ChromeDriver(option);
		drive.get("https://www.nykaa.com/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement brand = drive.findElement(By.xpath("//a[text()='brands']"));
		Actions shampoo=new Actions(drive);
		shampoo.moveToElement(brand).perform();
		drive.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		drive.findElement(By.xpath("(//a[contains(text(),'Paris')])[5]")).click();
		String title = drive.getTitle();
		System.out.println("Shampoo slected in brands = "+title);
		drive.findElement(By.xpath("//span[@class='sort-name']")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		drive.findElement(By.xpath("(//span[@class='title '])[1]")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//div[@class=' css-b5p5ep'])[1]")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//div[@class=' css-b5p5ep'])[1]")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(2000);
		String text = drive.findElement(By.xpath("//div[@class='css-19j3ean']")).getText();
		System.out.println("Selected filters = "+text);
		String text1 = drive.findElement(By.xpath("//span[@class='sort-name']")).getText();
		System.out.println("Sorted filters = "+text1);
		Thread.sleep(2000);
		drive.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		String wh = drive.getWindowHandle();
		System.out.println(wh);
		String title2 = drive.getTitle();
		System.out.println("1st window title"+title2);
		Set<String> handles = drive.getWindowHandles();
		List<String>window=new ArrayList<String>(handles);
		drive.switchTo().window(window.get(1));
		System.out.println("2nd window title is "+drive.getTitle());
		Thread.sleep(2000);
		drive.findElement(By.xpath("//span[text()='180ml']")).click();
		Thread.sleep(2000);
		String mrp = drive.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]")).getText();
		System.out.println("Price of shampoo = "+mrp);
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		drive.findElement(By.xpath("//span[@class='cart-count']")).click();
		drive.switchTo().frame(0);
		String text2 = drive.findElement(By.xpath("//div[@class='css-1mx04mv e25lf6d3']")).getText();
		System.out.println("Total cost of shampoo = "+text2);
		drive.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']")).click();
		
	}

}
