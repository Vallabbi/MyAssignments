package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	public String excelFile;
	@Parameters({"browser","url","username","password"})
@BeforeMethod

public void precondition(String browser,String url,String username,String password) {
		switch(browser) {
		case "chrome":{
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
			 driver = new ChromeDriver(option);
			 break;
		}
		case "Edge":{
			driver=new EdgeDriver();
			break;
		}
		}
	
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
}
		@AfterMethod
public void postcondition() {
	driver.close();
}
		@DataProvider(name="fetchData")
		public String[][] getdata() throws IOException {
		   String[][] inputData = ReadExcel.readData(excelFile);
		    return inputData;
}
}