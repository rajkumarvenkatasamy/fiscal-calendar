package com.github.rajkumarvenkatasamy.fiscalcalendar;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FiscalYearTest {
    private FiscalYear fiscalYear = new FiscalYear();

    //inputs
    private LocalDate inputDate1ToTestMethod = LocalDate.of(2019, 5, 4);
    private LocalDate inputDate2ToTestMethod = LocalDate.of(2019, 2, 4);
    private Month fiscalStartMonthName = Month.APRIL;

    //expected outputs
    private int expectedFiscalYear1 = 2019;
    private int expectedFiscalYear2 = 2018;

    @Test
    public void testGetFiscalMonthOfYear() {
        int i;
        i = fiscalYear.getFiscalYear(fiscalStartMonthName, inputDate1ToTestMethod);
        Assert.assertEquals(i, expectedFiscalYear1);

        i = fiscalYear.getFiscalYear(fiscalStartMonthName, inputDate2ToTestMethod);
        Assert.assertEquals(i, expectedFiscalYear2);
    }
}
