package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Deleted Lead successfully";
		testNodes="Leads";
		category="Smoke";
		authors="Priya";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String PhArcd, String LeadID1,String errmsg) {
		
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
		.clickDelLeadbtn()
		.clickFLeadlnk()
		.enterLeadID1(LeadID1)
		.clickFLeadbtn()
		.verifyErrMsg(errmsg);
		
				
	}	

}
