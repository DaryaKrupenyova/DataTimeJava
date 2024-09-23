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

    // Пашины функции
    public boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    public String timeDifferenceInHoursMinutes(LocalTime time1, LocalTime time2) {
        Duration duration = Duration.between(time1, time2).abs();
        long hours = duration.toHours();
        // long minutes = duration.toMinutesPart() + 10; // wrong line
        long minutes = duration.toMinutesPart(); // correct line
        return hours + " hours, " + minutes + " minutes";
    }

    public ZonedDateTime utcToLocal(ZonedDateTime utcDateTime) {
        return utcDateTime.withZoneSameInstant(ZoneId.systemDefault());
    }

    public int daysInMonth(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }

    public boolean isFutureDate(LocalDate date) {
        return date.isAfter(LocalDate.now());
    }

}