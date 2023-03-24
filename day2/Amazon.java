package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver drive=new ChromeDriver(option);
		drive.get("https://www.amazon.in/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
drive.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
drive.findElement(By.id("nav-search-submit-button")).click();
String price = drive.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]")).getText();
System.out.println("Price of first oneplus 9 pro = "+price);
String rating = drive.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
System.out.println("Total customer rating = "+rating);
drive.findElement(By.xpath("//*[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom']")).click();
Thread.sleep(5000);
String text = drive.findElement(By.partialLinkText("5 star")).getAttribute("title");
System.out.println(text);
drive.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
String windowHandle = drive.getWindowHandle();
System.out.println(windowHandle);
String title = drive.getTitle();
System.out.println("Title of first window is "+title);
Set<String> set = drive.getWindowHandles();
List<String> handle=new ArrayList<String>(set);
String title2 = drive.getTitle();
System.out.println("Second window is "+title2);
drive.switchTo().window(handle.get(1));
File screenshot = drive.getScreenshotAs(OutputType.FILE);
File photo=new File("./snap/oneplus.png");
FileUtils.copyFile(screenshot, photo);
drive.findElement(By.id("add-to-cart-button")).click();
String total = drive.findElement(By.xpath("(//div[@class='a-row a-spacing-none'])[3]")).getText();
System.out.println(total);
if (price!=(total)) {
	System.out.println("Cart subtotal verified.");
}
drive.quit();
	}

}
