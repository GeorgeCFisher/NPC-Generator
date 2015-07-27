package com.gfisher;

import java.util.*;

/**
 * Created by GeorgeFisher on 7/21/15.
 */

public class StatRoller {
    //Create list to store stat rolls.
    public List<Integer> statsList = new ArrayList();
    //Create stat ints.
    public int STR;
    public int DEX;
    public int CON;
    public int INT;
    public int WIS;
    public int CHA;


    //Create int values for each stat. Set equal to Roller results. Allows for GUI to call Roller.str etc.
    public void genStats() {
        //generate stat Rollers.
        Roller str = new Roller();
        Roller dex = new Roller();
        Roller con = new Roller();
        Roller Int = new Roller();
        Roller wis = new Roller();
        Roller cha = new Roller();

        //Roll stats, add them to statsList and set appropriate int to equal result of roll.
        str.roll(3, 6);
        statsList.add(str.result);
        STR = str.result;

        dex.roll(3, 6);
        statsList.add(dex.result);
        DEX = dex.result;

        con.roll(3, 6);
        statsList.add(con.result);
        CON = con.result;

        Int.roll(3, 6);
        statsList.add(Int.result);
        INT = Int.result;

        wis.roll(3, 6);
        statsList.add(wis.result);
        WIS = wis.result;

        cha.roll(3, 6);
        statsList.add(cha.result);
        CHA = cha.result;


    }

}








