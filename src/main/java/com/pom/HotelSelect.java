package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelect {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(id = "continue")
	private WebElement continues;

	public HotelSelect(WebDriver driver1) {
		
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinues() {
		return continues;
	}
	
	
	
	
	

}
