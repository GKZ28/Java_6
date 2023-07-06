package ru.netology.stats;

public class StatsService {


    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    //количество месяцев, в которых продажи были ниже среднего (см. п.2);
    //количество месяцев, в которых продажи были выше среднего (см. п.2).

    public int sumAllMonths (int[] sales) {    //СУММА ВСЕХ ПРОДАЖ
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum += sales[i];
        }
        return totalSum;
    }

    public int averageSalesAmount (int[] sales) {    //СРЕДНЯЯ СУММА ПРОДАЖ В МЕСЯЦ
        int averageSum = (sumAllMonths(sales) / 12);
        return averageSum;
    }

    public int maxSales(int[] sales) {  //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSalesAmount (int[] sales) {
        int minSalesAmount = sales[0];
        for ( int t : sales) {
            if (t < minSalesAmount) {
                minSalesAmount = t;
            }
        }
        return minSalesAmount;
    }

    public int minSalesAmount2 (int[] sales) {
        int minSalesAmount = minSalesAmount(sales);
        return sales[minSalesAmount];
      }

}
