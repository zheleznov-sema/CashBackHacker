package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceJUnit4 {

    @Test
    public void testRemain900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain1100_shouldFail() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}

