package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class LeavePeriodData extends ExcelDataConfig {

        private static final Logger LOGGER = Logger.getLogger(LeavePeriodData.class);

    public LeavePeriodData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

        @DataProvider(name = "LeavePeriod")
        public Object[][] LeavePeriod() {

        int rows = getRowCount("Leave_Period");
        int col = getColumnCount("Leave_Period");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Leave_Period", i, j);
            }
        }
        return data;
    }

    }
