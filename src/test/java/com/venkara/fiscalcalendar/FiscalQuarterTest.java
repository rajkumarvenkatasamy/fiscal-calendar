package com.venkara.fiscalcalendar;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FiscalQuarterTest {
    private FiscalQuarter fiscalQuarter = new FiscalQuarter();

    //inputs
    private LocalDate inputDate1ToTestMethod = LocalDate.of(2019, 5, 4);
    private LocalDate inputDate2ToTestMethod = LocalDate.of(2019, 2, 4);
    private Month fiscalStartMonthName = Month.APRIL;

    //expected outputs
    private int expectedFiscalQuarterOfYear1 = 1;
    private int expectedFiscalQuarterOfYear2 = 4;

    @Test
    public void testGetFiscalMonthOfYear() {
        int i;
        i = fiscalQuarter.getFiscalQuarterOfYear(fiscalStartMonthName, inputDate1ToTestMethod);
        Assert.assertEquals(i, expectedFiscalQuarterOfYear1);

        i = fiscalQuarter.getFiscalQuarterOfYear(fiscalStartMonthName, inputDate2ToTestMethod);
        Assert.assertEquals(i, expectedFiscalQuarterOfYear2);
    }

}
