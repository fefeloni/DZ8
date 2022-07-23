package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxIncomeEquals() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {6, 6, 5, 1, 2, 4, 3, 5, 1, 4, 1};
        long expected = 6;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxIncomeBelow() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 10, 10, 11, 2, 2, 5, 3, 6, 8, 10};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}