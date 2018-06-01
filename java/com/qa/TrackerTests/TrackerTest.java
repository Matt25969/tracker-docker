package com.qa.TrackerTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class TrackerTest {

	public WebDriver driver;

	TrackerPage page = null;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://localhost:8080/#/dashboard");

		page = PageFactory.initElements(driver, TrackerPage.class);

	}

	@After
	public void tearDown() {

		driver.close();
		driver.quit();

	}

	@Test
	public void test1() throws InterruptedException {

		page.clickPage();

		Thread.sleep(1000);

		page.checkButton();

	}

	@Test
	public void test2() throws InterruptedException {

		page.clickPage();

		Thread.sleep(1000);

		page.clickButton();

		WebElement check = driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[2]/td[3]"));

		Assert.assertEquals("JavaEE DB", check.getText());

	}

	@Test
	public void test3() throws InterruptedException {

		page.clickPage();

		Thread.sleep(1000);

		page.clickHide();

		WebElement check = driver.findElement(By.xpath("/html/body/div/div/div[2]/div"));

		Assert.assertEquals("ng-hide", check.getAttribute("class"));

	}

}
