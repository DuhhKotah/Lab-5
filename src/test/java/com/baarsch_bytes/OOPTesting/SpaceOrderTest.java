package com.baarsch_bytes.OOPTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SpaceOrderTest {

    @ParameterizedTest
    @CsvFileSource(resources="/AcceptOrderTestsConstructor.csv",  numLinesToSkip = 1)
    public void testConstuctor(String testCase, boolean special, boolean isSpecial, boolean isAccept) {
        SpaceOrder order = new SpaceOrder(special);
        assertEquals(isSpecial, order.isSpecial());
        assertEquals(isAccept, order.isAccept());
    }

    @Test
    public void testDefaultConstructor() {
        int maxSize = 1024, normalMin = 16, absoluteMin = 0;
        SpaceOrder order = new SpaceOrder();
        assertFalse(order.isSpecial());
        assertFalse(order.isAccept());
        assertEquals(maxSize, order.MAX_SIZE);
        assertEquals(normalMin, order.NORMAL_MIN_SIZE);
        assertEquals(absoluteMin, order.ABSOLUTE_MIN_SIZE);
    }

    @ParameterizedTest
    @CsvFileSource(resources="/AcceptOrderTestsAcceptOrder.csv",  numLinesToSkip = 1)
    public void testAcceptOrder(String testCase, boolean special, int space,
                                boolean exp_results, boolean exp_accept) {
        SpaceOrder order = new SpaceOrder(special);
        assertEquals(exp_results, order.acceptOrder(space));
        assertEquals(exp_accept, order.isAccept());
    }

}
