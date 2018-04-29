package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Lead edited successfully";
		testNodes="Leads";
		category="Smoke";
		authors="Priya";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String CName,String FName,String LName,String Email,String Phone,String EditCname) {
		
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
		.clickCrLeads()
		.clickEditLeadbtn()
		.enterEditCName(EditCname)
		.clickUpdatebtn();
		
		
	}	

}
