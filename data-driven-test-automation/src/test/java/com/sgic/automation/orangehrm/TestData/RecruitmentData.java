package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class RecruitmentData extends ExcelDataConfig {

  private static final Logger LOGGER = Logger.getLogger(RecruitmentData.class);

  public RecruitmentData() {
    super("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
  }

  @DataProvider
  public Object[][] VacancyAdd() {

    int rows = getRowCount("AddVacancy");
    int col = getColumnCount("AddVacancy");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("AddVacancy", i, j);
      }
    }
    return data;
  }



  @DataProvider()
  public Object[][] CandidateAdd() {

    int rows = getRowCount("AddCandidate");
    int col = getColumnCount("AddCandidate");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("AddCandidate", i, j);
      }
    }
    return data;
  }


  @DataProvider
  public Object[][] CandidateSearch() {
    int rows = getRowCount("SearchCandidate");
    int col = getColumnCount("SearchCandidate");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("SearchCandidate", i, j);
      }
    }
    return data;

//  @DataProvider
//  public Object[][] CandidateSearch() {
//    ExcelDataConfig exConfig = new ExcelDataConfig(
//        "src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
//    //int rows = exConfig.getRowCount("SearchCandidate");
//
//
//    Object[][] data = new Object[1][9];
//    for (int i = 1; i < rows; i++) {
//      data[0][0] = exConfig.getData("SearchCandidate", i, 0);
//      data[0][1] = exConfig.getData("SearchCandidate", i, 1);
//      data[0][2] = exConfig.getData("SearchCandidate", i, 2);
//      data[0][3] = exConfig.getData("SearchCandidate", i, 3);
//      data[0][4] = exConfig.getData("SearchCandidate", i, 4);
//      data[0][5] = exConfig.getData("SearchCandidate", i, 5);
//      data[0][6] = exConfig.getData("SearchCandidate", i, 6);
//      data[0][7] = exConfig.getData("SearchCandidate", i, 7);
//      data[0][8] = exConfig.getData("SearchCandidate", i, 8);
//    }
//    return data;
//  }
//
//  @DataProvider
//  public Object[][] CandidateAdd() {
//    ExcelDataConfig exConfig = new ExcelDataConfig(
//        "src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
//    int rows = exConfig.getRowCount("AddCandidate");


//    Object[][] data = new Object[1][9];
//    for (int i = 1; i < rows; i++) {
//      data[0][0] = exConfig.getData("AddCandidate", i, 0);
//      data[0][1] = exConfig.getData("AddCandidate", i, 1);
//      data[0][2] = exConfig.getData("AddCandidate", i, 2);
//      data[0][3] = exConfig.getData("AddCandidate", i, 3);
//      data[0][4] = exConfig.getData("AddCandidate", i, 4);
//      data[0][5] = exConfig.getData("AddCandidate", i, 5);
//      data[0][6] = exConfig.getData("AddCandidate", i, 6);
//      data[0][7] = exConfig.getData("AddCandidate", i, 7);
//      data[0][8] = exConfig.getData("AddCandidate", i, 8);
//    }
//    return data;
//  }


  }
}