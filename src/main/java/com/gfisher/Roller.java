package com.gfisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by GeorgeFisher on 7/21/15.
 */
public class Roller {

    public List<Integer> diceList = new ArrayList<>();
    public int result;

    Random die = new Random();

    public int roll(int dice, int sides) {
        for (int count = 0; count < dice; count++) {
            int r = die.nextInt(sides) + 1;
            diceList.add(r);
            //public String diceArray = Arrays.toString(diceList.toArray());


        }


        result = diceList.stream().mapToInt(Integer::intValue).sum();
        return result;


    }
}
