package org.example.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GasStation_134Test {

    GasStation_134 gasStation_134Test;

    @BeforeEach
    void setUp() {
        gasStation_134Test = new GasStation_134();
    }


    @Test
    void canCompleteCircuit() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        assertEquals(3, gasStation_134Test.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit2() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        assertEquals(-1, gasStation_134Test.canCompleteCircuit(gas, cost));
    }

}