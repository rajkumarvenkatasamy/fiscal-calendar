package com.github.rajkumarvenkatasamy.fiscalcalendar;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FiscalMonthTest {
    private FiscalMonth fiscalMonth = new FiscalMonth();

    //inputs
    private LocalDate inputDate1ToTestMethod = LocalDate.of(2019, 5, 4);
    private LocalDate inputDate2ToTestMethod = LocalDate.of(2019, 2, 4);
    private Month fiscalStartMonthName = Month.APRIL;

    //expected outputs
    private int expectedFiscalMonthOfYear1 = 2;
    private int expectedFiscalMonthOfYear2 = 11;
    private Month expectedLastFiscalMonth = Month.MARCH;

    @Test
    public void testGetFiscalMonthOfYear() {
        int i;
        i = fiscalMonth.getFiscalMonthOfYear(fiscalStartMonthName, inputDate1ToTestMethod);
        Assert.assertEquals(i, expectedFiscalMonthOfYear1);

        i = fiscalMonth.getFiscalMonthOfYear(fiscalStartMonthName, inputDate2ToTestMethod);
        Assert.assertEquals(i, expectedFiscalMonthOfYear2);
    }

    @Test
    public void testGetLastFiscalMonth() {
        Month lastFiscalMonth = fiscalMonth.getLastFiscalMonth(fiscalStartMonthName);
        Assert.assertEquals(expectedLastFiscalMonth.getValue(), lastFiscalMonth.getValue());
    }

}
