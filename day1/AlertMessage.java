package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertMessage {
public static void main(String[] args) {
	EdgeDriver drive=new EdgeDriver();
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	drive.get("https://leafground.com/alert.xhtml");
	drive.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
Alert alert = drive.switchTo().alert();
String text = alert.getText();
System.out.println(text);
alert.sendKeys("Vallabbi");
alert.accept();
String text2 = drive.findElement(By.xpath("//span[@id='confirm_result']")).getText();
System.out.println(text2);
}
}
