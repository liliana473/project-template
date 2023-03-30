package com.fleet.ExelDemo;

import com.fleet.utilities.ExcelUtil;
import org.junit.Test;

import java.util.Map;

public class ExcelUtilPractice {

    @Test
    public void readExcelUtil(){

        ExcelUtil excelUtil = new ExcelUtil("Vytracktestdata.xlsx" , "QA3-short");

        System.out.println("excelUtil.rowCount() = " + excelUtil.rowCount());

        for (Map<String, String> row : excelUtil.getDataList()) {
            System.out.println(row);
        }


    }
}
