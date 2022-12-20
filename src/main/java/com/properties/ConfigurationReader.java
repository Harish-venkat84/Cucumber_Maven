package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		
		File fs = new File ("D:\\New folder (2)\\Eclipse\\Maven"
				+ "\\MavinProject1\\src\\main\\java\\com\\properties\\Adactin.Properties");
		
		FileInputStream is = new FileInputStream(fs);
		
		p = new Properties();
		
		p.load(is);
	}
	
	public String geturl() {
		
		String url = p.getProperty("url");
		
		return url;
	}
	
	public String getusername() {
		
		String username = p.getProperty("username");
		
		return username;
	}
	
	public String getpass() {
		
		String pass = p.getProperty("pass");
		
		return pass;
	}
	
	public String getLocation() {
		
		String location = p.getProperty("location");
		
		return location;
	}
	
	public String gethotel() {
		
		String hotel = p.getProperty("hotel");
		
		return hotel;
	}
	
	public String getroom() {
		
		String room = p.getProperty("room");
		
		return room;
	}
	
	public String getnos() {
		
		String nos = p.getProperty("nos");
		
		return nos;
	}
	
	public String getdateCi() {
		
		String dateCi = p.getProperty("dateCi");
		
		return dateCi;
	}
	
	public String getdateCo() {
		
		String dateCo = p.getProperty("dateCo");
		
		return dateCo;
	}
	
	public String getadultRoom() {
		
		String adultRoom = p.getProperty("adultRoom");
		
		return adultRoom;
	}
	
	public String getchildRoom() {
		
		String childRoom = p.getProperty("childRoom");
		
		return childRoom;
	}
	
	public String getfirstName() {
		
		String firstName = p.getProperty("firstName");
		
		return firstName;
	}
	
	public String getlastName() {
		
		String lastName = p.getProperty("lastName");
		
		return lastName;
	}
	
	public String getaddress() {
		
		String address = p.getProperty("address");
		
		return address;
	}
	
	public String getcadNo() {
		
		String cadNo = p.getProperty("cadNo");
		
		return cadNo;
	}
	
	public String getcardType() {
		
		String cardType = p.getProperty("cardType");
		
		return cardType;
	}
	
	public String getcardExpMon() {
		
		String cardExpMon = p.getProperty("cardExpMon");
		
		return cardExpMon;
	}
	
	public String getCardExpYear() {
		
		String CardExpYear = p.getProperty("CardExpYear");
		
		return CardExpYear;
	}
	
	public String getcardcvv() {

		String cardcvv = p.getProperty("cardcvv");
		
		return cardcvv;
	}
	
}
