package com.venkara.fiscalcalendar;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FiscalDateTest {

    private FiscalDate fiscalDate = new FiscalDate();

    //inputs
    private LocalDate inputDate1ToTestMethod = LocalDate.of(2019, 5, 4);
    private LocalDate inputDate2ToTestMethod = LocalDate.of(2019, 2, 4);
    private Month fiscalStartMonthName = Month.APRIL;

    //expected outputs
    private LocalDate expectedOutputDate1 = LocalDate.of(2019, 4, 1);
    private LocalDate expectedOutputDate2 = LocalDate.of(2018, 4, 1);
    private int expectedDayOfYear1 = 34;
    private int expectedDayOfYear2 = 310;
    private LocalDate expectedOutputLastFiscalDate1 = LocalDate.of(2020, 3, 31);

    @Test
    public void testGetFirstFiscalDate() {
        int i;

        i = fiscalDate.getFirstFiscalDate(fiscalStartMonthName, inputDate1ToTestMethod)
                .compareTo(expectedOutputDate1);
        Assert.assertEquals(i, 0);

        i = fiscalDate.getFirstFiscalDate(fiscalStartMonthName, inputDate2ToTestMethod)
                .compareTo(expectedOutputDate2);
        Assert.assertEquals(i, 0);

    }

    @Test
    public void testGetFiscalDayOfYear() {
        int i;

        i = fiscalDate.getFiscalDayOfYear(fiscalStartMonthName, inputDate1ToTestMethod);
        Assert.assertEquals(i, expectedDayOfYear1);

        i = fiscalDate.getFiscalDayOfYear(fiscalStartMonthName, inputDate2ToTestMethod);
        Assert.assertEquals(i, expectedDayOfYear2);
    }

    @Test
    public void testGetFirstFiscalDateInCurrentCalendarYear() {
        LocalDate i;
        LocalDate j;

        i = fiscalDate.getFirstFiscalDateInCurrentCalendarYear(fiscalStartMonthName);
        j = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), 1);
        Assert.assertEquals(i.compareTo(j), 0);
    }

    @Test
    public void testGetLastFiscalDate() {
        int i = fiscalDate.getLastFiscalDate(fiscalStartMonthName, inputDate1ToTestMethod)
                .compareTo(expectedOutputLastFiscalDate1);
        Assert.assertEquals(i, 0);
    }
}
