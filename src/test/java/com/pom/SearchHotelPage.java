package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	WebDriver driver;
	Select select;
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	@FindBy(id="room_nos")
	private WebElement dDnRoomNo;
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement dDnAdultsPerRoom;
	@FindBy(id="child_room")
	private WebElement dDnChildrenPerRoom;
	@FindBy(id="submit")
	private WebElement btnSearch;
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}
	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public void SearchHotel(String location,String hotels,String roomType,String noofRooms,
			String checkInDate,String checkOutDate, String adultsPerRoom,String childrenPerRoom) {
	selectOptionText(getdDnLocation(), location);
	selectOptionText(getdDnHotels(), hotels);
	selectOptionText(getdDnRoomType(), roomType);
	selectOptionText(getdDnRoomNo(), noofRooms);
	type(getTxtCheckInDate(), checkInDate);
	type(getTxtCheckOutDate(), checkOutDate);
	selectOptionText(getdDnAdultsPerRoom(), adultsPerRoom);
	selectOptionText(getdDnChildrenPerRoom(), childrenPerRoom);
	click(getBtnSearch());
	}	
	}

