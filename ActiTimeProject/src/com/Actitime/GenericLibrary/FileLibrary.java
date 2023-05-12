package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic Library class which contains all generic methods
 * @author USER
 *
 */
public class FileLibrary {
	/**
	 * This is a generic methods which is used to read the data from Property File
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fs = new FileInputStream("./TestData/commonData.property");
		Properties p = new Properties();
		p.load(fs);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * This method is a generic method which is used to read data from excel file
	 * @param sheetname
	 * @param ro
	 * @param ce
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname, int ro, int ce) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(ro).getCell(ce).getStringCellValue();
		return value;
	}
}
