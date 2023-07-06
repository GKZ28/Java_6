package ru.netology.stats;

public class StatsService {

    //количество месяцев, в которых продажи были ниже среднего (см. п.2);
    //количество месяцев, в которых продажи были выше среднего (см. п.2).

    public int sumAllMonths(int[] sales) {    //СУММА ВСЕХ ПРОДАЖ
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum += sales[i];
        }
        return totalSum;
    }

    public int averageSalesAmount(int[] sales) {    //СРЕДНЯЯ СУММА ПРОДАЖ В МЕСЯЦ
        int averageSum = (sumAllMonths(sales) / 12);
        return averageSum;
    }

    public int maxSales(int[] sales) {  //НОМЕР МЕСЯЦА В КОТОРОМ БЫЛ ПИК ПРОДАЖ;
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(int[] sales) { //НОМЕР МЕСЯЦА С МИНИМАЛЬНЫМ КОЛИЧЕСТВОМ ПРОДАЖ;
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverageSalesMonths(int[] sales) {    //СУММА МЕСЯЦЕВ С ПРОДАЖАМИ НИЖЕ СРЕДНЕГО

        int belowAverage = 0;
        int average = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
    public int aboveAverageSalesMonths(int[] sales) {    //СУММА МЕСЯЦЕВ С ПРОДАЖАМИ ВЫШЕ СРЕДНЕГО

        int aboveAverage = 0;
        int average = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }



}





//    public int minSalesAmount (int[] sales) {
//        int minSalesAmount = sales[0];
//        for ( int t : sales) {
//            if (t < minSalesAmount) {
//                minSalesAmount = t;
//            }
//        }
//        return minSalesAmount;
//    }
//
//    public int minSalesAmount2 (int[] sales) {
//        int minSalesAmount = minSalesAmount(sales);
//        return sales[minSalesAmount];
//      }
//
//}
