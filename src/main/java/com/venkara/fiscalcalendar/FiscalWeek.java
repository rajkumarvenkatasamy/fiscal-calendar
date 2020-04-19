package com.venkara.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class FiscalWeek {

    public int getFiscalWeekOfYear(Month fiscalCalendarStartingMonth, LocalDate inputDate) {
        int fiscalWeekOfYear;
        FiscalDate fiscalDate = new FiscalDate();

        LocalDate firstFiscalDateBasedOnGivenDate =
                fiscalDate.getFirstFiscalDate(fiscalCalendarStartingMonth, inputDate);
        fiscalWeekOfYear = (int) (ChronoUnit.WEEKS.between(firstFiscalDateBasedOnGivenDate, inputDate) + 1);
        return fiscalWeekOfYear;
    }
}
