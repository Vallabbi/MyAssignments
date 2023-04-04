package week6.assignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadShadow {

	public static String[][] readData(String fileName) throws IOException {
		// TODO Auto-generated method stub
		//open my excel
        //Set the path for workbook (file path)
        XSSFWorkbook wb =new XSSFWorkbook("DataExcel/"+fileName+".xlsx");
        //go into sheet based on sheet name
        //XSSFSheet sheet = wb.getSheet("Sheet1");  //input string name
        //Get into the sheet based on index
        XSSFSheet ws = wb.getSheetAt(0);
        //To get the row count
        int rowCount = ws.getLastRowNum();
        short columnCount = ws.getRow(0).getLastCellNum();
        String [][] data =new String[rowCount][columnCount];
        //Get Row
        for (int i = 1; i <=rowCount; i++) {
            XSSFRow row = ws.getRow(i);
        //To get the columnCount
            
            
        //Get my Column
        for(int j=0;j<columnCount;j++) {
       XSSFCell cell = row.getCell(j);
       data[i-1][j]=cell.getStringCellValue();
       //print the particular value
       String cellvalue = cell.getStringCellValue();
       System.out.println(cellvalue);
        }
        }
       
       //close the workbook
       wb.close();
	return data;
        
      
    

}
}
