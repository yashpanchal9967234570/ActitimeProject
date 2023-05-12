package com.Actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	//declaration 
		@FindBy(id = "username")
		private WebElement untbx;
		
		@FindBy(name ="pwd")
		private WebElement pwbx;
		
		@FindBy(xpath = "//div[.='Login ']")
		private WebElement lgbtx;
		
		
		//initialization
		public LogInPage(WebDriver dr) {
			PageFactory.initElements(dr, this);
		}





		//utilization
		public WebElement getUntbx() {
			return untbx;
		}


		public WebElement getPwbx() {
			return pwbx;
		}


		public WebElement getLgbtx() {
			return lgbtx;
		}
		
}
