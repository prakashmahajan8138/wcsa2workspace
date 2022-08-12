package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//generic reusable method
	public String readExceldata(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
		
	}
	
	//generic reusable method to get the row count from excel file
	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
		
	}
	
	//generic reusable method to write the data in excel file
	
	public void writeDataExcel(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);//make file ready for read operation
		Sheet sh = wb.getSheet(sheetName);//go to specified sheet
		Row row = sh.getRow(rowCount);//go to the specified row
		
		Cell cell = row.createCell(cellCount);//create cell
		cell.setCellValue(data);	//send the data
		
		FileOutputStream fos = new FileOutputStream(excelPath);//specify path of excel file
		wb.write(fos);//write the data
	}
	
	
	
	
	
	
	
	
	
}
