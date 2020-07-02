package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] array = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum() {
        int expected = 180;
        int actual = service.sum(array);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAverage() {
        assertEquals(15, service.average(array));
    }

    @Test
    void shouldMaxSale() {
        int expected = 8;
        int actual = service.FindMonthMaxSale(array);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSale() {
        int expected = 9;
        int actual = service.FindMonthMinSale(array);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthCountLessThenAverage() {
        int expected = 5;
        int actual = service.MonthCountLessThenAverage(array);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthCountMoreThenAverage() {
        int expected = 5;
        int actual = service.MonthCountMoreThenAverage(array);

        assertEquals(expected, actual);
    }
}