package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandling {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
ChromeDriver drive=new ChromeDriver(option);
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
drive.get("https://www.leafground.com/window.xhtml");
drive.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
drive.findElement(By.xpath("//i[@class='pi pi-fw pi-stop layout-menuitem-icon']")).click();
WebElement element = drive.findElement(By.xpath("//iframe[@src='default.xhtml']"));
drive.switchTo().frame(element);
drive.findElement(By.xpath("(//button[@id='Click'])[1]")).click();
String text = drive.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();
System.out.println("first frame text is "+text);
drive.switchTo().defaultContent();
WebElement element2 = drive.findElement(By.xpath("//iframe[@src='page.xhtml']"));
drive.switchTo().frame(element2);
drive.switchTo().frame("frame2");
drive.findElement(By.xpath("//button[text()='Click Me']")).click();
String text2 = drive.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
System.out.println("Nested frame text is "+text2);
drive.switchTo().defaultContent();
drive.switchTo().parentFrame();
drive.switchTo().defaultContent();
WebElement element3 = drive.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
drive.switchTo().frame(element3);
drive.findElement(By.xpath("//button[text()='Count Frames']")).click();
String text3 = drive.findElement(By.xpath("//button[text()='Count Frames']")).getText();
System.out.println(text3);
drive.switchTo().defaultContent();
drive.switchTo().parentFrame();
Thread.sleep(2000);
drive.quit();
}
}
