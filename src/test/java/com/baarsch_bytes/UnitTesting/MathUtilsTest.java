package com.baarsch_bytes.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MathUtilsTest {


@ParameterizedTest
    @CsvFileSource(resources="/range_tests.csv")
    public void inRangeTests(int x, int min, int max, boolean flag, boolean expected) {
    MathUtils utils = new MathUtils();
    assertEquals(expected,
            utils.inRange(x, min, max, flag),
            "Test Failed on X: " + x
                + " min: " + min
                + " max: " + max
                + " flag: " + flag);
}





}
