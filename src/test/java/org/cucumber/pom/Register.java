package org.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public static WebDriver driver;
	@FindBy(xpath = "(//input[@name='id_gender'])[1]")
	private WebElement Mr;
	
	@FindBy(id = "customer_firstname")
	private WebElement custfirstname;
	
	@FindBy(id = "customer_lastname")
	private WebElement custlastname;
	
	@FindBy(name = "passwd")
	private WebElement password;
	
	@FindBy(id ="days")
	private WebElement days;
	
	@FindBy(id ="months")
	private WebElement months;
	
	@FindBy(id ="years")
	private WebElement years;
	
	@FindBy(xpath ="//*[@id=\"newsletter\"]" )
	private WebElement newsletter;
	
	@FindBy(id="firstname") 
	private WebElement firstname;
	
	@FindBy(id="lastname") 
	private WebElement lastname;
	
	@FindBy(id="company") 
	private WebElement company;

	@FindBy(id="address1") 
	private WebElement address1;
	
	@FindBy(id="address2") 
	private WebElement address2;

	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="postcode")
	private WebElement code;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="id_country")
	private WebElement country;
	
	@FindBy(id="other")
	private WebElement Addinfo;
	
	@FindBy(id="phone")
	private WebElement homeph;
	
	@FindBy(id="phone_mobile")
	private WebElement phnum;
	
	@FindBy(id="alias")
	private WebElement ref;
	
	@FindBy(id="submitAccount")
	private WebElement register;
	
	public Register(WebDriver reg) {
		driver = reg;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMr() {
		return Mr;
	}
	
	public WebElement getcustomername() {
		return custfirstname;

		}
		public WebElement getcustomerlastname() {
			return custlastname;
		}
		public WebElement getpassword() {
			return password;
		}
		public WebElement getdays() {
			return days;
		}
		public WebElement getmonths() {
			return months;
		}
		public WebElement getyears() {
			return years;
		}
		public WebElement getnewsletter() {
			return newsletter;
		}
		public WebElement getfirstname() {
			return firstname;
		}
		public WebElement getlastname() {
			return lastname;
		}
		public WebElement getcompany() {
			return company;
		}
		public WebElement getaddress1() {
			return address1;
		}
		public WebElement getaddress2() {
			return address2;
		}
		public WebElement getcity() {
			return city;
		}
		public WebElement getstate() {
			return state;
		}
		public WebElement getcountry() {
			return country;
		}
		public WebElement getaddinfo() {
			return Addinfo;
		}
		public WebElement gethomeph() {
			return homeph;
		}
		public WebElement getphnum() {
			return phnum;
		}
		public WebElement getref() {
			return ref;
		}
		
		public WebElement getcode() {
			return code;
		}
		public WebElement getreg() {
			return register;
		}
	
}


