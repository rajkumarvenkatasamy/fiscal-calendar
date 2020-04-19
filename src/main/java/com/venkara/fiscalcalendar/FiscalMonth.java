package com.venkara.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class FiscalMonth {

    protected Map<Month, Integer> getFiscalMonthAndValue(Month startMonthOfFiscalCalendar) {
        Map<Month, Integer> fiscalCalendarMap = new HashMap<>();

        for (int i = 0; i <= 11; i++) {
            fiscalCalendarMap.put(startMonthOfFiscalCalendar.plus(i), i + 1);
        }
        return fiscalCalendarMap;
    }

    public int getFiscalMonthOfYear(Month startMonthOfFiscalCalendar, LocalDate inputDate) {
        int fiscalMonth;
        FiscalMonth fiscalMonthObj = new FiscalMonth();
        Map<Month, Integer> hm = fiscalMonthObj.getFiscalMonthAndValue(startMonthOfFiscalCalendar);
        fiscalMonth = hm.get(inputDate.getMonth());

        return fiscalMonth;
    }

    public Month getLastFiscalMonth(Month startMonthOfFiscalCalendar) {
        Month lastFiscalMonth;
        lastFiscalMonth = startMonthOfFiscalCalendar.plus(11);
        return lastFiscalMonth;
    }

}
