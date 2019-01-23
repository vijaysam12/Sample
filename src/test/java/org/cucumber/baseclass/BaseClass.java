package org.cucumber.baseclass;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getdriver(String browserName) throws Exception {
		try {
			if (browserName == "chrome") {
				System.setProperty("webdriver.chrome.driver",
						"H:\\Eclipse\\FirstDaySelenium\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName == "IE") {
				System.setProperty("webdriver.chrome.driver",
						"H:\\Eclipse\\FirstDaySelenium\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	// to send Url driver1

	public static void getUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Url is invalid");
		}

	}

	// refresh,back,forward
	public static void navigateback() {
		driver.navigate().back();

	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	// to get title and url
	public static void title() {
		String title = driver.getTitle();
		System.out.println("Page Title is " + title);
	}

	public static void currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl is " + currentUrl);
	}

	public static void mouseOver(WebElement element) {
		
		try {
			Actions ac = new Actions(driver);
			waitForVisiblityofElement(element);
			if (elementIsDisplayed(element) && elementIsEnabled(element)) {
				ac.moveToElement(element).build().perform();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void elementClear(WebElement element) throws Exception {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to clear the text in the webelement");
		}
	}

	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return displayed;

	}

	public static boolean elementIsEnabled(WebElement element) {
		boolean enabled = false;
		try {
			enabled = element.isEnabled();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return enabled;

	}

	public static void waitForVisiblityofElement(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 30);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void  sendText(WebElement element, String value) throws Exception {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("element is not accepting value");
		}
	}

	public static void clicktext(WebElement element) throws Exception {
		try {
			waitForVisiblityofElement(element);
			element.click();

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("element is not accepting click");

		}

	}

	public static void scroll(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", element);

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("element not present");
		}

	}

	public static void Screenshot(String test ) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File savefile = new File("H:\\Eclipse\\FirstDaySelenium\\Lib");
			FileUtils.copyFile(screenshotAs, savefile);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DD(WebElement element, String value, String options) {
		Select ac= new Select(element);
		if (options.equals("value")) {
			ac.selectByValue(value);
		}else if (options.equals("index")) {
			ac.selectByIndex(Integer.parseInt(value));	
		}else if (options.equals("Visibletext")) {
			ac.selectByVisibleText(value);	
		}
	}
	
	public void justclick(WebElement element) throws Exception {
		try {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("not reach justclick");
		}

	}

public void sendkeys(WebElement element, String value) throws Exception {
	try {
		Actions ac = new Actions(driver);
		ac.sendKeys(element,value).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("unable to sendtext");
	}

}

public void doubleclick(WebElement element) throws Exception {
	try {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("unable to make doubleclick");
	}

	}

public void rightclick(WebElement element) throws Exception {
	try {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	} catch (Exception e) {
	 e.printStackTrace();	
	 throw new Exception("right click element not wrong");
	}
	

}
public static void dragAndDrop(WebElement source, WebElement target) throws Exception {
	try {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("Unable to drag and drop");
	}
}
public static void waitUntilAlertPresent() throws Exception {
	try {
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.alertIsPresent());
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("Alert is not present");
	}
}

public static void acceptAlert() throws Exception {
	try {
		Alert a = driver.switchTo().alert();
		a.accept();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("Unable to accept the alert");
	}
}

public static void dismissAlert() throws Exception {
	try {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("Unable to dismiss the alert");
	}
}

public static void sendKeysToAlert(String value) throws Exception {
	try {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("Unable to send keys to the alert");
	}
}

}

 	

































