package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int arrayLength = sales.length;

        StatsService allSales = new StatsService();
        int sumOfAllSales = allSales.sumOfAllSales(sales);
        System.out.println(sumOfAllSales);      //Сумма всех продаж

        StatsService averageAmount = new StatsService();
        int averageMonthlySales = averageAmount.averageMonthlySales(sumOfAllSales, arrayLength);
        System.out.println(averageMonthlySales);        //Средняя сумма продаж в месяц

        StatsService monthWithHighestSales = new StatsService();
        int[] monthsHighestSales = monthWithHighestSales.monthWithTheBighestSales(sales);
        String intMonthsHighestSales = Arrays.toString(monthsHighestSales);     //приведение массива к строке
        System.out.println(intMonthsHighestSales);      //Номера месяцев, в которых были пики продаж

        StatsService monthWithMinimumSales = new StatsService();
        int[] monthsMinimumSales = monthWithMinimumSales.monthWithMinimumSales(sales);
        String intMonthsMinimumSales = Arrays.toString(monthsMinimumSales);     //приведение массива к строке
        System.out.println(intMonthsMinimumSales);      //Номера месяцев, в которых были минимумы продаж

        StatsService numberOfMonthsWithMinSales = new StatsService();
        int MonthsWithBelowAverageSales = numberOfMonthsWithMinSales.numberOfMonthsWithBelowAverageSales(sales);
        System.out.println(MonthsWithBelowAverageSales);    //Количество месяцев, в которых продажи были ниже среднего

        StatsService numberOfMonthsWithMaxSales = new StatsService();
        int MonthsWithAboveAverageSales = numberOfMonthsWithMaxSales.numberOfMonthsWithAboveAverageSales(sales);
        System.out.println(MonthsWithAboveAverageSales);    //Количество месяцев, в которых продажи были выше среднего
    }
}
