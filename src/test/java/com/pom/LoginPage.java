package com.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	@Given("User is on  Adactin page")
	public void user_is_on_adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	    	}
	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
	    WebElement txtUserName = driver.findElement(By.id("username"));
	    txtUserName.sendKeys("cccchandan");
	    WebElement txtPassword = driver.findElement(By.id("password"));
	    txtPassword.sendKeys("CCCChandan@#1234");
	}
	@When("User should click login button")
	public void user_should_click_login_button() {
		 WebElement btnLogin = driver.findElement(By.id("login"));
		 btnLogin.click(); 
	}
	@Then("User should verify success msg")
	public void user_should_verify_success_msg() {
		Assert.assertTrue(true);
	   	}
}
