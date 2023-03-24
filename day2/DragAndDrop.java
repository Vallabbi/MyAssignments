package week4.day2;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver drive=new ChromeDriver(option);
		drive.get("https://jqueryui.com/droppable/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drive.switchTo().frame(0);
		WebElement findElement = drive.findElement(By.xpath("//div[@id='draggable']"));
		WebElement findElement2 = drive.findElement(By.xpath("//div[@id='droppable']"));
		Actions build=new Actions(drive);
		build.dragAndDrop(findElement, findElement2).perform();
		String text = drive.findElement(By.xpath("//div[@id='draggable']")).getText();
		System.out.println(text);
		String text2 = drive.findElement(By.xpath("//div[@id='droppable']")).getText();
		System.out.println(text2);
	}

}
