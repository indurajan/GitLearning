package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Lead should be created successfully";
		testNodes="Leads";
		category="Smoke";
		authors="Priya";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String CName,String FName,String LName,String Email,String Phone) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfalink()
		.clickMyLeads()
		.clickCRLead()
		.enterCompName(CName)
		.enterFName(FName)
		.enterLName(LName)
		.enterEmail(Email)
		.enterPhone(Phone)
		.clickCrLeads();
		
	}	

}
