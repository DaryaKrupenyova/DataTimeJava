package main;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateFunctions {
    // Дашины функции
    public LocalDate getEndOfMonth(LocalDate date) {
        return date.with(TemporalAdjusters.lastDayOfMonth());
    }

    public int getQuarter(LocalDate date) {
        // return (date.getMonthValue() - 1) / 2 + 1; // wrong line
        return (date.getMonthValue() - 1) / 3 + 1; // correct line
    }

    public long monthsDifference(LocalDate date1, LocalDate date2) {
        return ChronoUnit.MONTHS.between(date1, date2);
    }

    public LocalDate addMonthsToDate(LocalDate date, int months) {
        return date.plusMonths(months);
    }

    public LocalDate addYearsToDate(LocalDate date, int years) {
        return date.plusYears(years);
    }

}