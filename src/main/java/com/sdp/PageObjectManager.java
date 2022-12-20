package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.BookA_Hotel;
import com.pom.HotelSearchingPage;
import com.pom.HotelSelect;
import com.pom.LogOut;
import com.pom.LoginPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private LoginPage lp;
	
	private HotelSearchingPage hsp;
	
	private HotelSelect hs;
	
	private BookA_Hotel bh;
	
	private LogOut lg;
	
	public PageObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public LoginPage getInstanceLogin() {
		
		if (lp == null) {
			
			lp = new LoginPage(driver);
		}
		
		return lp;
	}
	
	public HotelSearchingPage getInstanceHotelSearch() {
		
		if (hsp == null) {
			
			hsp = new HotelSearchingPage(driver);
		} 
		
		return hsp;
	}
	
	public HotelSelect getInstanceHotelSelect() {
		
		if (hs == null) {
			
			hs = new HotelSelect(driver);
		}
		
		return hs;
	}
	
	public BookA_Hotel getinstanceBookHotel() {
		
		if (bh == null) {
			
			bh = new BookA_Hotel(driver);
		}
		
		return bh;
	}
	
	public LogOut getInstanceLogOut() {
		
		if (lg == null) {
			
			lg = new LogOut(driver);
		}
		
		return lg;
	}
	
}
