package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class AssignLeaveData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(AssignLeaveData.class);

    public AssignLeaveData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

    @DataProvider(name = "AssignLeave")
    public Object[][] AssignLeave() {

        int rows = getRowCount("Assign_Leave");
        int col = getColumnCount("Assign_Leave");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Assign_Leave", i, j);
            }
        }
        return data;
    }


    }

