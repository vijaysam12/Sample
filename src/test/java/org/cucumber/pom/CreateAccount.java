package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	public static WebDriver driver;
	
	@FindBy(id = "email_create")
	private WebElement email;
	
	@FindBy(name ="SubmitCreate")
	private WebElement create;
	
	public CreateAccount(WebDriver CA){
		driver = CA;
		PageFactory.initElements(driver, this);
	}
	public WebElement getemailid() {
		return email;
	}
	public WebElement tocreate() {
		return create;
	}

}
