package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.POM.HomePage;
import com.Actitime.POM.LogInPage;

public class Baseclass {
	public static WebDriver dr;
	FileLibrary fl = new FileLibrary();
	@BeforeSuite
		public void databaseconnection() {
			Reporter.log("Database is connected",true);
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//taking url from property file
		String URL = fl.readDataFromPropertyFile("url");
		dr.get(URL);
		Reporter.log("Browser Launched",true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String user = fl.readDataFromPropertyFile("username");//taking username from property file
//		dr.findElement(By.id("username")).sendKeys(user);
		String pass = fl.readDataFromPropertyFile("password");//taking password from property file
//		dr.findElement(By.name("pwd")).sendKeys(pass);
//		dr.findElement(By.xpath("//div[.='Login ']")).click();
		LogInPage lp = new LogInPage(dr);
		lp.getUntbx().sendKeys(user);
		lp.getPwbx().sendKeys(pass);
		lp.getLgbtx().click();
		Reporter.log("Logged in successfully",true);
	}

	@AfterMethod
	public void logout() {
		HomePage hp = new HomePage(dr);
		hp.getLgbtn().click();
		Reporter.log("Successfully logged Out",true);
	}
		
	@AfterClass
	public void closeBrowser() {
		dr.close();
		Reporter.log("Browser Closed",true);
	}
		
	@AfterSuite
	public void databasedisconnected() {
		Reporter.log("Database is disconnected",true);
	}
}
