package com.step;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.MavinProject1.BaseClass;
import com.sdp.PageObjectManager;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static Logger logger = LogManager.getLogger(StepDefinition.class.getName());
	
// password : W18KU0
	
	@AfterStep
	public static void takescreenshot(Scenario scenario) {
		
		String name = scenario.getName();
		
		logger.info("scenario Name :"+name);
		
		if (scenario.isFailed()) {
			
			logger.error("Scenario Fail : "+name);
				
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
			scenario.attach(screenshot, "image/png", "imagepass");
		
		}
		
		Status status = scenario.getStatus();
			
		logger.info("scenario status :"+status);
	}
	

	@Given("user Must Launch {string} In The Url Field")
	public void user_must_launch_in_the_url_field(String url) {
		
		urlLaunch(url);
	}

	@When("user Enter The {string} In The Username Field")
	public void user_enter_the_in_the_username_field(String username) {
	
		sendKeys(pom.getInstanceLogin().getUsername(),username);
	
	}

	@When("user Enter The {string} In The Password Field")
	public void user_enter_the_in_the_password_field(String pass) {
		
		sendKeys(pom.getInstanceLogin().getPass(),pass);
	}

	@Then("user Click The LoginButton and It Navigates To The Search Hoterl Page")
	public void user_click_the_login_button_and_it_navigates_to_the_search_hoterl_page() {
		
		Click(pom.getInstanceLogin().getLoginbut());
	}

	@When("user Select The {string} On The Location DropDown")
	public void user_select_the_on_the_location_drop_down(String location) {
		
		selectByVisibleText(pom.getInstanceHotelSearch().getLocat(), location);
	}

	@When("user Select The {string} On The Hotel DropDown")
	public void user_select_the_on_the_hotel_drop_down(String hotel) {
		
		selectByVisibleText(pom.getInstanceHotelSearch().getHotel(), hotel);
	}

	@When("user Select The {string} On The Room Type DropDown")
	public void user_select_the_on_the_room_type_drop_down(String getroom) {
		
		selectByValue(pom.getInstanceHotelSearch().getRoom(), getroom);
	}

	@When("user Select The {string} On The Number Of Room DropDown")
	public void user_select_the_on_the_number_of_room_drop_down(String getnos) {
		
		selectByVisibleText(pom.getInstanceHotelSearch().getNos(), getnos);
	}

	@When("user Select The {string} On The Adult Per Room DropDown")
	public void user_select_the_on_the_adult_per_room_drop_down(String getadultRoom) {
		
		selectByValue(pom.getInstanceHotelSearch().getAdultRoom(), getadultRoom);
	}

	@When("user Select The {string} On The Childern Per Room DropDown")
	public void user_select_the_on_the_childern_per_room_drop_down(String getchildRoom) {
		
		selectByValue(pom.getInstanceHotelSearch().getCholdRoom(), getchildRoom);
	}

	@Then("user Click The SearchButton and It Navigate To The Hotel Search Page")
	public void user_click_the_search_button_and_it_navigate_to_the_hotel_search_page() {
		
		Click(pom.getInstanceHotelSearch().getSubmit());
	}
	
	@When("user Select The Hotel On The Select Hotel Field")
	public void user_select_the_hotel_on_the_select_hotel_field() {
		
		Click(pom.getInstanceHotelSelect().getSelect());
	}

	@Then("user Click ContinueButton and It Navigates To The Book A Hotel Page")
	public void user_click_continue_button_and_it_navigates_to_the_book_a_hotel_page() {
		
		Click(pom.getInstanceHotelSelect().getContinues());
	}
	
	@When("user Enter {string} In The First Name Field")
	public void user_enter_in_the_first_name_field(String getfirstName) {
		
		sendKeys(pom.getinstanceBookHotel().getFirstName(), getfirstName);
	}

	@When("user Enter The {string} In The Last Name Field")
	public void user_enter_the_in_the_last_name_field(String getlastName) {
		
		sendKeys(pom.getinstanceBookHotel().getLastName(), getlastName);
	}

	@When("user Enter The {string} In The Address Field")
	public void user_enter_the_in_the_address_field(String getaddress) {
		
		sendKeys(pom.getinstanceBookHotel().getAddress(), getaddress);
	}

	@When("user Enter The {string} In The Credit Card Number Field")
	public void user_enter_the_in_the_credit_card_number_field(String getcadNo) {
		
		sendKeys(pom.getinstanceBookHotel().getAcNum(), getcadNo);
	}

	@When("user Enter The {string} In The Credit Card Type DropDown")
	public void user_enter_the_in_the_credit_card_type_drop_down(String getcardType) {
		
		selectByValue(pom.getinstanceBookHotel().getCardType(), getcardType);
	}

	@When("user Enter The {string} on The Expiry Month DropDowm")
	public void user_enter_the_on_the_expiry_month_drop_dowm(String getcardExpMon) {
		
		selectByValue(pom.getinstanceBookHotel().getCardExpMonth(), getcardExpMon);
	}

	@When("user Enter The {string} In The Expiry Year DropDowm")
	public void user_enter_the_in_the_expiry_year_drop_dowm(String cardExpYear) {
		
		selectByValue(pom.getinstanceBookHotel().getCardExpYear(), cardExpYear);
	}

	@When("user Enter The {string} In The CVV Number Field")
	public void user_enter_the_in_the_cvv_number_field(String getcardcvv) {
		
		sendKeys(pom.getinstanceBookHotel().getCardCvv(), getcardcvv);
	}

	@Then("user Click The Book Now button and It Navigates To Booking Confirmation Page")
	public void user_click_the_book_now_button_and_it_navigates_to_booking_confirmation_page() {
		
		Click(pom.getinstanceBookHotel().getBookNow());
	}

	@Then("user Click LogOut button It Navigates To You Have Successfully Logged Out")
	public void user_click_log_out_button_it_navigates_to_you_have_successfully_logged_out() throws IOException {
	
		explicitWait(10, "logout");
		
		Click(pom.getInstanceLogOut().getLogout());
	}
}
