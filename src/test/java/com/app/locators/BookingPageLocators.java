package com.app.locators;

import com.app.pageexecution.LoginPageExecution;

public class BookingPageLocators extends LoginPageExecution{
	
	public static String firstname = "first_name"; 
	public static String lastname = "last_name"; 
	public static String address = "//textarea[@name='address']"; 
	public static String cardnumber = "cc_num"; 
	public static String cardtype = "cc_type"; 
	public static String month = "cc_exp_month"; 
	public static String year = "cc_exp_year"; 
	public static String cvv = "cc_cvv"; 
	public static String bookbtn = "//input[@id='book_now']"; 
	public static String orderno = "order_no"; 

}
