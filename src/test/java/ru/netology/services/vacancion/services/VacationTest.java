package ru.netology.services.vacancion.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testCashVacation(int expected, int income, int expenses, int threshold) {
        Vacation service = new Vacation();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
