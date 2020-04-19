package com.venkara.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;

public class FiscalYear {
    public int getFiscalYear(Month startMonthOfFiscalCalendar, LocalDate inputDate) {
        int fiscalYear;
        LocalDate firstFiscalDate = LocalDate.of(inputDate.getYear(), startMonthOfFiscalCalendar, 1);
        if (inputDate.isBefore(firstFiscalDate)) {
            fiscalYear = inputDate.getYear() - 1;
        } else {
            fiscalYear = inputDate.getYear();
        }

        return fiscalYear;
    }

}
