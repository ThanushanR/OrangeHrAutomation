package com.sgic.automation.orangehrm.pages;

import org.openqa.selenium.By;

import static com.sgic.automation.orangehrm.utils.PageBase.getDriver;
import static com.sgic.automation.orangehrm.utils.PageBase.implicitWait;

public class LeaveList {

    private static By leaveListMenu = By.id("menu_leave_viewLeaveList");
    private static By leaveListHeader = By.id("leave-list-search");
    private static By leaveListFrom= By.id("calFromDate");
    private static By leaveListTo = By.id("calToDate");
    private static By leaveListStatusAll = By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck");
    private static By leaveListStatusRejected = By.id("leaveList_chkSearchFilter_-1");
    private static By leaveListStatusCancelled = By.id("leaveList_chkSearchFilter_0");
    private static By leaveListStatusPendingApproval = By.id("leaveList_chkSearchFilter_1");
    private static By leaveListStatusScheduled = By.id("leaveList_chkSearchFilter_2");
    private static By leaveListStatusTaken = By.id("leaveList_chkSearchFilter_3");
    private static By leaveListEmployee = By.id("leaveList_txtEmployee_empName");
    private static By leaveListSubUnit = By.id("leaveList_cmbSubunit");
    private static By leaveListPastEmployees = By.id("leaveList_cmbWithTerminated");
    private static By leaveListBtnSearch= By.id("btnSearch");
    private static By leaveListBtnReset= By.id("btnReset");
    private static By leaveListBtnSave= By.id("btnSave");

    public static boolean isLeaveListDisplay(){

        return getDriver().findElement(leaveListHeader).isDisplayed();
    }

    public static void clickLeaveListMenu() {

        getDriver().findElement(leaveListMenu).click();
    }
    public static void setLeaveListFrom( String calFromDate ) {
        getDriver().findElement(leaveListFrom).sendKeys(calFromDate);
    }
    public static void setLeaveListTo( String calToDate ) {
        getDriver().findElement(leaveListTo).sendKeys(calToDate);
    }
    public static void clickleaveListStatusRejected() {

        getDriver().findElement(leaveListStatusRejected).click();
    }
    public static void setLeaveListEmployee( String leaveList_txtEmployee_empName ) {
        getDriver().findElement(leaveListEmployee).sendKeys(leaveList_txtEmployee_empName);
    }
    public static void setLeaveListSubUnit( String leaveList_cmbSubunit ) {
        getDriver().findElement(leaveListSubUnit).sendKeys(leaveList_cmbSubunit);
    }
    public static void clickLeaveListPastEmployee() {

        getDriver().findElement(leaveListPastEmployees).click();
    }
    public static void clickLeaveListSearch() {

        getDriver().findElement(leaveListBtnSearch).click();
    }
    public static void LeaveList(String calFromDate,String calToDate,String leaveList_txtEmployee_empName,String leaveList_cmbSubunit){
      LeaveList.setLeaveListFrom(calFromDate);
      implicitWait(2);
      LeaveList.setLeaveListTo(calToDate);
        implicitWait(2);
      LeaveList.clickleaveListStatusRejected();
        implicitWait(2);
      LeaveList.setLeaveListEmployee(leaveList_txtEmployee_empName);
        implicitWait(2);
      LeaveList.setLeaveListSubUnit(leaveList_cmbSubunit);
        implicitWait(2);

    }


}
