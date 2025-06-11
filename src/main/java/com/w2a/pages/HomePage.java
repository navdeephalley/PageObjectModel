package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w2a.base.Page;

public class HomePage extends Page {
	
	WebDriverWait wait;

	public void goToSupport() {
		
		driver.findElement(By.cssSelector(".zwc-more-links")).click();
		wait = new WebDriverWait(driver, 10);
		WebElement supportBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.zgh-nav > ul > li:nth-child(5) > ul > li:nth-child(4) > a")));
		supportBtn.click();
	}
	
	public void goToSignUp() {
		driver.findElement(By.cssSelector(".zgh-utilities .zgh-signup")).click();
	}
	
	public LoginPage goToLogin() {
		click("loginlink_CSS");
		return new LoginPage();
	}
	
	public void goToTryZohoOne() {
		driver.findElement(By.cssSelector(".zwc-one-content a")).click();
	}

}
