package com.github.rajkumarvenkatasamy.fiscalcalendar;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FiscalCalendarTest {
    //inputs
    private LocalDate inputDate1ToTestMethod = LocalDate.of(2020, 5, 4);
    private Month fiscalStartMonthName = Month.APRIL;

    //expected outputs
    private LocalDate expectedFirstFiscalDate1 = LocalDate.of(2020, 4, 1);
    private LocalDate expectedLastFiscalDate1 = LocalDate.of(2021, 3, 31);
    private int expectedFiscalDayOfYear1 = 34;
    private int expectedFiscalWeekOfYear1 = 5;
    private int expectedFiscalMonthOfYear1 = 2;
    private Month expectedLastFiscalMonth = Month.MARCH;
    private int expectedFiscalQuarterOfYear1 = 1;
    private int expectedFiscalHalfOfYear1 = 1;
    private int expectedFiscalYear1 = 2020;

    @Test
    public void testFiscalCalendar() {
        FiscalCalendar fiscalCalendarBuilder = new FiscalCalendar.FiscalCalendarBuilder(
                fiscalStartMonthName, inputDate1ToTestMethod).build();

        int valueGap = fiscalCalendarBuilder.getFirstFiscalDate().compareTo(expectedFirstFiscalDate1);
        Assert.assertEquals(0, valueGap);

        valueGap = fiscalCalendarBuilder.getLastFiscalDate().compareTo(expectedLastFiscalDate1);
        Assert.assertEquals(0, valueGap);

        Assert.assertEquals("Expected Fiscal Day of Year does not match.",
                fiscalCalendarBuilder.getFiscalDayOfYear(), expectedFiscalDayOfYear1);

        Assert.assertEquals("Expected Week does not match.",
                fiscalCalendarBuilder.getFiscalWeekOfYear(), expectedFiscalWeekOfYear1);

        Assert.assertEquals(fiscalCalendarBuilder.getFiscalMonthOfYear(), expectedFiscalMonthOfYear1);

        Assert.assertEquals(fiscalCalendarBuilder.getLastFiscalMonth(), expectedLastFiscalMonth);

        Assert.assertEquals(fiscalCalendarBuilder.getFiscalQuarterOfYear(), expectedFiscalQuarterOfYear1);

        Assert.assertEquals(fiscalCalendarBuilder.getFiscalHalfOfYear(), expectedFiscalHalfOfYear1);

        Assert.assertEquals(fiscalCalendarBuilder.getFiscalYear(), expectedFiscalYear1);

    }

}
