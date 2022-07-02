package com.app.locators;

import com.app.pageexecution.LoginPageExecution;

public class SearchHotelLocators extends LoginPageExecution{
	
		public static String location = "location";  
		public static String hotels = "hotels";  
		public static String roomtype = "//select[@id='room_type']";   
		public static String noofrooms ="//select[@name='room_nos']";  
		public static String checkin = "datepick_in";  
		public static String checkout = "datepick_out";  
		public static String adultroom = "adult_room"; 
		public static String childroom = "child_room"; 
		public static String searchbutton = "//input[@type='submit']";
}
