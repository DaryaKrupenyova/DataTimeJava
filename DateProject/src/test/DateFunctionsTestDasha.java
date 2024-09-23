package test;

import main.DateFunctions;
import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateFunctionsTestDasha {
    // Дашины тесты для Пашиных функций
    private DateFunctions dateFunctions = new DateFunctions();

    @Test
    void testIsWeekend() {
        LocalDate date = LocalDate.of(2022, 6, 15);
        assertFalse(dateFunctions.isWeekend(date));

        date = LocalDate.of(2022, 6, 19);
        assertTrue(dateFunctions.isWeekend(date));
    }

    @Test
    void testTimeDifferenceInHoursMinutes() {
        LocalTime time1 = LocalTime.of(10, 0);
        LocalTime time2 = LocalTime.of(12, 30);
        String result = dateFunctions.timeDifferenceInHoursMinutes(time1, time2);
        assertEquals("2 hours, 30 minutes", result);
    }

    @Test
    void testUtcToLocal() {
        ZonedDateTime utcDateTime = ZonedDateTime.of(2023, 3, 18, 10, 0, 0, 0, ZoneId.of("UTC"));
        ZonedDateTime localDateTime = dateFunctions.utcToLocal(utcDateTime);
        assertEquals(ZoneId.systemDefault(), localDateTime.getZone());
    }

    @Test
    void testDaysInMonth() {
        int year = 2023;
        int month = 3;
        int days = dateFunctions.daysInMonth(year, month);
        assertEquals(31, days);
    }

    @Test
    void testIsFutureDate() {
        LocalDate date = LocalDate.of(2125, 10, 22);
        assertTrue(dateFunctions.isFutureDate(date));

        date = LocalDate.of(2023, 3, 15);
        assertFalse(dateFunctions.isFutureDate(date));
    }
}