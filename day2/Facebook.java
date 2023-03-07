package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver drive=new ChromeDriver();
drive.get("https://en-gb.facebook.com");
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
drive.findElement(By.linkText("Create new account")).click();
drive.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vallabbi");
drive.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pattabiraman");
drive.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9012345678");
drive.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("vallabbi##7");
drive.findElement(By.xpath("//select[@id='day']")).click();
drive.findElement(By.xpath("//option[text()='9']")).click();
drive.findElement(By.xpath("//select[@id='month']")).click();
drive.findElement(By.xpath("//option[text()='May']")).click();
drive.findElement(By.xpath("//select[@id='year']")).click();
drive.findElement(By.xpath("//option[text()='1994']")).click();
drive.findElement(By.xpath("//label[text()='Female']")).click();
Thread.sleep(7000);
drive.quit();
	}

}
