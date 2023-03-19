package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	// To Store Generic Reuseable Methods
	
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of file.
		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read
		Sheet sheet = wb.getSheet(sheetName);// get into the sheet
		Row row = sheet.getRow(rowCount);//get the desired row
		Cell cell = row.getCell(cellCount);//get the desired col/cell
		String data = cell.getStringCellValue();// read the data from cell 
		return data;
	}

}
