package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu extends Page {
	
	/*
		TopMenu IS A Page  ??
		
		HomePage HAS A TopMenu
		AccountsPage HAS A TopMenu
		
		Page HAS A TopMenu
		
	*/
	WebDriver driver;
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	public void gotoHome() {
		
	}
	
	public void gotoLeads() {
	
	}
	
	public void gotoContacts() {
	
	}
	
	public AccountsPage gotoAccounts() {
		click("accountsmenu_ID");
		return new AccountsPage();
	}
	
	public void signOut() {
		
	}
}
