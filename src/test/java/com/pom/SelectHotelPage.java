package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		WebDriver diver = null;
		PageFactory.initElements(diver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;

	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public void setbtnContinue(WebElement btnContinue) {
		this.btnContinue = btnContinue;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHotelPage() {
		click(getRadioBtn());
		
		click(getBtnContinue());
	}
}
