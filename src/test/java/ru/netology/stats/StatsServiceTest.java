package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds () {
        StatsService service = new StatsService();
        int [] sales = { 15, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 20};

        int expectedMonth = 1;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}
