package com.Actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	//Declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCustomerbtn;
	
	@FindBy(xpath = "(//input[@placeholder = 'Enter Customer Name'])[2]")
	private WebElement custNameTextField;
	
	@FindBy(xpath = "//textarea[@placeholder = 'Enter Customer Description']")
	private WebElement custDescriptField;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement custCreatebtn;
	
	@FindBy(xpath = "(//div[.='Cancel'])[27]")
	private WebElement custCancelbtn;
	
	@FindBy(xpath = "//div[.='+value+']")
	private WebElement getText;
	
	
	public WebElement getGetText() {
		return getText;
	}


	public void setGetText(WebElement getText) {
		this.getText = getText;
	}


	//initialization
	public TaskPage(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}


	//Utilization 
	public WebElement getAddbtn() {
		return addbtn;
	}


	public WebElement getNewCustomerbtn() {
		return newCustomerbtn;
	}


	public WebElement getCustNameTextField() {
		return custNameTextField;
	}


	public WebElement getCustDescriptField() {
		return custDescriptField;
	}


	public WebElement getCustCreatebtn() {
		return custCreatebtn;
	}


	public WebElement getCustCancelbtn() {
		return custCancelbtn;
	}


	
}
