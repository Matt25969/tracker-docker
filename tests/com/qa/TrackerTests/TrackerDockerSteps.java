package com.qa.TrackerTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.TrackerPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TrackerDockerSteps {
	
	public WebDriver driver;

	TrackerPage page = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/tools/selenium/chromedriver.exe");

		driver = new ChromeDriver();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}
	
	@After
	public void teardown() {

			driver.close();
			driver.quit();

	}

	@Given("^I am on the dashboard page$")
	public void i_am_on_the_dashboard_page() {

		driver.get("http://192.168.99.100:8080/#/dashboard");
		page = PageFactory.initElements(driver, TrackerPage.class);
	}

	@When("^I press the trainer button$")
	public void i_press_the_trainer_button()  {

		page.clickPage();
		
	}

	@Then("^i'm taking to the trainer view$")
	public void i_m_taking_to_the_trainer_view() {
		
		page.checkButton();
	}

	@Given("^I am on the info page$")
	public void i_am_on_the_info_page() {

		driver.get("http://192.168.99.100:8080/#/info");

		page = PageFactory.initElements(driver, TrackerPage.class);
		
	}

	@Given("^I am on the trainer page$")
	public void i_am_on_the_trainer_page() {
		driver.get("http://192.168.99.100:8080/#/trainers");

		page = PageFactory.initElements(driver, TrackerPage.class);
	}

	@Then("^I remain on the trainer view$")
	public void i_remain_on_the_trainer_view(){

		page.checkButton();
	}

	@Given("^I am on any page$")
	public void i_am_on_any_page() {
		driver.get("http://192.168.99.100:8080/#/trainers");

		page = PageFactory.initElements(driver, TrackerPage.class);
	}

	@Then("^I should initially see one trainer available$")
	public void i_should_initially_see_one_trainer_available() {
		
		page.checkOnlyOneTrainer();
		
	}
	
	@When("^I press the dashboard button$")
	public void i_press_the_dashboard_button() throws InterruptedException {
		page.clickDashBoardButton();
		Thread.sleep(1000);
	}

	@Then("^i'm taking to the dashboard view$")
	public void i_m_taking_to_the_dashboard_view() {
		
		Assert.assertEquals("http://192.168.99.100:8080/#/dashboard",driver.getCurrentUrl());
		
	}

	@Then("^I remain on the dashboard view$")
	public void i_remain_on_the_dashboard_view() {
		Assert.assertEquals("http://192.168.99.100:8080/#/dashboard",driver.getCurrentUrl());
		
	}
	
	@When("^I click on a trainer$")
	public void i_click_on_a_trainer() {
		
		page.clickJohnButton();
		
	}

	@Then("^I should be taken to a view that shows me that subjects a trainer can$")
	public void i_should_be_taken_to_a_view_that_shows_me_that_subjects_a_trainer_can() throws InterruptedException {
		

		 page.checkJohnContent();
		
	}


	
}
