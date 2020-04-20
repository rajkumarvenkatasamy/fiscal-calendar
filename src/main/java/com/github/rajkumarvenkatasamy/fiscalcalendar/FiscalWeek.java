package com.github.rajkumarvenkatasamy.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class FiscalWeek {

    public int getFiscalWeekOfYear(Month startMonthOfFiscalCalendar, LocalDate inputDate) {
        int fiscalWeekOfYear;
        FiscalDate fiscalDate = new FiscalDate();

        LocalDate firstFiscalDateBasedOnGivenDate =
                fiscalDate.getFirstFiscalDate(startMonthOfFiscalCalendar, inputDate);
        fiscalWeekOfYear = (int) (ChronoUnit.WEEKS.between(firstFiscalDateBasedOnGivenDate, inputDate) + 1);
        return fiscalWeekOfYear;
    }
}
