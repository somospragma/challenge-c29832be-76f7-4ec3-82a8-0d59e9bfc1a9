package com.pragma.orders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    private OrderService orderService = new OrderService();

    @Test
    public void testCreateOrder() {
        String result = orderService.createOrder("Product1", 10);
        assertEquals("Order created for Product1 with quantity 10", result);
    }

    @Test
    public void testCreateOrderWithZeroQuantity() {
        String result = orderService.createOrder("Product2", 0);
        assertEquals("Order created for Product2 with quantity 0", result);
    }

    @Test
    public void testCreateOrderWithNegativeQuantity() {
        String result = orderService.createOrder("Product3", -5);
        assertEquals("Order created for Product3 with quantity -5", result);
    }
}