package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void shouldSum() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAvg() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.avg(sales);

        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAboveAvg() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveAvg(sales);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcLowerAvg() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.lowerAvg(sales);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthBigSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSales(sales);

        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthLowSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSales(sales);

        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthMaxSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSales(sales);

        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
}