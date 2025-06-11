package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) throws InterruptedException {
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage accPage = Page.menu.gotoAccounts();
		CreateAccountPage cap = accPage.gotoCreateAccount();
		cap.fillAccountNameField(data.get("name"));
		
	}
}
