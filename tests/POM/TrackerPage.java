package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class TrackerPage {

	@FindBy(xpath = "/html/body/nav/div/ul/li[2]/a")
	private WebElement Trainers_Button;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/table/tbody/tr[2]/td[2]/button")
	private WebElement John_Button;

	@FindBy(xpath = "/html/body/div/div/div[2]/button")
	private WebElement Hide_Button;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/table/tbody/tr[2]/td[1]")
	private WebElement list_of_trainers;

	@FindBy(xpath = "/html/body/nav/div/ul/li[1]/a")
	private WebElement dashboard_button;

	@FindBy(xpath = "/html/body/div/div/div[2]/table/tbody/tr[2]/td[3]")
	private WebElement check;

	public void clickDashBoardButton() {

		dashboard_button.click();

	}

	public void clickHide() {

		Hide_Button.click();
	}

	public void clickPage() {

		Trainers_Button.click();

	}

	public void clickJohnButton() {

		John_Button.click();

	}

	public void checkJohnContent() throws InterruptedException {

		Thread.sleep(1000);

		Assert.assertEquals("JavaEE DB", check.getText());

	}

	public void checkButton() {

		Assert.assertEquals("John Gordon", John_Button.getText());

	}

	public void clickButton() {

		John_Button.click();

	}

	public void checkOnlyOneTrainer() {

		Assert.assertEquals("1", list_of_trainers.getText());

	}

}
