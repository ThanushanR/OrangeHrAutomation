package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.*;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sun.plugin2.message.Message;

/**
 * data_driven_test_automation
 * Thanushan 11/02/2019
 */
public class Leave extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginDemo.class);
    //Valid Login
    @Test( priority = 0,dataProviderClass = LoginDemo.class,dataProvider = "loginValid")
    public void loginValid(String username,String password ) {
        extentTest=extentReport.startTest("Valid Login");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ username+" , Pasword: "+password);
        LoginPage.login(username,password);
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, "Login Sucessfully");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Invalid Login
    @Test( priority = 0,dataProviderClass = LoginDemo.class,dataProvider = "Invalid_Login")
    public void loginInValid(String userName, String password,String alertMSg) {
        extentTest=extentReport.startTest("Invalid Login");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  " + "UserName: " + userName + " , Pasword: " + password);
        LoginPage.login(userName, password);
        LOGGER.info(alertMSg);
        extentTest.log(LogStatus.PASS, "Invalid Login Verification Sucessfully");
        softAssert.assertEquals(LoginPage.getLoginAlert(), alertMSg, "Alert Message Not Displayed");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
   // Login Page
    @Test( priority = 0)
    public void Login() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.setUserName(Constants.USERNAME);
        LoginPage.setPassword(Constants.PASSWORD);
        LoginPage.clickLogin();
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed(),"Dashboard page is not displayed");
//        DashBoardPage.clickWelcomeAdminbtn();
//        DashBoardPage.clickLogoutbtn();
        softAssert = new SoftAssert();
        }

    //Add Single Entitlement
        @Test(priority = 1,dataProviderClass = EntitlementsData.class,dataProvider = "AddSingleEntitlements",testName = "Add Leave Single Entitlements")
    public void addLeaveSingleEntitlement(String txtEmpName, String LeaveType,String LeavePeriod,String txtEntitlement){
        Login();
        extentTest=extentReport.startTest("Add Leave Single Entitlements");
        AddLeaveEntitlement.clickMenuLeave();
        AddLeaveEntitlement.clickMenuEntitlements();
        AddLeaveEntitlement.clickAddEntitlements();
        softAssert.assertTrue(AddLeaveEntitlement.isAddLeaveEntitlementHeaderDisplay(),"Add Leave Entitlements not displayed");
        PageBase.staticWait(5);
        AddLeaveEntitlement.AddSingleEntitlementsData(txtEmpName,LeaveType,LeavePeriod,txtEntitlement);
        AddLeaveEntitlement.clickBtnSave();
        extentTest.log(LogStatus.PASS, "Leave Single Entitlement Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    //Add Multiple Entitlement
    @Test( priority = 2,dataProviderClass = EntitlementsData.class,dataProvider = "AddMultipeEntitlements",testName = "Add Leave Multiple Entitlements")
    public void addLeaveMultipleEntitlement(String filtersLocation,String filtersSubunit, String LeaveType,String LeavePeriod,String txtEntitlement){
            extentTest=extentReport.startTest("Add Leave Multiple Entitlements");
            Login();
            AddLeaveEntitlement.clickMenuLeave();
            AddLeaveEntitlement.clickMenuEntitlements();
            AddLeaveEntitlement.clickAddEntitlements();
            softAssert.assertTrue(AddLeaveEntitlement.isAddLeaveEntitlementHeaderDisplay(), "Add Leave Multiple Entitlement");
            AddLeaveEntitlement.AddMultipleEntitlementsData(filtersLocation,filtersSubunit,LeaveType,LeavePeriod,txtEntitlement);
            AddLeaveEntitlement.clickBtnSave();
            extentTest.log(LogStatus.PASS, "Leave Multiple Entitlement Sucessfully Added");
            extentReport.endTest(extentTest);
            softAssert.assertAll();
    }
    //Add Search Entitlement
    @Test( priority = 3,dataProviderClass = EntitlementsData.class,dataProvider = "SearchEntitlements",testName = "Search Leave Entitlements")
    public void searchLeaveEntitlement(String employeeName,String leaveType, String leavePeriod) {
        extentTest=extentReport.startTest("Search Leave Entitlements");
        Login();
        AddLeaveEntitlement.clickMenuLeave();
        AddLeaveEntitlement.clickMenuEntitlements();
        SearchLeaveEntitlements.clickViewLeaveEntitlements();
        softAssert.assertTrue(SearchLeaveEntitlements.isSearchLeaveEntitlementHeaderDisplay(),"Add Leave Search Entitlement");
        SearchLeaveEntitlements.SearchEntitlementsData(employeeName,leaveType,leavePeriod);
        SearchLeaveEntitlements.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Delete Leave Entitlements
    @Test( priority = 4,dataProviderClass = EntitlementsData.class,dataProvider = "SearchEntitlements",testName = "Delete Leave Entitlements")
    public void deleteLeaveEntitlement(String employeeName,String leaveType, String leavePeriod){
        extentTest=extentReport.startTest("Delete Leave Entitlement");
        Login();
        AddLeaveEntitlement.clickMenuLeave();
        AddLeaveEntitlement.clickMenuEntitlements();
        SearchLeaveEntitlements.clickViewLeaveEntitlements();
        softAssert.assertTrue(SearchLeaveEntitlements.isSearchLeaveEntitlementHeaderDisplay(),"Delete Leave Entitlement");
        SearchLeaveEntitlements.SearchEntitlementsData(employeeName,leaveType,leavePeriod);
        SearchLeaveEntitlements.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Searched");
        PageBase.implicitWait(10);
        softAssert.assertTrue(SearchLeaveEntitlements.isentitlementListHeaderDisplay(),"Entilement List not Displayed");
        SearchLeaveEntitlements.clickCheckBox();
        PageBase.staticWait(1);
        SearchLeaveEntitlements.isPopupModelDisplay();
        PageBase.staticWait(1);
        SearchLeaveEntitlements.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Leave Entitlements and Usage Report
    @Test( priority = 5,dataProviderClass = ReportData.class,dataProvider = "UsageReport_1",testName = "Leave Entitlements and Usage Report")
    public void LeaveEntitlementsAndUsageReport(String leaveBalance, String leaveType,String leavePeriod,String leaveJobTitle,String leaveBalanceLocation,String leaveBalanceSubUnit)
    {
        extentTest=extentReport.startTest("Leave Entitlements And Usage Report");
        Login();
        LeaveEntitlementsAndUsageReport.clickMenuLeave();
        LeaveEntitlementsAndUsageReport.clickReports();
        LeaveEntitlementsAndUsageReport.clickmenuLeaveEntitlementsAndUsageReport();
        softAssert.assertTrue(LeaveEntitlementsAndUsageReport.isleaveEntitlementsAndUsageReportDisplay(),"Leave Entitlement and Usage Report");
        LeaveEntitlementsAndUsageReport(leaveBalance,leaveType,leavePeriod,leaveJobTitle,leaveBalanceLocation,leaveBalanceSubUnit);
        LeaveEntitlementsAndUsageReport.clickleaveBalanceViewBtn();
        extentTest.log(LogStatus.PASS, "Leave Entitlement Usage Report Sucessfully Generated");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Leave Entitlements and Usage Report
    @Test( priority = 6,dataProviderClass = ReportData.class,dataProvider = "UsageReport_1",testName = "Leave Entitlements and Usage Report")
    public void LeaveEntitlementsAndUsageReport(String leaveBalance, String periodFrom,String employeeName){
        extentTest=extentReport.startTest("Leave Entitlements And Usage Report");
        Login();
        LeaveEntitlementsAndUsageReport.clickMenuLeave();
        LeaveEntitlementsAndUsageReport.clickReports();
        LeaveEntitlementsAndUsageReport.clickmenuLeaveEntitlementsAndUsageReport();
        softAssert.assertTrue(LeaveEntitlementsAndUsageReport.isleaveEntitlementsAndUsageReportDisplay(),"Leave Entitlement and Usage Report");
        LeaveEntitlementsAndUsageReport(leaveBalance,periodFrom,employeeName);
        LeaveEntitlementsAndUsageReport.clickleaveBalanceViewBtn();
        extentTest.log(LogStatus.PASS, "Leave Entitlement Usage Report Sucessfully Generated");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    //Edit Leave Period
    @Test( priority = 6,dataProviderClass = LeavePeriodData.class,dataProvider = "LeavePeriod",testName = "Leave Entitlements and Usage Report")
    public void leavePeriod(String leavePeriodStartMonth, String leavePeriodStartDate){
        extentTest=extentReport.startTest("Edit Leave Period");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LeavePeriod.clickMenuLeavePeriod();
        softAssert.assertTrue(LeavePeriod.isLeavePeriodDisplay(),"Edit Leave Period not Displayed");
        LeavePeriod.clickBtnEdit();
        LeavePeriod.EditLeavePeriod(leavePeriodStartMonth,leavePeriodStartDate);
        LeavePeriod.clickbtnSave();
        extentTest.log(LogStatus.PASS, "Leave period Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Add New Leave type
    @Test( priority = 7,dataProviderClass = LeaveTypeData.class,dataProvider = "LeaveType",testName = "Leave Entitlements and Usage Report")
    public void addLeaveType(String LeaveTypeName){
        extentTest=extentReport.startTest("Add Leave Type");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LeaveTypes.clickMenuLeaveType();
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Add Leave Type");
        LeaveTypes.clickLeaveTypeBtnAdd();
        LeaveTypes.AddLeaveType(LeaveTypeName);
        LeaveTypes.clickLeaveTypeAddSave();
        extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 8,testName = "Delete Leave Type")
    public void DeleteLeaveType(){
        extentTest=extentReport.startTest("Delete Leave Type");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LeaveTypes.clickMenuLeaveType();
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Delete Leave Type not Displayed");
        LeaveTypes.clickLeaveTypeCheckbox();
        LeaveTypes.clickLeaveTypeBtnDelete();
        softAssert.assertTrue(LeaveTypes.isleaveTypeDeleteConfirmationDisplay(),"Delete Leave Type Confirmation Popup");
        LeaveTypes.clickLeaveTypeDeleteConfirmationOk();
        extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 9,testName = "Delete Leave Type Confirmation Cancel")
    public void DeleteLeaveTypeCancel(){
        extentTest=extentReport.startTest("Delete Leave Type Confirmation Cancel");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LeaveTypes.clickMenuLeaveType();
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Delete Leave Type");
        LeaveTypes.clickLeaveTypeCheckbox();
        LeaveTypes.clickLeaveTypeBtnDelete();
        softAssert.assertTrue(LeaveTypes.isleaveTypeDeleteConfirmationDisplay(),"Delete Leave Type Confirmation popup ");
        LeaveTypes.clickLeaveTypeDeleteConfirmationCancel();
        extentTest.log(LogStatus.PASS, "Leave Type delete Sucessfully Cancelled");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 10,dataProviderClass = WorkWeekData.class,dataProvider = "WorkWeek",testName = "Edit Work Week")
    public void EditWorkWeek(String workWeekMonday,String workWeekTuesday,String workWeekWednesday,String workWeekThursday,String workWeekFriday,String workWeekSaturday,String workWeekSunday){
        extentTest=extentReport.startTest("Edit Work Week");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        WorkWeek.clickMenuEditWorkWeek();
        softAssert.assertTrue(WorkWeek.iseditWorkWeekHeaderDisplay(),"Edit Work Week page Not Displayed");
        WorkWeek.clickeditBtn();
        WorkWeek.WorkWeek(workWeekMonday,workWeekTuesday,workWeekWednesday,workWeekThursday,workWeekFriday,workWeekSaturday,workWeekSaturday);
        WorkWeek.clickSaveBtn();
        extentTest.log(LogStatus.PASS, "Work Wekk Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 11,dataProviderClass = HolidayData.class,dataProvider = "AddHoliday",testName = "Add Holiday")
    public void AddHoliday(String addHolidayName, String calenderDate,String addHolidayLength){
        extentTest=extentReport.startTest("Add New Holiday");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        Holidays.clickMenuHoliday();
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.clickBtnAdd();
        softAssert.assertTrue(Holidays.isAddHolidayHeaderDisplay(),"Add Holiday page not displayed");
        Holidays.AddHolidays(addHolidayName,calenderDate,addHolidayLength);
        Holidays.clickBtnSave();
        PageBase.staticWait(3);
        extentTest.log(LogStatus.PASS, "Holiday Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 12,dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void SearchHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Search Holiday Details");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        Holidays.clickMenuHoliday();
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Holiday Details Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 13,dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void DeleteHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Delete Holiday");
        Login();
        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        Holidays.clickMenuHoliday();
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        Holidays.clickDeleteCheckBoxClick();
        Holidays.clickBtnDelete();
        Holidays.isDeleteHolidayConfirmationHeaderDisplay();
        Holidays.clickDeleteHolidayOk();
        extentTest.log(LogStatus.PASS, "Holiday detail is Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 14,dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeave",testName = "Assign New Leave")
    public void AssignLeave(String employeeName, String leaveType,String fromDate,String toDate,String duration,String comment) {
        extentTest=extentReport.startTest("Assign Leave");
        Login();
        LeavePeriod.clickLeaveModule();
        AssignLeave.clickMenuAssignLeave();
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignLeaveData(employeeName,leaveType,fromDate,toDate,duration,comment);
        AssignLeave.clickAssignBtn();
        AssignLeave.isConfirmationPopoupDisplayed();
        AssignLeave.clickOkbtn();
        extentTest.log(LogStatus.PASS, "Leave has Sucessfully Assigned");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 15,dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeave",testName = "Assign New Leave Cancel")
    public void AssignLeaveCancel(String employeeName, String leaveType,String fromDate,String toDate,String duration,String comment) {
        extentTest=extentReport.startTest("Assign Leave Cancel");
        Login();
        LeavePeriod.clickLeaveModule();
        AssignLeave.clickMenuAssignLeave();
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignLeaveData(employeeName,leaveType,fromDate,toDate,duration,comment);
        AssignLeave.clickAssignBtn();
        PageBase.implicitWait(3);
        AssignLeave.isConfirmationPopoupDisplayed();
        AssignLeave.clickCancelbtn();
        extentTest.log(LogStatus.PASS, "Leave Assigned has Sucessfully  Cancelled");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 16,dataProviderClass = LeaveListData.class,dataProvider = "LeaveList",testName = "Leave List")
    public void LeaveList(String calFromDate,String calToDate,String leaveList_txtEmployee_empName,String leaveList_cmbSubunit) {
        extentTest=extentReport.startTest("Leave List");
        Login();
        LeavePeriod.clickLeaveModule();
        LeaveList.clickLeaveListMenu();
        softAssert.assertTrue(LeaveList.isLeaveListDisplay(), "Leave List Page Not Displayed");
        LeaveList(calFromDate,calToDate,leaveList_txtEmployee_empName,leaveList_cmbSubunit);
        PageBase.implicitWait(5);
        LeaveList.clickLeaveListPastEmployee();
        LeaveList.clickLeaveListSearch();
        extentTest.log(LogStatus.PASS, "Leave List Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
