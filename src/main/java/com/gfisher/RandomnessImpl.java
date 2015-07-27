package com.gfisher;

import java.util.Random;

public class RandomnessImpl implements Randomness {

    Random die = new Random();

    @Override
    public int getRandomNumber(int range) {
        return die.nextInt(range);
    }
}
