package com.github.rajkumarvenkatasamy.fiscalcalendar;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FiscalHalfYearTest {
    private FiscalHalfYear fiscalHalfYear = new FiscalHalfYear();

    //inputs
    private LocalDate inputDate1ToTestMethod = LocalDate.of(2019, 5, 4);
    private LocalDate inputDate2ToTestMethod = LocalDate.of(2019, 2, 4);
    private Month fiscalStartMonthName = Month.APRIL;

    //expected outputs
    private int expectedFiscalHalfYearOfYear1 = 1;
    private int expectedFiscalHalfYearOfYear2 = 2;

    @Test
    public void testGetFiscalMonthOfYear() {
        int i;
        i = fiscalHalfYear.getFiscalHalfOfYear(fiscalStartMonthName, inputDate1ToTestMethod);
        Assert.assertEquals(i, expectedFiscalHalfYearOfYear1);

        i = fiscalHalfYear.getFiscalHalfOfYear(fiscalStartMonthName, inputDate2ToTestMethod);
        Assert.assertEquals(i, expectedFiscalHalfYearOfYear2);
    }
}
