package com.app.pageexecution;

import com.adactin.base.BaseClass;
import com.app.locators.BookingPageLocators;

public class BookingPageExecution extends BookingPageLocators {
	
	public static void firstname() {
		BaseClass.typeData(BaseClass.findByName(BookingPageLocators.firstname), BaseClass.excelRead(8, 2));
	}
	public static void lastname() {
		BaseClass.typeData(BaseClass.findByName(BookingPageLocators.lastname), BaseClass.excelRead(9, 2));
	}
	public static void address() {
		BaseClass.typeData(BaseClass.findByXpath(BookingPageLocators.address), BaseClass.excelRead(10, 2));
	}
	public static void cardnumber() {
		BaseClass.typeData(BaseClass.findByID(BookingPageLocators.cardnumber), BaseClass.excelRead(11, 2));
	}
	public static void cardtype() {
		BaseClass.typeData(BaseClass.findByID(BookingPageLocators.cardtype), BaseClass.excelRead(12, 2));
	}
	public static void month() {
		BaseClass.typeData(BaseClass.findByID(BookingPageLocators.month), BaseClass.excelRead(13, 2));
	}
	public static void year() {
		BaseClass.typeData(BaseClass.findByID(BookingPageLocators.year), BaseClass.excelRead(13, 3));
	}
	public static void cvv() {
		BaseClass.typeData(BaseClass.findByName(BookingPageLocators.cvv), BaseClass.excelRead(14, 2));
	}
	public static void bookbtn() {
		BaseClass.click(BaseClass.findByXpath(BookingPageLocators.bookbtn));
	}
	public static void orderno() {
		BaseClass.scroll(0, 1500);
		String attribute = BaseClass.getAttribute(BaseClass.findByID(BookingPageLocators.orderno), "value");
		BaseClass.excelWrite(attribute);
	}
}
