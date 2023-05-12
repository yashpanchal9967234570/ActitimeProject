package com.Actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskbtn;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportbtn;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userbtn;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement lgbtn;
	
	
	//initialization
	public HomePage(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}


	
	//Utilization
	public WebElement getTaskbtn() {
		return taskbtn;
	}


	public WebElement getReportbtn() {
		return reportbtn;
	}


	public WebElement getUserbtn() {
		return userbtn;
	}


	public WebElement getLgbtn() {
		return lgbtn;
	}
}
