package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC006_DuplicateLead";
			testDescription="Duplicate lead is created successfully";
			testNodes="Leads";
			category="Smoke";
			authors="Priya";
			browserName="chrome";
			dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String uName,String pwd,String PhArcd, String LeadID1, String Title, String Fname1) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfalink()
		.clickMyLeads()
		.clickFLeadlnk()
		.clickPhoneLnk()
		.enterPhoneAreacd(PhArcd)
		.clickFLeadbtn()
		.getText(LeadID1)
		.clickLeadID1()
		.clickDupLeadbtn()
		.VerifyTitle(Title)
		.ClickDupCrLeadbtn()
		.verifyFname(Fname1);
		
	}			
		
}
