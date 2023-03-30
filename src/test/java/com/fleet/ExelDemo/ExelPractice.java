package com.fleet.ExelDemo;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelPractice {

    @Test
    public void ExcelRead() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("Vytracktestdata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("QA3-short");

        System.out.println("sheet.getRow(2).getCell(2) = " + sheet.getRow(2).getCell(2));

    }
}
