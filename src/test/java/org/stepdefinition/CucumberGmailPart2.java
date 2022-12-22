package org.stepdefinition;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberGmailPart2 extends BaseClass {

	WebDriver driver;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		 launchBrowser();
		 windowMaximize();
	}

	@When("To launch the url of gmail application")
	public void to_launch_the_url_of_gmail_application() {
		 launchUrl("https://www.gmail.com/");
	}

	@When("To pass the email data {string} in email field")
	public void to_pass_the_email_data_in_email_field(String em) {
		 WebElement email = driver.findElement(By.id("identifierId"));
		 email.sendKeys(em);
	}

	@When("To click the next button under email field")
	public void to_click_the_next_button_under_email_field() {
		 WebElement emailnext = driver.findElement(By.xpath("//span[text()='Next']"));
		 emailnext.click();
	
	}

	@When("To pass the password data {string} in password field")
	public void to_pass_the_password_data_in_password_field(String pass) {
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys(pass);
	}

	@When("To click the next button under password field")
	public void to_click_the_next_button_under_password_field() {
		 WebElement passnext = driver.findElement(By.xpath("//span[text()='Next']"));
		 passnext.click();
	
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
		 closeEntireBrowser();
	}

}
