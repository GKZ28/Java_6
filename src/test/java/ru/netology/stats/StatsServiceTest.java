package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds () {
        StatsService service = new StatsService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 1;
        int actualMonth = service.minSales(sales);

        // Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println("Сумма всех продаж: " + service.sumAllMonths(sales));
        System.out.println("Средняя сумма продаж в месяц: " + service.averageSalesAmount(sales));
        System.out.println("Номер месяца с максимальными продажами: " + service.maxSales(sales));
        System.out.println("Продаж в месяце: " + service.minSalesAmount(sales));
        System.out.println("Месяц с мин. продажами: " + service.minSales(sales));
    }

}
