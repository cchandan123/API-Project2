package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmHotelPage {
	@FindBy(id="order_no")
	private WebElement printOrder;

	
	public WebElement getPrintOrder() {
		return printOrder;
	}


	
}
