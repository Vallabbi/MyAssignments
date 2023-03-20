package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafMergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver drive=new ChromeDriver(option);
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.findElement(By.id("username")).sendKeys("demosalesmanager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.partialLinkText("Contacts")).click();
		drive.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		String handle = drive.getWindowHandle();
		System.out.println(handle);
		System.out.println(drive.getTitle());
		Set<String> handles = drive.getWindowHandles();
		List<String>merge=new ArrayList<String>(handles);
		drive.switchTo().window(merge.get(1));
		System.out.println(drive.getTitle());
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
        drive.switchTo().window(merge.get(0));
		System.out.println(drive.getTitle());
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		String handle1 = drive.getWindowHandle();
		System.out.println(handle1);
		System.out.println(drive.getTitle());
		Set<String> handles1 = drive.getWindowHandles();
		List<String>merge1=new ArrayList<String>(handles1);
		drive.switchTo().window(merge1.get(1));
		System.out.println(drive.getTitle());
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		drive.switchTo().window(merge.get(0));
		System.out.println(drive.getTitle());
		Thread.sleep(2000);
		drive.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = drive.switchTo().alert();
		alert.accept();
		System.out.println(drive.getTitle());
		drive.quit();
		}

}
