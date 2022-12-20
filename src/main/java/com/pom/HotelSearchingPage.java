package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchingPage {

		
		public WebDriver driver;
		
		@FindBy(id = "location")
		private WebElement locat;
		
		@FindBy(id = "hotels")
		private WebElement hotel;
		
		@FindBy(id = "room_type")
		private WebElement room;
		
		@FindBy(id = "room_nos")
		private WebElement nos;

		@FindBy(id = "datepick_in")
		private WebElement dayCI;
		
		@FindBy(id = "datepick_out")
		private WebElement dayco;
		
		@FindBy(id = "adult_room")
		private WebElement adultRoom;
		
		@FindBy(id = "child_room")
		private WebElement choldRoom;
		
		@FindBy(id = "Submit")
		private WebElement submit;
		
		public HotelSearchingPage(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getLocat() {
			return locat;
		}

		public WebElement getHotel() {
			return hotel;
		}

		public WebElement getRoom() {
			return room;
		}

		public WebElement getNos() {
			return nos;
		}

		public WebElement getdayCI() {
			return dayCI;
		}
		
		public WebElement getDayco() {
			return dayco;
		}
		
		public WebElement getAdultRoom() {
			return adultRoom;
		}

		public WebElement getCholdRoom() {
			return choldRoom;
		}

		public WebElement getSubmit() {
			return submit;
		}
		
		
		
		
		
}
