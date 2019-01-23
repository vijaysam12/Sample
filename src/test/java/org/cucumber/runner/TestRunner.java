package org.cucumber.runner;

import org.cucumber.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\org\\cucumber\\feature",
		glue = "org\\cucumber\\Stepdefinition"

)
public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		 driver = BaseClass.getdriver("chrome");
	}
	
	
	
	@AfterClass
	public static void tearDown() {
		//driver.quit();
	}
}
