package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class TestUtil {
	
	static Workbook book;
	static  Sheet sheet;
	static Cell cell;
	/*public  int i;
	public  int k;
	public  int RowNum;*/
	
	public static Object[][] getTestData(String Sheetname) throws IOException
	{		
		String filepath="D:\\Automation_Training\\Userlogin\\src\\test\\java\\TestData\\TestData.xls";
		 FileInputStream fileInputStream= new FileInputStream(filepath); //Excel sheet file location get mentioned here
	        book = new HSSFWorkbook (fileInputStream); //get my workbook 
	        
	        sheet=book.getSheet(Sheetname);// get my sheet from workbook
	      
	        int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
	        //TestUtil.ClearCol("Login", RowNum, 3);
	        
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				//System.out.println(k);
				/* cell = sheet.getRow(i).getCell(k+1);
		            cell.setCellValue("Pass");
		            FileOutputStream outFile =new FileOutputStream(new File("D:\\Automation_Training\\Userlogin\\src\\test\\java\\TestData\\TestData.xls"));
		            book.write(outFile);
		            outFile.close();*/

			}
		}
		return data;
			
	}
	
	public static void writeData(String Sheetname,int RowIndex,int ColIndex,String Data,String colname) throws IOException
	{
		String filepath="D:\\Automation_Training\\Userlogin\\src\\test\\java\\TestData\\TestData.xls";
		 FileInputStream fileInputStream= new FileInputStream(filepath); //Excel sheet file location get mentioned here
	        book = new HSSFWorkbook (fileInputStream); //get my workbook 
	        
	        sheet=book.getSheet(Sheetname);// get my sheet from workbook
	        //Row r =sheet.getRow(RowIndex);
	        cell = sheet.getRow(RowIndex).getCell(ColIndex);
	        sheet.getRow(0).createCell(ColIndex).setCellValue(colname);
	        if(cell==null)
	        {
	        	cell=sheet.getRow(RowIndex).createCell(ColIndex);
	        }
            cell.setCellValue(Data);
            FileOutputStream outFile =new FileOutputStream(new File("D:\\Automation_Training\\Userlogin\\src\\test\\java\\TestData\\TestData.xls"));
            book.write(outFile);
            outFile.close();
        
	}
	
	
}
