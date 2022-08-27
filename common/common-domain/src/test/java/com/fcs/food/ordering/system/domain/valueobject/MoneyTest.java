package com.fcs.food.ordering.system.domain.valueobject;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void shouldReturnGreaterThanZero() {
        var money = new Money(BigDecimal.TEN);
        assertTrue(money.isGreaterThanZero());
    }

    @Test
    void shouldNotReturnGreaterThanZero() {
        var money = new Money(BigDecimal.ZERO);
        assertFalse(money.isGreaterThanZero());
    }

    @Test
    void shouldReturnTrueIfItsGreaterThan() {
        var money = new Money(BigDecimal.TEN);
        assertTrue(money.isGreaterThan(new Money(BigDecimal.ONE)));
    }

    @Test
    void shouldNotReturnTrueIfItsGreaterThan() {
        var money = new Money(BigDecimal.ONE);
        assertFalse(money.isGreaterThan(new Money(BigDecimal.TEN)));
    }

    @Test
    void shouldAddMoneyTo() {
        var money = new Money(BigDecimal.TEN);
        var expectedMoney = new Money(BigDecimal.valueOf(11).setScale(2, RoundingMode.HALF_EVEN));
        var calculatedMoney = money.add(new Money(BigDecimal.ONE));
        assertEquals(expectedMoney.getAmount(), calculatedMoney.getAmount());
    }

    @Test
    void shouldSubtractMoneyTo() {
        var money = new Money(BigDecimal.TEN);
        var expectedMoney = new Money(BigDecimal.valueOf(9).setScale(2, RoundingMode.HALF_EVEN));
        var calculatedMoney = money.subtract(new Money(BigDecimal.ONE));
        assertEquals(expectedMoney.getAmount(), calculatedMoney.getAmount());
    }

    @Test
    void shouldMultiplyMoneyTo() {
        var money = new Money(BigDecimal.TEN);
        var expectedMoney = new Money(BigDecimal.valueOf(50).setScale(2, RoundingMode.HALF_EVEN));
        var calculatedMoney = money.multiply(5);
        assertEquals(expectedMoney.getAmount(), calculatedMoney.getAmount());
    }
}