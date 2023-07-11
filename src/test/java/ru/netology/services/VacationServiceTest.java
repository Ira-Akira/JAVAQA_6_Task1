package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VacationServiceTest {

    @Test
    public void testCalculate1() {
        VacationService service = new VacationService();

        int actual = service.calculate(10_000, 3_000, 20_000); // актуальный результат
        int expected = 3; // ожидаемый результат (отдых 3 месяца)

        Assertions.assertEquals(expected, actual); // проверка совпадения актуального и ожидаемого
    }

    @Test
    public void testCalculate2() {
        VacationService service = new VacationService();

        int actual = service.calculate(100_000, 60_000, 150_000); // актуальный результат
        int expected = 2; // ожидаемый результат (отдых 2 месяца)

        Assertions.assertEquals(expected, actual); // проверка совпадения актуального и ожидаемого
    }
}
