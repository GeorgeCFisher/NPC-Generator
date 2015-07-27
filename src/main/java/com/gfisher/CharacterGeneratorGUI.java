package com.gfisher;

import javax.swing.*;
import java.awt.*;

/**
 * Created by GeorgeFisher on 7/21/15.
 */
public class CharacterGeneratorGUI {
    private JPanel statPanel;
    private JButton statRoll;
    private JTextArea statDisplay;
    private JComboBox raceComboBox;


    public void init() {
        //Upon button press, create StatRoller, display generated stats.
        statRoll.addActionListener(e -> {
            StatRoller attribute = new StatRoller();
            attribute.genStats();

            statDisplay.setText("Strength:" + attribute.STR
                    + "\n" + "Dexterity:" + attribute.DEX
                    + "\n" + "Constitution:" + attribute.CON
                    + "\n" + "Intelligence:" + attribute.INT
                    + "\n" + "Wisdom:" + attribute.WIS
                    + "\n" + "Charisma:" + attribute.CHA);
        });

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Stats");

        //Create the core object
        CharacterGeneratorGUI core = new CharacterGeneratorGUI();

        //Attache the new Core panel to the host frame
        frame.setContentPane(core.statPanel);

        // Make sure we set up the core correctly
        core.init();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(400, 600));
    }
}
