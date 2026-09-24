package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ElectricityBillTest {

    @Test
    void testZeroUnits() {
        assertEquals(0.0, ElectricityBill.calculateBill(0));
    }

    @Test
    void test100Units() {
        assertEquals(150.0, ElectricityBill.calculateBill(100));
    }

    @Test
    void test150Units() {
        assertEquals(275.0, ElectricityBill.calculateBill(150));
    }

    @Test
    void test250Units() {
        assertEquals(600.0, ElectricityBill.calculateBill(250));
    }

    @Test
    void test600Units() {
        assertEquals(2200.0, ElectricityBill.calculateBill(600));
    }

    @Test
    void testNegativeUnits() {
        assertThrows(
            IllegalArgumentException.class,
            () -> ElectricityBill.calculateBill(-10)
        );
    }
}