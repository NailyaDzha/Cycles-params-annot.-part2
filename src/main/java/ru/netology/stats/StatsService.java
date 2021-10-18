package ru.netology.stats;

//Сумма всех продаж
public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            //   sum = sum + sale; либо:
            sum += sale;

        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;

    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int monthsBelowAvg(int[] sales) {
        int averageSale = calculateAvg(sales);
        int month = 0;
        for (int sale : sales) {

            if (sale < averageSale) {
                month += 1;
            }

        }
        return month;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int monthsAboveAvg(int[] sales) {
        int averageSale = calculateAvg(sales);
        int month = 0;
        for (int sale : sales) {

            if (sale > averageSale) {
                month += 1;
            }

        }
        return month;
    }
}










