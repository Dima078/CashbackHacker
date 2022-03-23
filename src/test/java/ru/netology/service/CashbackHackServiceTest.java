package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void souldTestRemain() {
        CashbackHackService service = new CashbackHackService();
        int amout = 800;
        int expected = 200;
        int actual = service.remain(amout);
        assertEquals(actual, expected);
    }

    @Test
    public void souldTestRemainExpected1() {
        CashbackHackService service = new CashbackHackService();
        int amout = 1999;
        int expected = 1;
        int actual = service.remain(amout);
        assertEquals(actual, expected);
    }

    @Test
    public void souldTestRemainExpected999() {
        CashbackHackService service = new CashbackHackService();
        int amout = 1;
        int expected = 999;
        int actual = service.remain(amout);
        assertEquals(actual, expected);
    }

    @Test
    public void souldTestRemainExpected1000() {
        CashbackHackService service = new CashbackHackService();
        int amout = 0;
        int expected = 1000;
        int actual = service.remain(amout);
        assertEquals(actual, expected);
    }

    @Test
    public void souldTestRemainElseExpected1000() {
        CashbackHackService service = new CashbackHackService();
        int amout = 1000;
        int expected = 0;
        int actual = service.remain(amout);
        assertEquals(actual, expected);
    }
}