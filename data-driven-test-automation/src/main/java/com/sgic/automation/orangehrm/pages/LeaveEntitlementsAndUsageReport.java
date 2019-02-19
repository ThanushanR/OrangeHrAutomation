package com.sgic.automation.orangehrm.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.sgic.automation.orangehrm.utils.PageBase.*;

public class LeaveEntitlementsAndUsageReport {

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By leaveEntitlementsAndUsageReport= By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
    private static By menuLeave= By.id("menu_leave_viewLeaveModule");
    private static By reports= By.id("menu_leave_Reports");
    private static By menuLeaveEntitlementsAndUsageReport= By.id("menu_leave_viewLeaveBalanceReport");
    private static By leaveBalance= By.id("leave_balance_report_type");
    private static By leaveType= By.id("leave_balance_leave_type");
    private static By leavePeriod= By.id("period");
    private static By leaveJobTitle= By.id("leave_balance_job_title");
    private static By leaveBalanceLocation= By.id("leave_balance_location");
    private static By leaveBalanceSubUnit= By.id("leave_balance_sub_unit");
    private static By leaveBalanceTerminatedCheckBox= By.id("leave_balance_include_terminated");
    private static By employeeName= By.id("leave_balance_employee_empName");
    private static By periodFrom= By.id("period");
    private static By leaveBalanceViewBtn= By.id("viewBtn");

    public static boolean isleaveEntitlementsAndUsageReportDisplay(){
        return getDriver().findElement(leaveEntitlementsAndUsageReport).isDisplayed();
    }
    public static void clickMenuLeave()
    {
        getDriver().findElement(menuLeave).click();
    }
    public static void clickReports()
    {
        getDriver().findElement(reports).click();
    }
    public static void clickmenuLeaveEntitlementsAndUsageReport()
    {
        getDriver().findElement(menuLeaveEntitlementsAndUsageReport).click();
    }

    public static void setLeaveBalance(String leave_balance_report_type) {
        Select dropDownOption = new Select(getDriver().findElement(leaveBalance));
        dropDownOption.selectByVisibleText(leave_balance_report_type);
    }
    public static void setleaveType(String leave_balance_leave_type) {
        Select dropDownOption = new Select(getDriver().findElement(leaveType));
        dropDownOption.selectByVisibleText(leave_balance_leave_type);
    }
    public static void setLeavePeriod(String period) {
        Select dropDownOption = new Select(getDriver().findElement(leavePeriod));
        dropDownOption.selectByVisibleText(period);
    }
    public static void setleaveJobTitle(String leave_balance_job_title) {
        Select dropDownOption = new Select(getDriver().findElement(leaveJobTitle));
        dropDownOption.selectByVisibleText(leave_balance_job_title);
    }
    public static void setleaveBalanceLocation(String leave_balance_location) {
        Select dropDownOption = new Select(getDriver().findElement(leaveBalanceLocation));
        dropDownOption.selectByVisibleText(leave_balance_location);
    }
    public static void setleaveBalanceSubUnit(String leave_balance_sub_unit) {
        Select dropDownOption = new Select(getDriver().findElement(leaveBalanceSubUnit));
        dropDownOption.selectByVisibleText(leave_balance_sub_unit);
    }
    public static void setEmployeeName(String leave_balance_employee_empName) {
        getDriver().findElement(employeeName).clear();
        getDriver().findElement(employeeName).sendKeys(leave_balance_employee_empName);
    }
    public static void setPeriodFrom(String period) {
        Select dropDownOption = new Select(getDriver().findElement(periodFrom));
        dropDownOption.selectByVisibleText(period);
    }
    public static void clickleaveBalanceTerminatedCheckBox()
    {
        getDriver().findElement(leaveBalanceTerminatedCheckBox).click();
    }
    public static void clickleaveBalanceViewBtn()
    {
        getDriver().findElement(leaveBalanceViewBtn).click();
    }

    public static void ReportData_LeaveType(String leaveBalance, String leaveType,String leavePeriod,String leaveJobTitle,String leaveBalanceLocation,String leaveBalanceSubUnit){
        LeaveEntitlementsAndUsageReport.setLeaveBalance(leaveBalance);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.setleaveType(leaveType);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.setLeavePeriod(leavePeriod);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.setLeavePeriod(leaveJobTitle);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.setleaveBalanceLocation(leaveBalanceLocation);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.setleaveBalanceSubUnit(leaveBalanceSubUnit);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.clickleaveBalanceTerminatedCheckBox();
        implicitWait(2);
    }
    public static void ReportData_Employee(String leaveBalance, String periodFrom,String employeeName){
        LeaveEntitlementsAndUsageReport.setLeaveBalance(leaveBalance);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.setEmployeeName(employeeName);
        staticWait(2);
        LeaveEntitlementsAndUsageReport.setPeriodFrom(periodFrom);
        staticWait(2);
    }

}