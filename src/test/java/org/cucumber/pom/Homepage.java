package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signin;

	public Homepage(WebDriver hp) {
		this.driver = hp;
		PageFactory.initElements(driver, this);
	}

	public WebElement getsignin() {
		
		return signin;
	}
}
