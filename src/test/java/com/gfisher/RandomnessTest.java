package com.gfisher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomnessTest {

    @Test
    public void testRandomness() {
        Roller roller = new Roller();

        roller.setRandomness(
                range -> 1
        );

        roller.roll(3, 6);

        assertEquals(6, roller.result);

    }

}
