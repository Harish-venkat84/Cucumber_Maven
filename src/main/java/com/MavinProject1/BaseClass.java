package com.MavinProject1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	
	public static WebDriver launchBrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}
		
		else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
			driver.manage().window().maximize();
		}
		
		return driver;	
		
	}
	
	public static void urlLaunch(String url) {
		
		driver.get(url);
	}
	
	public static void browserClose() {

		driver.close();
	}

	public static void browserQuit() {

		driver.quit();
		
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}

	public static void sendKeys(WebElement element, String input) {

		element.sendKeys(input);
	}

	public static void Click(WebElement element) {

		element.click();
	}
	
	public static void getCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void selectByValue(WebElement element, String input) {

		Select s1 = new Select(element);
		s1.selectByValue(input);
		
	}	

	public static void selectByVisibleText(WebElement element, String input) {

		Select s2 = new Select(element);
		s2.selectByVisibleText(input);
	}

	public static void screenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
		FileUtils.copyFile(src, des);
	}	
	
	public static void explicitWait(int num, String input) {
		
		WebDriverWait wait = new WebDriverWait(driver,num);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(input)));
	}
	
	public static void implicityWait(int second) {
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
	}
	
	public static void scrollUpAndDown(String input) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript(input, "");
	}
	
	
	public static void isenable(WebElement elemnt) {
		
		boolean st = elemnt.isEnabled();
		System.out.println(st);
	}
	
	public static void isDisplayed(WebElement element) {
		
		boolean print = element.isDisplayed();
		System.out.println(print);
	}
	
	public static void isSelected(WebElement element) {
		
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	
	public static void navigateTo(String input) {
		driver.navigate().to(input);
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
			driver.navigate().refresh();
	}
	
	public static void alertsAccept() {
		
		Alert a1 = driver.switchTo().alert();
		a1.accept();
	}
	
	public static void alertDismiss() {
	
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
	}
	
	public static void alertGetText() {
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
	}
	
	public static void actionRightClick(WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}
	
	public static void actionsDoubleClick(WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}
	
	public static void actionDragAndDrop(WebElement element, WebElement element1) {
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element1).build().perform();
	}
	
	public static void actionMoveTheMouseToElement(WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static void actionClickAndHold(WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(element).build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
