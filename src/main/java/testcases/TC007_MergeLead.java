package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge lead is created successfully";
		testNodes="Leads";
		category="Smoke";
		authors="Priya";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd, String LeadID1,String LeadID2) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfalink()
		.clickMyLeads()
		.clickMerLead()
		.clickFromLead()
		.enterLeadID1(LeadID1)
		.clickFLeadbtn()
		.clickFirstLeadID()
		.clickToLead()
		.enterLeadID2(LeadID2)
		.clickFLeadbtn()
		.clickSecLeadID()
		.clickMerbtn();





	}
		

}
