package com.pe.SeleniumRelated;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	public String path ;
	public XSSFWorkbook workbook ;
	public XSSFSheet sheet ;
	XSSFRow row ;
	XSSFCell cell ;
	public FileInputStream fis ;
	
	public ExcelReader(String path) {
		this.path = path ;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String[][] getExcelData(String excelName,String sheetName) {
		sheet = workbook.getSheet(sheetName);
		int totalRows = sheet.getLastRowNum() + 1 ;
		int totalCols = sheet.getRow(0).getLastCellNum();
		String dataSets[][] = new String[totalRows - 1][totalCols] ;
		
		for(int i=0; i< totalRows; i++) {
			row = sheet.getRow(i);
			for(int j=0 ; j<totalCols; j++) {
				cell = row.getCell(j);
				
				if(cell.getCellType()==CellType.NUMERIC) {
					String cellText = String.valueOf(cell.getNumericCellValue());
					dataSets[i-1][j]= cellText ;
				}
				else if(cell.getCellType() == CellType.BLANK) {
					dataSets[i-1][j] =  "" ;
				}
				else if(cell.getCellType() == CellType.BOOLEAN) {
					dataSets[i-1][j] = String.valueOf(cell.getBooleanCellValue());
				}
				else if(cell.getCellType() == CellType.STRING) {
					dataSets[i-1][j] = cell.getStringCellValue();
				}
			}
		}
		
		return dataSets ;
	}
}
