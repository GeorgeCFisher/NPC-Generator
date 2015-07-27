package com.gfisher;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GeorgeFisher on 7/27/15.
 */
public class RollerTest {
    @Test
    public void testexpectedrange() {
        Roller test = new Roller();
        test.roll(3, 6);
        assertTrue(test.result < 19);
        assertTrue(test.result > 2);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testnodice()
    {
        Roller test = new Roller();
        test.roll(0,6);
    }

}
