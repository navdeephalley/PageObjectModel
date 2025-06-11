package com.w2a.pages;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
		
	public CRMHomePage goToCRM() {
		click("crmlink_CSS");
		return new CRMHomePage();
	}
	
	public void goToSales() {
		click("saleslink_CSS");
		
	}
}
