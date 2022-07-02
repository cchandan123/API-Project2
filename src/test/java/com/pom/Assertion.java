package com.pom;

import com.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Assertion extends BaseClass{
	public Assertion() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")
	private WebElement astName;

	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement astSelectHotel;

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement astBookAHotel;

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement astBookingConfirmation;

	@FindBy(xpath = "//label[text()='Please Enter your First Name']")
	private WebElement astFirstName;

	@FindBy(xpath = "//label[text()='Please Enter you Last Name']")
	private WebElement astLastName;

	@FindBy(xpath = "//label[text()='Please Enter your Address']")
	private WebElement astEnterAddress;

	@FindBy(xpath = "//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private WebElement astCreditCardNumber;

	@FindBy(xpath = "//label[text()='Please Select your Credit Card Type']")
	private WebElement astCreditCardType;

	@FindBy(xpath = "Please Select your Credit Card Expiry Month")
	private WebElement astCreditCardExpiry;

	@FindBy(xpath = "//label[text()='Please Enter your Credit Card CVV Number']")
	private WebElement astCreditCardCVV;

	public WebElement getAstName() {
		return astName;
	}

	public WebElement getAstSelectHotel() {
		return astSelectHotel;
	}

	public WebElement getAstBookAHotel() {
		return astBookAHotel;
	}

	public WebElement getAstBookingConfirmation() {
		return astBookingConfirmation;
	}

	public WebElement getAstFirstName() {
		return astFirstName;
	}

	public WebElement getAstLastName() {
		return astLastName;
	}

	public WebElement getAstEnterAddress() {
		return astEnterAddress;
	}

	public WebElement getAstCreditCardNumber() {
		return astCreditCardNumber;
	}

	public WebElement getAstCreditCardType() {
		return astCreditCardType;
	}

	public WebElement getAstCreditCardExpiry() {
		return astCreditCardExpiry;
	}

	public WebElement getAstCreditCardCVV() {
		return astCreditCardCVV;
	}

	public void verificationId(String name) {
		String t1 = getattribute(getAstName());
		Assert.assertEquals(t1, name);
	}

	public void verificationSelect(String select) {
		String t2 = gettext(getAstSelectHotel());
		Assert.assertEquals(t2, select);
	}

	public void verificationBook(String book) {
		String t3 = gettext(getAstBookAHotel());
		Assert.assertEquals(t3, book);
	}

	public void verificationBooking(String booking) {
		String t4 = gettext(getAstBookingConfirmation());
		Assert.assertEquals(t4, booking);
	}

	public void verifyEmptyBox(String firstname, String lastname, String address, String enterCCNo, String ccType,
			String exp, String cvvNo) {
		String first = gettext(getAstFirstName());
		Assert.assertEquals(firstname, first);

		String last = gettext(getAstLastName());
		Assert.assertEquals(lastname, last);

		String add = gettext(getAstEnterAddress());
		Assert.assertEquals(address, add);

		String ccNo = gettext(getAstCreditCardNumber());
		Assert.assertEquals(enterCCNo, ccNo);

		String ccT = gettext(getAstCreditCardType());
		Assert.assertEquals(ccType, ccT);

		String expiry = gettext(getAstCreditCardExpiry());
		Assert.assertEquals(exp, expiry);

		String cvv = gettext(getAstCreditCardCVV());
		Assert.assertEquals(cvvNo, cvv);
	}

}
