package com.venkara.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;

public class FiscalQuarter {

    public int getFiscalQuarterOfYear(Month fiscalCalendarStartingMonth, LocalDate inputDate) {
        int fiscalQuarter;
        FiscalMonth fiscalMonth = new FiscalMonth();
        Map<Month, Integer> hm = fiscalMonth.getFiscalMonthAndValue(fiscalCalendarStartingMonth);
        fiscalQuarter = getFiscalQuarterOfYear(hm.get(inputDate.getMonth()));
        return fiscalQuarter;
    }

    protected int getFiscalQuarterOfYear(int inputFiscalMonthValue) {
        int fiscalQuarter = 0;

        switch (inputFiscalMonthValue) {
            case 1:
            case 2:
            case 3: {
                fiscalQuarter = 1;
                break;
            }
            case 4:
            case 5:
            case 6: {
                fiscalQuarter = 2;
                break;
            }
            case 7:
            case 8:
            case 9: {
                fiscalQuarter = 3;
                break;
            }
            case 10:
            case 11:
            case 12: {
                fiscalQuarter = 4;
                break;
            }
        }
        return fiscalQuarter;
    }

}
