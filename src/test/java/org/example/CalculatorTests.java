package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    Calculator calculator = new Calculator();

    @BeforeAll
    public static void setUp(){
    }

    @ParameterizedTest
    @CsvSource({"1,2,3","1,-1,0"})
    @DisplayName("Тесты сложения")
    @Tag("sum")
    public void testSum(int a, int b, int expected){
         assertEquals(expected,calculator.sum(a,b));
    }

    @ParameterizedTest
    @CsvSource({"2,1,1","1,-1,2"})
    @DisplayName("Тесты вычитания")
    @Tag("sub")
    public void testSub(int a, int b, int expected){
        assertEquals(expected,calculator.sub(a,b));
    }

}
