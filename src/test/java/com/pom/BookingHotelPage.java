package com.pom;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gherkin.ast.DataTable;


import com.base.BaseClass;

public class BookingHotelPage extends BaseClass {
	
	public BookingHotelPage() {
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddresss;

	@FindBy(id = "cc_num")
	private WebElement txtCreditCard;

	@FindBy(id = "cc_type")
	private WebElement dDnCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement dDnMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement dDnYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvv;

	@FindBy(id = "book_now")
	private WebElement btnBook;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddresss() {
		return txtAddresss;
	}
	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}
    public WebElement getdDnCardType() {
		return dDnCardType;
	}
	public WebElement getdDnMonth() {
		return dDnMonth;
	}
	public WebElement getdDnYear() {
		return dDnYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	public void bookingHotelPage(String firstName,String lastName, String Adress,String cccard,String cardType ,String month,String year, String cvv) throws InterruptedException {
		keyvalue(getTxtFirstName(), firstName);
		keyvalue(getTxtLastName(), lastName);
		keyvalue(getTxtAddresss(), Adress);
		keyvalue(getTxtCreditCard(),cccard);
		selectoptiontext(getdDnCardType(), cardType);
		selectoptiontext(getdDnMonth(), month);
		selectoptiontext(getdDnYear(), year);
		keyvalue(getTxtCvv(), cvv);
		click(getBtnBook());
		Thread.sleep(5000);
	}


}

