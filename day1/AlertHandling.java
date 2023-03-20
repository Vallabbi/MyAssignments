package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHandling {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--disable-notifications");
ChromeDriver drive=new ChromeDriver(option);
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
drive.get("https://www.leafground.com/window.xhtml");
drive.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
drive.findElement(By.xpath("//i[@class='pi pi-fw pi-clone layout-menuitem-icon']")).click();
System.out.println(drive.getTitle());
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
Alert alert2 = drive.switchTo().alert();
String text = alert2.getText();
System.out.println(text);
alert2.accept();
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
Alert alert3 = drive.switchTo().alert();
String text1 = alert3.getText();
System.out.println(text1);
alert3.accept();
Thread.sleep(2000);
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
String text2 = drive.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[1]")).getText();
System.out.println(text2);
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
String text3 = drive.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]")).getText();
System.out.println(text3);
Thread.sleep(2000);
drive.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
Alert alert = drive.switchTo().alert();
alert.sendKeys("Vallabbi Pattabiraman");
System.out.println(alert.getText());
alert.accept();
String text4 = drive.findElement(By.xpath("//span[@id='confirm_result']")).getText();
System.out.println(text4);
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
String text5 = drive.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
System.out.println(text5);
Thread.sleep(2000);
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[9]")).click();
drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
String text6 = drive.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText();
System.out.println(text6);
Thread.sleep(2000);
drive.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
Thread.sleep(2000);
drive.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
Thread.sleep(2000);
drive.findElement(By.xpath("//span[@class='ui-icon ui-icon-plus']")).click();
Thread.sleep(2000);
drive.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
drive.quit();
}
}
