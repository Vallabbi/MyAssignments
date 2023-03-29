package testcase;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{
@Test(dataProvider = "fetchData")
	public  void createLead(String name1,String name2,String name3,String name4) {
	    driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(name1);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name2);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(name3);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(name4);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider(name="fetchData")
public String[][] getdata() {
    String [][] data =new String[2][4];
    //1st set
    data[0][0]="Amazon";
    data[0][1]="Vallabbi";
    data[0][2]="Pattabiraman";
    data[0][3]="99";
    
    //2nd set
        data[1][0]="Testleaf";
        data[1][1]="Abi";
        data[1][2]="S";
        data[1][3]="98";
    
    return data;
}

}






