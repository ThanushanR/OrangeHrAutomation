//Thanushan
package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
/**
 * data_driven_test_automation
 * Thanushan 11/02/2019
 */import static com.sgic.automation.orangehrm.utils.PageBase.*;

//Add new Leave Entitlement
public class AddLeaveEntitlement {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By addLeaveEntitlementHeader= By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/h1");
    private static By addMultipleEmployee = By.id ("entitlements_filters_bulk_assign");
    private static By filtersLocation = By.id("entitlements_filters_location");
    private static By filtersSubunit = By.id("entitlements_filters_subunit");
    private static By menuLeave = By.id("menu_leave_viewLeaveModule");
    private static By menuEntitlements = By.id("menu_leave_Entitlements");
    private static By menuAddEntitlements = By.id("menu_leave_addLeaveEntitlement");
    private static By txtEmpName = By.id("entitlements_employee_empName");
    private static By LeaveType = By.id("entitlements_leave_type");
    private static By LeavePeriod = By.id("period");
    private static By txtEntitlement  = By.id("entitlements_entitlement");
    private static By btnSave = By.id("btnSave");

    public static boolean isAddLeaveEntitlementHeaderDisplay(){
        return getDriver().findElement(addLeaveEntitlementHeader).isDisplayed();
    }
    public static void clickMenuLeave() {

        getDriver().findElement(menuLeave).click();
    }
    public static void clickMenuEntitlements() {

        getDriver().findElement(menuEntitlements).click();
    }
    public static void clickAddEntitlements() {

        getDriver().findElement(menuAddEntitlements).click();
    }
    public static void clickAddMultipleEmployee()
    {

        getDriver().findElement(addMultipleEmployee).click();
    }
    public static void setTxtEmpName( String entitlements_employee_empName ) {
        getDriver().findElement(txtEmpName).clear();
        getDriver().findElement(txtEmpName).sendKeys(entitlements_employee_empName);
    }
    public static void setFiltersLocation( String entitlements_filters_location ) {
        getDriver().findElement(filtersLocation).sendKeys(entitlements_filters_location);
    }
    public static void setFiltersSubunit( String entitlements_filters_subunit ) {
        getDriver().findElement(filtersSubunit).sendKeys(entitlements_filters_subunit);
    }
    public static void setLeaveType(String leaveType) {
        Select dropDownOption = new Select(getDriver().findElement(LeaveType));
        dropDownOption.selectByVisibleText(leaveType);
    }
    public static void setLeavePeriod(String leavePeriod) {
        Select dropDownOption = new Select(getDriver().findElement(LeavePeriod));
        dropDownOption.selectByVisibleText(leavePeriod);
    }
    public static void setEntitlement( String entitlements_entitlement ) {
        getDriver().findElement(txtEntitlement).sendKeys(entitlements_entitlement);
    }
    public static void clickBtnSave() {
        getDriver().findElement(btnSave).click();
    }

    public static void AddSingleEntitlementsData(String txtEmpName, String LeaveType,String LeavePeriod,String txtEntitlement){

        AddLeaveEntitlement.setTxtEmpName(txtEmpName);
        staticWait(5);
        AddLeaveEntitlement.setLeaveType(LeaveType);
        staticWait(5);
        AddLeaveEntitlement.setLeavePeriod(LeavePeriod);
        staticWait(5);
        AddLeaveEntitlement.setEntitlement(txtEntitlement);
        implicitWait(5);
    }
    public static void AddMultipleEntitlementsData(String filtersLocation,String filtersSubunit, String LeaveType,String LeavePeriod,String txtEntitlement){

        AddLeaveEntitlement.clickAddMultipleEmployee();
        staticWait(2);
        AddLeaveEntitlement.setFiltersLocation(filtersLocation);
        staticWait(2);
        AddLeaveEntitlement.setFiltersSubunit(filtersSubunit);
        staticWait(2);
        AddLeaveEntitlement.setLeaveType(LeaveType);
        staticWait(2);
        AddLeaveEntitlement.setLeavePeriod(LeavePeriod);
        staticWait(2);
        AddLeaveEntitlement.setEntitlement(txtEntitlement);
        implicitWait(2);
    }

    }
