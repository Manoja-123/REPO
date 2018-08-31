package Package1;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteExcel_test {

		static int colvalue;
	
	
		public void readexcel() throws IOException {
		
		String filepath="D:\\Automation_Training\\Userlogin\\src\\test\\java\\TestData\\TestData.xls";
		FileInputStream fis=new FileInputStream(filepath);
		
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		 
		 HSSFSheet sheet=workbook.getSheetAt(0);
		// System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		 
		 int rowcount=sheet.getLastRowNum();
		 System.out.println("no of rows:"+rowcount);
		
		 
		 for (int i=1;i<=rowcount;i++)
		 {
			 colvalue=sheet.getRow(i).getLastCellNum();
			 for(int j=0;j<colvalue;j++) {
				 
				String s1= sheet.getRow(i).getCell(j).toString();
				
				System.out.println(s1);
				
		}
			 
			 String username=sheet.getRow(i).getCell(1).toString();
			 String pwd=sheet.getRow(i).getCell(2).toString();
			 
		 System.out.println(username);
			 System.out.println(pwd);
			
		 }
		 }
	}

