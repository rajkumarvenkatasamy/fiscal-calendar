package com.venkara.fiscalcalendar;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FiscalWeekTest {

    private FiscalWeek fiscalWeek = new FiscalWeek();

    //inputs
    private LocalDate inputDate1ToTestMethod = LocalDate.of(2019, 5, 4);
    private LocalDate inputDate2ToTestMethod = LocalDate.of(2019, 2, 4);
    private Month fiscalStartMonthName = Month.APRIL;

    //expected outputs
    private int expectedFiscalWeekOfYear1 = 5;
    private int expectedFiscalWeekOfYear2 = 45;

    @Test
    public void testGetFiscalWeekOfYear() {
        int i;
        i = fiscalWeek.getFiscalWeekOfYear(fiscalStartMonthName, inputDate1ToTestMethod);
        Assert.assertEquals(i, expectedFiscalWeekOfYear1);

        i = fiscalWeek.getFiscalWeekOfYear(fiscalStartMonthName, inputDate2ToTestMethod);
        Assert.assertEquals(i, expectedFiscalWeekOfYear2);
    }

}
