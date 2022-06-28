package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;     //возврат суммы всех продаж

    }

    public int averageMonthlySales(int sumOfAllSales, int arrayLength) {
        int averageSalesAmount = sumOfAllSales / arrayLength;

        return averageSalesAmount;      //возврат средней суммы продаж в месяц
    }


    //я знаю, что немного отклонился от условия задачи, при необходимости, переделаю
    public int[] monthWithTheBighestSales(int[] sales) {

        int bighestSales = 0;       //заводим счетчик для нахождения максимльного количества продажи в месяц
        int count = 0;      //заводим счетчик для посчета количества максимальных продаж в имеющихся месяцах
        for (int sale : sales) {
            if (bighestSales < sale) {
                bighestSales = sale;
            }
        }
        for (int sale : sales) {
            if (bighestSales == sale) {
                count++;
            }

        }

        int[] monthTheBighestSales = new int[count];
        //создаем массив на основе количества месяцев с максимальными продажами
        int ii = 0;     //счетчик ячейки массива
        for (int i = 0; i < sales.length; i++) {
            if (bighestSales == sales[i]) {
                monthTheBighestSales[ii] = i + 1;
                ii++;

            }
        }
        return monthTheBighestSales;
        //возврат массива с фактическими (январь - 1 и т.д.) номерами месяцев с максимальными продажами
    }

    //я знаю, что немного отклонился от условия задачи, при необходимости, переделаю
    public int[] monthWithMinimumSales(int[] sales) {

        int minimumSales = sales[0];        //заводим счетчик для нахождения минимального количества продажи в месяц
        int count = 0;      //заводим счетчик для посчета количества минимальных продаж в имеющихся месяцах
        for (int sale : sales) {
            if (minimumSales > sale) {
                minimumSales = sale;
            }
        }
        for (int sale : sales) {
            if (minimumSales == sale) {
                count++;
            }

        }

        int[] monthTheMinimumSales = new int[count];
        //создаем массив на основе количества месяцев с максимальными продажами

        int ii = 0;     //счетчик ячейки массива
        for (int i = 0; i < sales.length; i++) {
            if (minimumSales == sales[i]) {
                monthTheMinimumSales[ii] = i + 1;
                ii++;

            }
        }
        return monthTheMinimumSales;
        //возврат массива с фактическими (январь - 1 и т.д.) номерами месяцев с минимальными продажами
    }

    public int numberOfMonthsWithBelowAverageSales(int[] sales) {
        int sum = 0;
        int countMonth = 0;
        for (int sale : sales) {
            sum += sale;
        }

        int averageSale = sum / sales.length;

        for (int sale : sales) {
            if (averageSale > sale) {
                countMonth++;
            }
        }
        return countMonth;      //возврат количества месяцев с продажами ниже среднего

    }

    public int numberOfMonthsWithAboveAverageSales(int[] sales) {
        int sum = 0;
        int countMonth = 0;
        for (int sale : sales) {
            sum += sale;
        }

        int averageSale = sum / sales.length;

        for (int sale : sales) {
            if (averageSale < sale) {
                countMonth++;
            }
        }
        return countMonth;      //возврат количества месяцев с продажами ниже среднего

    }
}


