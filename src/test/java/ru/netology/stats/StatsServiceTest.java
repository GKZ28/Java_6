package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSales () { // НОМЕР МЕСЯЦА С МИНИМАЛЬНЫМ КОЛИЧЕСТВОМ ПРОДАЖ;
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxSales () { //НОМЕР МЕСЯЦА В КОТОРОМ БЫЛ ПИК ПРОДАЖ;
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSumAllMonths () { //СУММА ВСЕХ ПРОДАЖ
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumAllMonths(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }//СРЕДНЯЯ СУММА ПРОДАЖ В МЕСЯЦ

    @Test
    public void shouldFindAverageSalesAmount () { //СРЕДНЯЯ СУММА ПРОДАЖ В МЕСЯЦ
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindBelowAverageSalesMonths () { //СУММА МЕСЯЦЕВ С ПРОДАЖАМИ НИЖЕ СРЕДНЕГО
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.belowAverageSalesMonths(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAboveAverageSalesMonths () { //СУММА МЕСЯЦЕВ С ПРОДАЖАМИ ВЫШЕ СРЕДНЕГО
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.aboveAverageSalesMonths(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}

