package com.github.rajkumarvenkatasamy.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class FiscalDate {
    public LocalDate getFirstFiscalDateInCurrentCalendarYear(Month startMonthOfFiscalCalendar) {
        LocalDate firstFiscalDateInCurrentCalendarYear;
        LocalDate localDate = LocalDate.now();
        firstFiscalDateInCurrentCalendarYear = LocalDate.of(localDate.getYear(), startMonthOfFiscalCalendar.getValue(),
                1);

        return firstFiscalDateInCurrentCalendarYear;
    }

    public LocalDate getFirstFiscalDate(Month startMonthOfFiscalCalendar, LocalDate inputDate) {
        LocalDate firstFiscalDateBasedOnGivenDate;
        FiscalYear fiscalYear = new FiscalYear();
        int month = startMonthOfFiscalCalendar.getValue();
        int year = fiscalYear.getFiscalYear(startMonthOfFiscalCalendar, inputDate);

        firstFiscalDateBasedOnGivenDate = LocalDate.of(year, month,
                1);

        return firstFiscalDateBasedOnGivenDate;
    }

    public int getFiscalDayOfYear(Month startMonthOfFiscalCalendar, LocalDate inputDate) {
        int fiscalDay;
        LocalDate firstFiscalDateBasedOnGivenDate;
        firstFiscalDateBasedOnGivenDate = getFirstFiscalDate(startMonthOfFiscalCalendar, inputDate);
        fiscalDay = (int) (ChronoUnit.DAYS.between(firstFiscalDateBasedOnGivenDate, inputDate) + 1);
        return fiscalDay;
    }

    public LocalDate getLastFiscalDate(Month startMonthOfFiscalCalendar, LocalDate inputDate) {
        LocalDate lastFiscalDate;

        lastFiscalDate = getFirstFiscalDate(startMonthOfFiscalCalendar, inputDate).plusMonths(11)
                .with(TemporalAdjusters.lastDayOfMonth());
        return lastFiscalDate;
    }

}
