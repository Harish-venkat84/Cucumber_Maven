package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookA_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement acNum;
	
	@FindBy(id = "cc_type")
	private WebElement cardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cardExpMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement cardExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cardCvv;
	
	@FindBy(id = "book_now")
	private WebElement bookNow;
	
	public BookA_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAcNum() {
		return acNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}

	public WebElement getCardExpYear() {
		return cardExpYear;
	}

	public WebElement getCardCvv() {
		return cardCvv;
	}
	
	public WebElement getBookNow() {
		return bookNow;
	}
	
	

}
