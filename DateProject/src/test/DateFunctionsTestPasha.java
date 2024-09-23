package test;

import main.DateFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class DateFunctionsTestPasha {
    // Пашины тесты для Дашиных функций
    private DateFunctions dateFunctions = new DateFunctions();

    private LocalDate date1 = LocalDate.of(2022, 6, 15);
    private LocalDate date2 = LocalDate.of(2023, 3, 20);

    @Test
    void testGetEndOfMonth() {
        LocalDate expected = LocalDate.of(2022, 6, 30);
        assertEquals(expected, dateFunctions.getEndOfMonth(date1));
    }

    @Test
    void testGetQuarter() {
        int expected = 2;
        assertEquals(expected, dateFunctions.getQuarter(date1));
    }

    @Test
    void testMonthsDifference() {
        long expected = 9;
        assertEquals(expected, dateFunctions.monthsDifference(date1, date2));
    }

    @Test
    void testAddMonthsToDate() {
        LocalDate expected = LocalDate.of(2022, 9, 15);
        assertEquals(expected, dateFunctions.addMonthsToDate(date1, 3));
    }

    @Test
    void testAddYearsToDate() {
        LocalDate expected = LocalDate.of(2025, 6, 15);
        assertEquals(expected, dateFunctions.addYearsToDate(date1, 3));
    }
}