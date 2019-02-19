package com.sgic.automation.orangehrm.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.sgic.automation.orangehrm.utils.PageBase.*;

public class SearchLeaveEntitlements {

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By searchLeaveEntitlementHeader= By.id("leave-entitlementsSearch");
    private static By viewLeaveEntitlements= By.id("menu_leave_viewLeaveEntitlements");
    private static By employeeName= By.id("entitlements_employee_empName");
    private static By leaveType= By.id("entitlements_leave_type");
    private static By leavePeriod= By.id( "period");
    private static By btnSearch= By.id( "searchBtn");
    private static By btnAdd = By.id("btnAdd");
    private static By  btnDelete = By.id ("btnDelete");
    private static By  entitlementListHeader= By.id ("search-results");
    private static By  checkBox = By.id ("ohrmList_chkSelectAll");
    private static By  popUPModel = By.id ("deleteConfModal");
    private static By  btnOk = By.id ("dialogDeleteBtn");
    private static By  btnCancel= By.xpath ("/html/body/div[1]/div[3]/div[3]/div[3]/input[2]");


    public static boolean isSearchLeaveEntitlementHeaderDisplay(){
        return getDriver().findElement(searchLeaveEntitlementHeader).isDisplayed();
    }
    public static void clickViewLeaveEntitlements() {

        getDriver().findElement(viewLeaveEntitlements).click();
    }
    public static void setEmployeeName( String entitlements_employee_empName) {
        getDriver().findElement(employeeName).clear();
        implicitWait(2);
        getDriver().findElement(employeeName).sendKeys(entitlements_employee_empName);
    }
    public static void setLeaveType(String entitlements_leave_type) {
        Select dropDownOption = new Select(getDriver().findElement(leaveType));
        dropDownOption.selectByVisibleText(entitlements_leave_type);
    }
    public static void setLeavePeriod(String period) {
        Select dropDownOption = new Select(getDriver().findElement(leavePeriod));
        dropDownOption.selectByVisibleText(period);
    }
    public static void clickBtnSearch() {
        getDriver().findElement(btnSearch).click();
    }
    public static boolean isentitlementListHeaderDisplay(){
        return getDriver().findElement(entitlementListHeader).isDisplayed();
    }
    public static void clickCheckBox() {
        getDriver().findElement(checkBox).click();
    }
    public static void click() {
        getDriver().findElement(btnAdd).click();
    }
    public static void clickBtnDelete() {
        getDriver().findElement(btnDelete).click();
    }
    public static boolean isPopupModelDisplay(){
        return getDriver().findElement(popUPModel).isDisplayed();
    }
    public static void clickBtnOk() {
        getDriver().findElement(btnOk).click();
    }
    public static void clickBtnCancel() {
        getDriver().findElement(btnCancel).click();
    }
    public static void SearchEntitlementsData(String employeeName,String leaveType, String leavePeriod) {
        staticWait(3);
        SearchLeaveEntitlements.setEmployeeName(employeeName);
        staticWait(2);
        SearchLeaveEntitlements.setLeaveType(leaveType);
        staticWait(2);
        SearchLeaveEntitlements.setLeavePeriod(leavePeriod);
        staticWait(2);
    }
}
