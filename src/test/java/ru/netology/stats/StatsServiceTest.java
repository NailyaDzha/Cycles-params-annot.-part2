package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void ShouldCalculateSum() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(factorySales);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateAvg() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAvg(factorySales);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMinMonth() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(factorySales);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMaxMonth() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(factorySales);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMonthBelowAvg() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAvg(factorySales);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateMonthAboveAvg() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAvg(factorySales);
        assertEquals(expected, actual);
    }
    }
