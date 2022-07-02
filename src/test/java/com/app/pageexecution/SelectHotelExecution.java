package com.app.pageexecution;

import com.adactin.base.BaseClass;
import com.app.locators.SelectHotelLocators;

public class SelectHotelExecution extends SelectHotelLocators {

	public static void clickRadiobtn() {
		BaseClass.click(BaseClass.findByXpath(SelectHotelLocators.radiobtn));
	}
	public static void clickContinue() {
		BaseClass.click(BaseClass.findByID(SelectHotelLocators.continuebtn));
	}
}
