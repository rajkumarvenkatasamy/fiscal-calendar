package com.venkara.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;

public class FiscalHalfYear {

    public int getFiscalHalfOfYear(Month startMonthOfFiscalCalendar, LocalDate inputDate) {
        int fiscalHalf;
        FiscalMonth fiscalMonth = new FiscalMonth();
        Map<Month, Integer> hm = fiscalMonth.getFiscalMonthAndValue(startMonthOfFiscalCalendar);
        fiscalHalf = getFiscalHalfOfYear(hm.get(inputDate.getMonth()));
        return fiscalHalf;
    }

    protected int getFiscalHalfOfYear(int inputFiscalMonthValue) {

        switch (inputFiscalMonthValue) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                return 1;
            }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12: {
                return 2;
            }
        }
        return 0;
    }

}
