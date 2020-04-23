package com.github.rajkumarvenkatasamy.fiscalcalendar;

import java.time.LocalDate;
import java.time.Month;

//Builder Pattern Class
public class FiscalCalendar {
    private final LocalDate firstFiscalDate;
    private final LocalDate lastFiscalDate;
    private final int fiscalDayOfYear;
    private final int fiscalWeekOfYear;
    private final int fiscalMonthOfYear;
    private final Month lastFiscalMonth;
    private final int fiscalQuarterOfYear;
    private final int fiscalHalfOfYear;
    private final int fiscalYear;

    private FiscalCalendar(FiscalCalendarBuilder builder) {
        FiscalDate fiscalDate = new FiscalDate();
        FiscalWeek fiscalWeek = new FiscalWeek();
        FiscalMonth fiscalMonth = new FiscalMonth();
        FiscalQuarter fiscalQuarter = new FiscalQuarter();
        FiscalHalfYear fiscalHalfYear = new FiscalHalfYear();
        FiscalYear fiscalYear = new FiscalYear();

        this.firstFiscalDate = fiscalDate.getFirstFiscalDate(builder.startMonthOfFiscalCalendar, builder.inputDate);
        this.lastFiscalDate = fiscalDate.getLastFiscalDate(builder.startMonthOfFiscalCalendar, builder.inputDate);
        this.fiscalDayOfYear = fiscalDate.getFiscalDayOfYear(builder.startMonthOfFiscalCalendar, builder.inputDate);
        this.fiscalWeekOfYear = fiscalWeek.getFiscalWeekOfYear(builder.startMonthOfFiscalCalendar, builder.inputDate);
        this.fiscalMonthOfYear = fiscalMonth.getFiscalMonthOfYear(builder.startMonthOfFiscalCalendar, builder.inputDate);
        this.lastFiscalMonth = fiscalMonth.getLastFiscalMonth(builder.startMonthOfFiscalCalendar);
        this.fiscalQuarterOfYear = fiscalQuarter.getFiscalQuarterOfYear(
                builder.startMonthOfFiscalCalendar, builder.inputDate);
        this.fiscalHalfOfYear = fiscalHalfYear.getFiscalHalfOfYear(
                builder.startMonthOfFiscalCalendar, builder.inputDate);
        this.fiscalYear = fiscalYear.getFiscalYear(builder.startMonthOfFiscalCalendar, builder.inputDate);

    }


    public LocalDate getFirstFiscalDate() {
        return firstFiscalDate;
    }

    public LocalDate getLastFiscalDate() {
        return lastFiscalDate;
    }

    public int getFiscalDayOfYear() {
        return fiscalDayOfYear;
    }

    public int getFiscalWeekOfYear() {
        return fiscalWeekOfYear;
    }

    public int getFiscalMonthOfYear() {
        return fiscalMonthOfYear;
    }

    public Month getLastFiscalMonth() {
        return lastFiscalMonth;
    }

    public int getFiscalQuarterOfYear() {
        return fiscalQuarterOfYear;
    }

    public int getFiscalHalfOfYear() {
        return fiscalHalfOfYear;
    }

    public int getFiscalYear() {
        return fiscalYear;
    }

    @Override
    public String toString() {
        return "FiscalCalendarAttributes{" +
                "firstFiscalDate=" + firstFiscalDate +
                ", lastFiscalDate=" + lastFiscalDate +
                ", fiscalDayOfYear=" + fiscalDayOfYear +
                ", fiscalWeekOfYear=" + fiscalWeekOfYear +
                ", fiscalMonthOfYear=" + fiscalMonthOfYear +
                ", lastFiscalMonth=" + lastFiscalMonth +
                ", fiscalQuarterOfYear=" + fiscalQuarterOfYear +
                ", fiscalHalfOfYear=" + fiscalHalfOfYear +
                ", fiscalYear=" + fiscalYear +
                '}';
    }

    public static class FiscalCalendarBuilder {
        private final Month startMonthOfFiscalCalendar;
        private final LocalDate inputDate;


        public FiscalCalendarBuilder(Month pStartMonthOfFiscalCalendar, LocalDate pInputDate) {
            this.startMonthOfFiscalCalendar = pStartMonthOfFiscalCalendar;
            this.inputDate = pInputDate;
        }

        public FiscalCalendar build() {
            FiscalCalendar fiscalCalendar = new FiscalCalendar(this);
            return fiscalCalendar;
        }

    }
}
