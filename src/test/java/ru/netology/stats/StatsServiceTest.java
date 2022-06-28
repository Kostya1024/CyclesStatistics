package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StatsServiceTest {

    @Test
    public void shouldSumOfAllSales() {
        StatsService allSales = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = allSales.sumOfAllSales(months);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageMonthlySales() {
        StatsService allSales = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberOfMonths = 12;
        int averageSalesAmount = allSales.sumOfAllSales(months);

        StatsService averageAmount = new StatsService();

        int actual = averageAmount.averageMonthlySales(averageSalesAmount, numberOfMonths);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMonthWithTheBighestSales() {
        StatsService monthWithHighestSales = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] monthsWithTheBighestSales = monthWithHighestSales.monthWithTheBighestSales(months);

        String actual = Arrays.toString(monthsWithTheBighestSales);
        String expected = "[6, 8]";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMonthWithMinimumSales() {
        StatsService monthWithMinimumSales = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] monthTheMinimumSales = monthWithMinimumSales.monthWithMinimumSales(months);

        String actual = Arrays.toString(monthTheMinimumSales);
        String expected = "[9]";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfMonthsWithBelowAverageSales() {
        StatsService numberOfMonthsWithMinimalSales = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = numberOfMonthsWithMinimalSales.numberOfMonthsWithBelowAverageSales(months);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfMonthsWithAboveAverageSales() {
        StatsService numberOfMonthsWithMaxSales = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = numberOfMonthsWithMaxSales.numberOfMonthsWithAboveAverageSales(months);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
