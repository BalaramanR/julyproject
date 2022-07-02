package com.app.pageexecution;

import com.adactin.base.BaseClass;
import com.app.locators.SearchHotelLocators;

public class SearchHotelExecution extends SearchHotelLocators{
	
	public static void location() {
		BaseClass.typeData(BaseClass.findByID(SearchHotelLocators.location), BaseClass.excelRead(1, 2));
	}
public static void hotels() {
	BaseClass.typeData(BaseClass.findByID(SearchHotelLocators.hotels), BaseClass.excelRead(2, 2));
}
public static void roomtype() {
	BaseClass.typeData(BaseClass.findByXpath(SearchHotelLocators.roomtype), BaseClass.excelRead(3, 2));
}
public static void noofrooms() {
	BaseClass.typeData(BaseClass.findByXpath(SearchHotelLocators.noofrooms), BaseClass.excelRead(4, 2));
}
public static void checkin() {
	
	BaseClass.typeData(BaseClass.findByName(SearchHotelLocators.checkin), BaseClass.excelRead(5, 2));
	
}
public static void checkout() {
	
	BaseClass.typeData(BaseClass.findByName(SearchHotelLocators.checkout), BaseClass.excelRead(5, 3));
}
public static void adultroom() {
	BaseClass.typeData(BaseClass.findByID(SearchHotelLocators.adultroom), BaseClass.excelRead(6, 2));
}
public static void childroom() {
	BaseClass.typeData(BaseClass.findByID(SearchHotelLocators.childroom), BaseClass.excelRead(7, 2));
}
public static void searchbutton() {
	BaseClass.click(BaseClass.findByXpath(SearchHotelLocators.searchbutton));
}

}
