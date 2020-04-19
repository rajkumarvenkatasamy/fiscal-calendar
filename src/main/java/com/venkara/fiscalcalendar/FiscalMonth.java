package com.venkara.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class FiscalMonth {

    protected Map<Month, Integer> getFiscalMonthAndValue(Month fiscalCalendarStartingMonth) {
        Map<Month, Integer> fiscalCalendarMap = new HashMap<>();

        for (int i = 0; i <= 11; i++) {
            fiscalCalendarMap.put(fiscalCalendarStartingMonth.plus(i), i + 1);
        }
        return fiscalCalendarMap;
    }

    public int getFiscalMonthOfYear(Month fiscalCalendarStartingMonth, LocalDate inputDate) {
        int fiscalMonth;
        FiscalMonth fiscalMonthObj = new FiscalMonth();
        Map<Month, Integer> hm = fiscalMonthObj.getFiscalMonthAndValue(fiscalCalendarStartingMonth);
        fiscalMonth = hm.get(inputDate.getMonth());

        return fiscalMonth;
    }

    public Month getLastFiscalMonth(Month fiscalCalendarStartingMonth) {
        Month lastFiscalMonth;
        lastFiscalMonth = fiscalCalendarStartingMonth.plus(11);
        return lastFiscalMonth;
    }

}
