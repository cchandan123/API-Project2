package com.Stepdefinition;

import com.base.BaseClass;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.pom.Assertion;
import com.pom.BookingHotelPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelectHotelPage;

public class stepdefenition extends BaseClass {
	
	SearchHotelPage searchhotelpage = new SearchHotelPage();
	Assertion a;

	@Given("User is on the Adactinhotel page")
	public void user_is_on_the_Adactinhotel_page() {

	}

	@When("User perform login {string} and {string}")
	public void user_perform_login_and(String username, String password) {
//		LoginPage l = new LoginPage();
//		l.login(username, password);
	}

	@When("User should verify {string}")
	public void user_should_verify(String actual) {
		a = new Assertion();
		a.verificationId(actual);

	}

	@When("User should search hotel {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_search_hotel_and(String location, String hotels, String roomType, String noOfRooms,
			String CheckInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom)
			throws InterruptedException {
		SearchHotelPage s = new SearchHotelPage();
		s.SearchHotel(location, hotels, roomType, noOfRooms, CheckInDate, checkOutDate, adultsPerRoom,
				childrenPerRoom);
	}

	@When("User should verify the {string}")
	public void user_should_verify_the(String string) {
		a = new Assertion();
		a.verificationSelect(string);

	}

	@When("User should book hotel")
	public void user_should_book_hotel() throws InterruptedException {
		SelectHotelPage s = new SelectHotelPage();
		s.selectHotelPage();
	}

	@When("User should verify a {string}")
	public void user_should_verify_a(String string) {
		a = new Assertion();
		a.verificationBook(string);

	}

	@When("User should fill book hotel details {string},{string},{string} and payment")
	public void user_should_fill_book_hotel_details_and_payment(String firstName, String lastName, String Adress,
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		BookingHotelPage b = new BookingHotelPage();

		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		String creditCardNo = map.get("creditCardNo");
		String creditCardType = map.get("creditCardType");
		String selectMonth = map.get("selectMonth");
		String selectYear = map.get("selectYear");
		String cvvNumber = map.get("cvvNumber");
		b.bookHotel(firstName, lastName, Adress, creditCardNo, creditCardType, selectMonth, selectYear, cvvNumber);
	}

	@Then("user should verify in {string}")
	public void user_should_verify_in(String string) {
		a = new Assertion();
		a.verificationBooking(string);
	}

	@When("User should click book")
	public void user_should_click_book() {
		WebElement booknow = findElementById("book_now");
		click(booknow);
	}

	@Then("User should verify in {string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_verify_in_and(String firstname, String lastname, String address, String enterCCNo,
			String ccType, String exp, String cvvNo) {
		a = new Assertion();
		a.verifyEmptyBox(firstname, lastname, address, enterCCNo, ccType, exp, cvvNo);

	}

}



