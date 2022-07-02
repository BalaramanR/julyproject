package com.app.mainexecution;

import org.junit.Test;

import com.adactin.base.BaseClass;
import com.app.pageexecution.BookingPageExecution;
import com.app.pageexecution.LoginPageExecution;
import com.app.pageexecution.SearchHotelExecution;
import com.app.pageexecution.SelectHotelExecution;

public class ExecutionClass extends BookingPageExecution {
	
	

	@Test
	public void test() {
				
		BaseClass.loadDriver();
		BaseClass.loadurl("https://adactinhotelapp.com/");
		LoginPageExecution.username();
		LoginPageExecution.password();
		LoginPageExecution.login();
		SearchHotelExecution.location();
		SearchHotelExecution.hotels();
		SearchHotelExecution.roomtype();
		SearchHotelExecution.noofrooms();
		SearchHotelExecution.checkin();
		SearchHotelExecution.checkout();
		SearchHotelExecution.adultroom();
		SearchHotelExecution.childroom();
		SearchHotelExecution.searchbutton();
		SelectHotelExecution.clickRadiobtn();
		SelectHotelExecution.clickContinue();
		BookingPageExecution.firstname();
		BookingPageExecution.lastname();
		BookingPageExecution.address();
		BookingPageExecution.cardnumber();
		BookingPageExecution.cardtype();
		BookingPageExecution.month();
		BookingPageExecution.year();
		BookingPageExecution.cvv();
		BookingPageExecution.bookbtn();
		BookingPageExecution.orderno();
		BaseClass.close();
	}

	
	}



