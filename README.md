# Getting Started

### About - Fiscal Calendar Library

In general, a fiscal calendar involves a period of 12 months, that an organization uses to report its accounting details. It starts at the beginning of a quarter, such as January 1, April 1, July 1, or October 1 based on the choice of the entity involved. The entity can be a corporate, government, or nonprofit.

I have developed this library as part of another project which deals with building Date and Time dimension for Business Intelligence application. Some customers would like to do the data analysis based on Fiscal calendar and hence I thought to have a date dimension which deals with regular calendar year attributes along with fiscal calendar attributes. This is how this Fiscal Calendar library emerged. 

If you want to deal with the attributes related to Fiscal calendar such as: 

- Fiscal Day of Year
- Fiscal Month of Year
- Fiscal Week of Year
- Fiscal Quarter of year
- Fiscal Half of Year
- Fiscal Year

then you could make use of this simple library.


### Pre-requisite

* Java 8

### Usage

Since the starting month of a Fiscal calendar can vary based on the choice of the Entity, this library expects the Fiscal Month as one of the inputs.

This package has different classes 

* FiscalDate
* FiscalWeek
* FiscalMonth
* FiscalQuarter
* FiscalHalfYear
* FiscalYear

based on the level of the time period which needs to be dealt with. 

**For instance:** Given the starting month of Fiscal Calendar as April and you wanted to know the Fiscal day of year for the given date "2020-07-04", you can use *"FiscalDate"* class by intantiating it and call the method *"getFiscalDayOfYear"*

---
*Java code snippet*
```Java
FiscalDate fiscalDate = new FiscalDate();
fiscalDate.getFiscalDayOfYear(Month.APRIL, LocalDate.of(2020,7,4));
```
---

Other methods in FiscalDate class are

- getFirstFiscalDate(java.time.Month startMonthOfFiscalCalendar, java.time.LocalDate inputDate)  
- getLastFiscalDate(java.time.Month startMonthOfFiscalCalendar, java.time.LocalDate inputDate)  
- getFirstFiscalDateInCurrentCalendarYear(java.time.Month startMonthOfFiscalCalendar) 

Similarly to get the Fiscal Month of year for a given date, use the *"FiscalMonth"* class and its method *"getFiscalMonthOfYear"*

---
*Java code snippet*
```Java
FiscalMonth fiscalMonth = new FiscalMonth();
fiscalMonth.getFiscalMonthOfYear(Month.JULY, LocalDate.of(2020,7,4));
```
---

To understand the various methods and data type of the parameters in this library, you might need to clone the repository in your machine to view the *JavaDoc/index.html* file in browser. 

### Integration

Sooner the project will be made available in Maven Central. Until then use the jar available in **"build/libs"** directory as dependency in your project  

### Build
You can clone the repository and build the jar from source code using gradle

```shell
cd <Project Directory>
gradlew build
```
