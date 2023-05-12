package com.Actitime.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.POM.HomePage;
import com.Actitime.POM.TaskPage;

public class Task extends Baseclass{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
//		Reporter.log("Customer created Successfully", true);
		HomePage hp = new HomePage(dr);
		hp.getTaskbtn().click();
		TaskPage tp = new TaskPage(dr);
		tp.getAddbtn().click();
		tp.getNewCustomerbtn().click();
		FileLibrary f = new FileLibrary();
		String value = f.readDataFromExcel("Sheet1", 1, 1);
		tp.getCustNameTextField().sendKeys(value);
		
		String value2 = f.readDataFromExcel("Sheet1", 2, 2);
		tp.getCustDescriptField().sendKeys(value2);
		tp.getCustCreatebtn().click();
		
		String src = value;
		String dest = tp.getGetText().getText();
		SoftAssert s = new SoftAssert();
		s.assertEquals(src, dest);
		s.assertAll();		
	}
}
