package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class WorkWeekData extends ExcelDataConfig{

        private static final Logger LOGGER = Logger.getLogger(LeavePeriodData.class);

    public WorkWeekData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }
        @DataProvider(name = "WorkWeek")
        public Object[][] workWeek() {

        int rows = getRowCount("Work_Week");
        int col = getColumnCount("Work_Week");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Work_Week", i, j);
            }
        }
        return data;
    }
}
