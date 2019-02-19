package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class ReportData extends ExcelDataConfig{

        private static final Logger LOGGER = Logger.getLogger(ReportData.class);

        public ReportData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

        @DataProvider(name = "UsageReport_1")
        public Object[][] usageReport_LeaveType() {

        int rows = getRowCount("Usage_Report_1");
        int col = getColumnCount("Usage_Report_1");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Usage_Report_1", i, j);
            }
        }
        return data;
    }


        @DataProvider(name = "UsageReport_2")
        public Object[][] usageReport_Employee() {

            int rows = getRowCount("UsageReport_2");
            int col = getColumnCount("UsageReport_2");

            LOGGER.info("row = " + rows + " columns = " + col);

            Object[][] data = new Object[rows][col];
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < col; j++) {
                    data[i - 1][j] = getData("UsageReport_2", i, j);
                }
            }
            return data;
        }

    }
