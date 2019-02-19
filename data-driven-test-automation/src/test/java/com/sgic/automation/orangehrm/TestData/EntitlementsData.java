package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class EntitlementsData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(EntitlementsData.class);

    public EntitlementsData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

    @DataProvider(name = "AddSingleEntitlements")
    public Object[][] addSingleEntitlements() {

        int rows = getRowCount("Add_Single_Leave_Entitlement");
        int col = getColumnCount("Add_Single_Leave_Entitlement");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Add_Single_Leave_Entitlement", i, j);
            }
        }
        return data;
    }
    @DataProvider(name = "AddMultipeEntitlements")
    public Object[][] addMultipleEntitlements() {

        int rows = getRowCount("Add_Leave_Multiple_Entitlement");
        int col = getColumnCount("Add_Leave_Multiple_Entitlement");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Add_Leave_Multiple_Entitlement", i, j);
            }
        }
        return data;
    }

    @DataProvider(name = "SearchEntitlements")
    public Object[][] searchEntitlements() {

        int rows = getRowCount("Search_Entitlement");
        int col = getColumnCount("Search_Entitlement");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Search_Entitlement", i, j);
            }
        }
        return data;
    }



}
